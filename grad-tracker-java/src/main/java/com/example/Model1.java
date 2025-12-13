import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Model1 {
    /*
    * Gets Target
    * Controller.java will handle input
    * */
    public JLabel getTarget() {
        int daysLeft = 0; // Record days left
        int febDay = 28; // Days in february
        String path = "/Img/img.png";
        URL targetURL = getClass().getResource(path);
        JLabel label;

        if (targetURL != null) {
            ImageIcon originalIcon = new ImageIcon(path);
            Image originalImage = originalIcon.getImage();

            int newWidth = 250;
            int newHeight = (int) (originalImage.getHeight(null) * ((double) newWidth / originalImage.getWidth(null)));

            Image scaled = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            label = new JLabel(new ImageIcon(scaled));
        } else {
            label = new JLabel("No Image found");
            label.setPreferredSize(new Dimension(120,120));
        }

        return label;
    }
}
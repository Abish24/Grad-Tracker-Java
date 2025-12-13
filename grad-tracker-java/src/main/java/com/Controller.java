import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Controller1 {
    private final View view;
    private final Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();

        new Controller(view, model);

        view.setVisible(true);
    }
}
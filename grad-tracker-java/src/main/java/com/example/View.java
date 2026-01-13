package com.example;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class View extends JFrame {
    private final JPanel mainMenu;
    private final JPanel playArea;
    private final JButton playButton;

    public View() {
        this.setTitle("Grad Tracker Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setLayout(new BorderLayout());
        //JPanel panel = new JPanel();
        //this.add(panel, BorderLayout.CENTER);

        //Play button
        playButton = new JButton("PLAY");
        playButton.setBounds(50, 50, 100, 50);

        //Game area
        playArea = new JPanel(new BorderLayout());

        //If Play button is pressed
        playButton.addActionListener(e -> {
            this.add(playArea, BorderLayout.CENTER);
        });

        //Aim Game Title
        JTextField title = new JTextField("Target Practice");
        title.setSize(300,200);
        title.setEditable(false);

        //Main menu
        mainMenu = new JPanel(new GridLayout(2, 1));

        //Add all necessary components to main menu
        mainMenu.add(title);
        mainMenu.add(playButton);

        //Put main menu in GUI
        this.add(mainMenu, BorderLayout.CENTER);
    }

    public JPanel getPlayArea() { return playArea; } //returns playArea
}
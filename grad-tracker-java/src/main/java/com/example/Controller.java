package com.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.ConnectException;

public class Controller {
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
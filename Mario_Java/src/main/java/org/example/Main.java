package org.example;

import javax.swing.*;

public class Main {

    public static Scene scene;
    public static void main(String[] args) {
        // creation de la fenetre de l'application
        JFrame window = new JFrame("Mario_Project");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setAlwaysOnTop(true);

        scene = new Scene();

        window.setContentPane(scene);
        window.setVisible(true);

    }
}
package jeu;

import javax.swing.*;
import java.awt.*;

//***** La classe Main gère le flux principal et exécute la méthode main() qui lance l'application *****//
public class Main {

    //**** VARIABLES **//
    public static Scene scene;
    public static Menu menu;
    public static  JFrame fenetre;
    public static CardLayout cardLayout;
    public static JPanel mainPanel;
    public static GameWin gameWin;
    public static GameOver gameOver;


    //**** METHODES **//
    public static void main(String[] args) {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Création de la fenetre de l'application
        fenetre = new JFrame("Jeu style Mario");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(700, 360);
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);
        fenetre.setAlwaysOnTop(true);

        // Instanciation de l'objet menu
        menu = new Menu();
        scene = new Scene();
        gameOver = new GameOver();
        gameWin = new GameWin();

        mainPanel.add(menu,"menu");
        mainPanel.add(scene,"scene");
        mainPanel.add(gameWin,"gameWin");
        mainPanel.add(gameOver,"gameOver");

        cardLayout.show(mainPanel, "menu");

        fenetre.setContentPane(mainPanel);
        fenetre.setVisible(true);
    }

    public static void scene(){
        cardLayout.show(mainPanel, "scene");
        scene.requestFocusInWindow();

    }
    public static void quit(){
        System.exit(0);
    }
    public static void win(){
        cardLayout.show(mainPanel,"gameWin");
    }
    public static void over(){
        cardLayout.show(mainPanel,"gameOver");
    }
}

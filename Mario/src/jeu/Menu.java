package jeu;

import javax.swing.*;


public class Menu extends JPanel {

        //**** VARIABLES ****//
        private JLabel lblFond;
        private JButton lblPlay;

        private JButton lblQuit;

        //**** CONSTRUCTEUR ****//
        public Menu(){
            super();
            this.setLayout(null);

            // Fond
            this.lblFond = new JLabel();
            this.lblFond.setBounds(0, 0, 700, 360);
            this.add(lblFond);

            // Bouton Play

            this.lblPlay = new JButton("PLAY");
            this.lblPlay.addActionListener(e ->
                Main.scene()
            );

            this.lblPlay.setBounds(350-20, 100, 40, 20);
            this.lblFond.add(lblPlay);


            // Bouton Quit
            this.lblQuit = new JButton("QUIT");
            this.lblQuit.setBounds(350-20, 160, 40, 20);
            this.lblQuit.addActionListener(e ->
                    Main.quit()
            );
            this.lblFond.add(lblQuit);
        }
}

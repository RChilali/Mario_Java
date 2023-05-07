package jeu;

import javax.swing.*;

public class GameOver extends JPanel {
    private JLabel lblFond;
    private JButton lblQuit;


    public GameOver(){
        super();
        this.setLayout(null);

        // Fond
        lblFond = new JLabel();
        // add win + score information
        lblFond.setBounds(0, 0, 700, 360);
        add(lblFond);

        // Bouton Quit
        this.lblQuit = new JButton("QUIT");
        this.lblQuit.setBounds(350-20, 160, 40, 20);
        this.lblQuit.addActionListener(e ->
                Main.quit()
        );
        this.lblFond.add(lblQuit);

    }
}

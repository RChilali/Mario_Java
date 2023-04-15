package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Scene extends JFrame {
    private ImageIcon icoFond;
    private Image imgFond1;

    private ImageIcon icoMario;
    private Image imgMario;

    private int xFond1;


    public Scene(){

        super();

        this.xFond1 = -50;

        icoFond = new ImageIcon(getClass().getResource("./images/fondEcran.png"));
        this.imgFond1 = this.icoFond.getImage();
        icoMario = new ImageIcon(getClass().getResource("./images/marioMarcheDroite.png"));
        this.imgMario = this.icoMario.getImage();
    }


    public void paintComponent(Graphics g) {

        super.paintComponents(g);
        Graphics g2 = (Graphics2D)g;

        g2.drawImage(this.imgFond1, this.xFond1, 0, null);
        g2.drawImage(imgMario, 300, 245, null);
    }
}

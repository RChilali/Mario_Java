package objets;

import javax.swing.*;

public class Obstacle extends Objet{

    public Obstacle(int x, int y) {
        super(x, y, 30, 30);
        super.icoObjet = new ImageIcon(getClass().getResource("/images/obstacle.png"));
        super.imgObjet = this.icoObjet.getImage();
    }
}

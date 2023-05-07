package objets;



import javax.swing.*;
import java.awt.*;


public class Piece extends Objet{

    //**** VARIABLES **//
    private Image imgPiece;
    private ImageIcon icoPiece;
    private static int nbPiece = 0;

    //**** CONSTRUCTEURS **//
    public Piece(int x, int y) {
        super(x, y, 30, 30);
        this.icoPiece = new ImageIcon(getClass().getResource("/images/piece.png"));
        this.imgPiece = this.icoPiece.getImage();
        nbPiece++;
    }

    //* GETTERS SETTERS **//

    public static int getNbPiece() {
        return nbPiece;
    }

    public static void setNbPiece(int nbPiece) {
        Piece.nbPiece = nbPiece;
    }

    public Image getImgPiece() {
        return imgPiece;
    }

    public ImageIcon getIcoPiece() {
        return icoPiece;
    }



    public void setImgPiece(Image imgPiece) {
        this.imgPiece = imgPiece;
    }

    public void setIcoPiece(ImageIcon icoPiece) {
        this.icoPiece = icoPiece;
    }

    public static void setNbPiece() {
        Piece.nbPiece--;
    }




}

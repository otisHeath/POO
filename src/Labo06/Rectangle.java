package Labo06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rectangle {
    // Abscissa of the high left corner of the rectangle
    private double x;
    // Ordinate of the high left corner of the rectangle
    private double y;
    // Height of the rectangle
    private double hauteur;
    // Width of the rectangle
    private double largeur;

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        while(hauteur<=0){
            System.out.println("The height of a rectangle cannot be under 0");
            Scanner s = new Scanner(System.in);
            hauteur = s.nextDouble();
        }
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        while(largeur<=0){
        System.out.println("The width of a rectangle cannot be under 0");
        Scanner s = new Scanner(System.in);
        largeur = s.nextDouble();
        }
        this.largeur = largeur;
    }
    public Rectangle(int x,int y ,int hauteur, int largeur){
        setX(x);
        setY(y);
        setHauteur(hauteur);
        setLargeur(largeur);

    }
    public String toString(){
        return "<Rectangle en ("+x+", "+y+") <-> "+hauteur+" | "+largeur+">,";

    }
}

package Labo06;

import java.util.Scanner;

public class Cercle {
    // Abscissa of the center of the circle
    private double x ;
    // Ordinate of the center of the circle
    private double y;
    // Radius of the circle
    private double rayon;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        while(rayon<=0){
            System.out.println("The radius of a circle cannot be under 0");
            Scanner s = new Scanner(System.in);
            rayon = s.nextDouble();
        }
        this.rayon = rayon;
    }
    public Cercle(int x , int y , int rayon){
        setX(x);
        setY(y);
        setRayon(rayon);


    }
    public String toString(){
        return  "<Cercle en ("+x+", "+y+") <-> "+rayon+">,";
    }

}

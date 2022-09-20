package Utile;
import java.util.Scanner;

public class Lire {
    public static int lireEntier(String message) {
        System.out.println(message);
        Scanner s = new Scanner(System.in);
        while (!s.hasNextInt()) {
            s.next();
            System.out.println("Vous n'avez pas entrez un entier, veuillez recommcencez : ");
        }
        int a = s.nextInt();
        return a;


    }

    public static double lireDouble(String message) {
        System.out.println(message);
        Scanner s = new Scanner(System.in);
        while (!s.hasNextDouble()) {
            s.next();
            System.out.println("Vous n'avez pas entrez un nombre, veuillez recommcencez : ");
        }
        double a = s.nextDouble();
        return a;


    }

    public static String lireString(String message) {
        System.out.println(message);
        Scanner s = new Scanner(System.in);
        while (!s.hasNext()) {
            s.next();
            System.out.println("Vous n'avez pas entrez une chaine de caractère, veuillez recommcencez : ");
        }
        String a = s.next();
        return a;
    }
}

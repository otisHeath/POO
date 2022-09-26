package Labo01;
import static Utile.Lire.*;
public class TestDate {
    public static void main(String[] args) {
        Date d = new Date(30,9,2022);
        System.out.println(d.toString());
        d.prettyPrint();
        d.increment();
        d.prettyPrint();
        System.out.println(d.toString()+" est le "+d.dayOfYear()+"ème jour de l'année");
        d.increment();
        System.out.println(d.toString());
        d.prettyPrint();

        String firstName = lireString("Enter ur First Name : ");
        String lastName = lireString("Enter ur Last Name : ");
        int day = lireEntier("Enter the number of ur day (if u born the 01/02/99 type 1 ): ");
        int month = lireEntier("Enter the number of ur month (if u born the 01/02/99 type 2 ): ");
        int year = lireEntier("Enter the number of ur year (if u born the 01/02/99 type 1999 ): ");

        Person p = new Person(firstName,lastName,day,month,year);
        System.out.println(p.toString());



    }
}

package Labo01;
import java.util.*;

import static Utile.Lire.*;
public class TestDate {
    public static void main(String[] args) {
      /*  Date d = new Date(30,7,2022);
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


        ArrayList<Date> tab = new ArrayList<Date>();
        tab.add(new Date());
        tab.add(new Date(2,12,2001));
        tab.add(new Date(1,7,2007));
        tab.add(new Date(15,2,2004));

        System.out.println(tab);
        Collections.sort(tab);
        System.out.println(tab);
        ArrayList<Person> personArray = new ArrayList<>();
        personArray.add(new Person("Heath","Otis",5,2,1999));
        personArray.add(new Person("Yomedan","Joshua",1,1,1999));
        personArray.add(new Person("Gonzalez","Rayhan",30,6,1999));
        personArray.add(new Person("Oria","Joshua",25,7,1999));

        System.out.println(personArray);
        Collections.sort(personArray);
        System.out.println(personArray);

       */
        Set<Date> s = new TreeSet<>();
        s.add(new Date(1,1,1));
        s.add(new Date(1,1,1));
        System.out.println(s);



    }
}

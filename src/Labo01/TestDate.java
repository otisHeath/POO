package Labo01;

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date(30,9,2022);
        d.increment();
        d.prettyPrint();
        System.out.println(d.toString()+" est le "+d.dayOfYear()+"ème jour de l'année");

    }
}

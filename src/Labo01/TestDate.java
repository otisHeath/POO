package Labo01;

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date(31,12,2022);
        System.out.println(d.toString());

        d.prettyPrint();
    }
}

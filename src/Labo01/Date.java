package Labo01;

public class Date {
    public int day,month,year;
    public Date (int day,int month,int year){
        this.day= day;
        this.month = month;
        this.year = month;

    }
    public void increment(){


    }
    public int dayOfYear(){
        return 1;
    }
    public int dayOfWeek(){

        return 1;
    }
    public String toString(){
        return "";
    }
    public void prettyPrint(){

    }
    public boolean estDernierJour(int day,int month,int année) {
        if (estBissextile(année)) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (day == 31) {
                        return true;
                    }
                    break;
                case 2:
                    if (day == 29) {
                        return true;
                    }
                    break;
                case 4, 6, 9, 11:
                    if (day == 30) {
                        return true;
                    }
                    break;
                default :
                    return false;
            }


        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (day == 31) {
                        return true;
                    }
                    break;
                case 2:
                    if (day == 28) {
                        return true;
                    }
                    break;
                case 4, 6, 9, 11:
                    if (day == 30) {
                        return true;
                    }
                    break;
                default :
                    return false;
            }

        }

    }


    public static boolean estBissextile(int année){
        return année%4==0||année%400==0&&année%100==0;
    }
}

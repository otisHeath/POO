package Labo01;

public class Date {
    public int day,month,year;

    public Date (int day,int month,int year){
        this.day= day;
        this.month = month;
        this.year =year;

    }
    public void increment(){
        if(estDernierJour(day,month,year)){
            switch (month){
                case 1,2,3,4,5,6,7,8,9,10,11 :
                    month++;
                    day = 1;
                    break ;
                case 12 :
                    year++;
                    month=1;
                    day = 1;
                    break ;

            }


        }
        else{
            day++;
        }


    }
    public int dayOfYear(){
        int somme = 0;
        if(!estBissextile(year)){
   for(int i = 1;i<month;i++){
       switch(i){
           case 1,3,5,7,8,10,12 :
               somme += 31;
               break;
           case 4,6,9,11 :
               somme += 30;
               break;
           case 2 :
               somme +=28;
               break;


       }

   }
        }
        else{
            for(int i = 1;i<month;i++){
                switch(i){
                    case 1,3,5,7,8,10,12 :
                        somme += 31;
                        break;
                    case 4,6,9,11 :
                        somme += 30;
                        break;
                    case 2 :
                        somme +=29;
                        break;


                }

            }


        }
   somme+= day;

        return somme;
    }
    private int dayOfWeek(){
        int day,month,year,zeller,k,j;
        day = this.day;
        month = this.month;
        year = this.year;
        switch (month){
            case 1 :
                month = 13;
                year--;
                break;
            case 2 :
                month = 14;
                year--;
                break;
        }
        j = year/100;
        k=year%100;
        zeller = (day + ((month+1)*13)/5 + k + (k/4) + (j/4) + (5*j))%7;



        return zeller;
    }
    public String toString(){
        int zeller = dayOfWeek();
        String mois ="";
        String jour = "";
        String numero ="";
        switch(zeller){
            case 0 :
                jour = "Samedi" ;
                break ;
            case 1 :
                jour = "Dimanche";
                break;
            case 2 :
                jour = "Lundi" ;
                break ;
            case 3 :
                jour = "Mardi" ;
                break ;
            case 4 :
                jour = "Mercredi";
                break ;
            case 5 :
                jour = "Jeudi";
                break ;
            case 6 :
                jour = "Vendredi" ;

        }
        switch(month) {
            case 1 :
                mois = "Janvier";
                break ;
            case 2 :
                mois = "Février" ;
                break ;
            case 3 :
                mois = "Mars" ;
                break ;
            case 4 :
                mois = "Avril";
                break ;
            case 5 :
                mois ="Mai";
                break ;
            case 6 :
                mois = "Juin";
                break ;
            case 7 :
                mois = "Juillet";
                break ;
            case 8 :
                mois ="Aout";
                break ;
            case 9 :
                mois ="Septembre";
                break ;
            case 10 :
                mois ="Octobre" ;
                break ;
            case 11 :
                mois ="Novembre";
                break ;
            case 12 :
                mois ="Décembre";
                break ;






        }
        numero = switch (day) {
            case 1 -> "01";
            case 2 -> "02";
            case 3 -> "03";
            case 4 -> "04";
            case 5 -> "05";
            case 6 -> "06";
            case 7 -> "07";
            case 8 -> "08";
            case 9 -> "09";
            default -> Integer.toString(day);
        };

        return jour+", "+numero+" "+mois+" "+year;
    }
    public void prettyPrint(){
        System.out.println(day()+"/"+month()+"/"+year);


    }
    public boolean estDernierJour(int day,int month,int année) {
        boolean reponse = false;
        if (estBissextile(année)) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (day == 31) {
                        reponse = true;
                    }
                    break;
                case 2:
                    if (day == 29) {
                        reponse= true;
                    }
                    break;
                case 4, 6, 9, 11:
                    if (day == 30) {
                        reponse= true;
                    }
                    break;
                default :
                    reponse = false;
            }


        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (day == 31) {
                        reponse =  true;
                    }
                    break;
                case 2:
                    if (day == 28) {
                        reponse = true;
                    }
                    break;
                case 4, 6, 9, 11:
                    if (day == 30) {
                        reponse = true;
                    }
                    break;
                default :
                    reponse = false;
            }

        }
        return reponse;

    }


    public  boolean estBissextile(int année){

        return (année%4==0&&année%100!=0)||année%400==0;
    }
    public String month(){
        String mois ="";

        switch(month) {
            case 1 :
                mois = "01";
                break ;
            case 2 :
                mois = "02" ;
                break ;
            case 3 :
                mois = "03" ;
                break ;
            case 4 :
                mois = "04";
                break ;
            case 5 :
                mois ="05";
                break ;
            case 6 :
                mois = "06";
                break ;
            case 7 :
                mois = "07";
                break ;
            case 8 :
                mois ="08";
                break ;
            case 9 :
                mois ="09";
                break ;
            default :
                mois = Integer.toString(month);


        }

        return mois;
    }
    public String day(){


            String numero = switch (day) {
                case 1 -> "01";
                case 2 -> "02";
                case 3 -> "03";
                case 4 -> "04";
                case 5 -> "05";
                case 6 -> "06";
                case 7 -> "07";
                case 8 -> "08";
                case 9 -> "09";
                default -> Integer.toString(day);
            };
        return numero;
    }
}

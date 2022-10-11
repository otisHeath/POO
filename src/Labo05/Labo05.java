package Labo05;
import java.util.ArrayList;
import java.util.Random;

public class Labo05 {
    public static <E> void shuffle(ArrayList<E> tab){
        Random generateur = new Random();
        for(int i  = 0;i< tab.size();i++){
            int random = i+generateur.nextInt(tab.size()-i);
            E tmp = tab.get(i);

            tab.set(i,tab.get(random));
            tab.set(random,tmp);


        }


    }

    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(2);
        tab.add(4);
        tab.add(7);
        tab.add(1);
        System.out.println(tab);
        shuffle(tab);
        System.out.println(tab);
    }
}

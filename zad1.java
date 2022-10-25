import java.util.Random;

public class zad1 {

    public static double random(double min, double max){
        double a=(Math.random()*(max-min+1)+min);
        return a;
    }//random

    public static void function1(){
        double suma=0;
        double srednia=0;
        double[] tab=new double[5];
        //pętla for
        for (int i = 0; i < tab.length; i++) {
            tab[i]=random(0,10);
            suma+=tab[i];
        }
        //pętla for each
       /* for (double i : tab){
            i=random(0,10);
            suma+=i;
        }*/
        System.out.println("Suma: "+ suma);
        srednia=suma/ tab.length;
        System.out.println("Srednia: "+ srednia);

    }



}

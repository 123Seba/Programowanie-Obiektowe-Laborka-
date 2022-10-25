import java.util.Scanner;

public class zad6 {

    public static int silnia(int a){
        int silnia=1;
        for (int i=1;i<=a;i++){
            silnia=silnia*i;
        }
        return silnia;
    }

    public static void function6(){
        int[] tab=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj liczbe: ");
            tab[i]=input.nextInt();
        }//for
        for (int i = 0; i < tab.length; i++) {
            System.out.println(silnia(tab[i]));
        }

    }

}

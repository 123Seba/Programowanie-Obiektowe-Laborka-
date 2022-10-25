import java.util.Arrays;
import java.util.Scanner;

public class zad5 {
    public static void function5(){
        int[] tab=new int[8];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj liczbe: ");
            tab[i]=input.nextInt();
        }
        Arrays.sort(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}

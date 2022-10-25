import java.util.Scanner;

public class zad4 {

    public static void function4(){
        String[] tab=new String[5];
       // String pom="";
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj slowo:  ");
            tab[i]=input.nextLine();
        }//for

        for (int i = tab.length-1; i>=0 ; i--) {
            StringBuilder input1 = new StringBuilder();
            input1.append(tab[i]);
            input1.reverse();
            System.out.println(input1);
        }

    }


}

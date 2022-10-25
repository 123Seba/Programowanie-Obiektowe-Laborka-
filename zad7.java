import java.util.Arrays;

public class zad7 {
    public static void function7(){
        String[]tab1=new String[]{"Ala", "ma", "kota"};
        String[]tab2=new String[]{"Ala", "ma", "kota"};
        if (Arrays.equals(tab1,tab2)){
            System.out.println("Tablice sa takie same ");
        }
        if (!Arrays.equals(tab1,tab2)){
            System.out.println("Tablice nie sa takie same ");
        }
    }


}

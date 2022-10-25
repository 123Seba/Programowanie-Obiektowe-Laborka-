public class zad2 {

    public static void function2(){
        int[] tab1=new int[8];
        int[] tab2=new int[5];
        int j=0;

        for (int i = 0; i < tab1.length; i++) {
            tab1[i]=i;
        }
        for (int i = 0; i < tab2.length; i++) {
            tab2[i]=i;
        }



        for (int i = 0; i < tab1.length; i=i+2) {
            System.out.println(tab1[i]);
        }
        System.out.println();
        for (int i = 0; i < tab2.length; i=i+2) {
            System.out.println(tab2[i]);
        }

    }




}

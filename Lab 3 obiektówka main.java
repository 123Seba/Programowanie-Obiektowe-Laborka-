public class main {
    public static void main(String[]args){
//function1();
        //function2();
        // function3();
        //function4();
        //function5();
        // function6();
        //function7();





    }
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
        for (double i : tab){
            i=random(0,10);
            suma+=i;
        }
        System.out.println("Suma: "+ suma);
        srednia=suma/ tab.length;
        System.out.println("Srednia: "+ srednia);
    }
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
    public static void function3(){
        String[] tab=new String[]{"ab","cd","ed"};
        for (String i: tab){
            System.out.println(i.toUpperCase());
        }//for
    }
    public static void function4(){
        String[] tab=new String[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj slowo:  ");
            tab[i]=input.nextLine();
        }
        for (int i = tab.length-1; i>=0 ; i--) {
            StringBuilder input1 = new StringBuilder();
            input1.append(tab[i]);
            input1.reverse();
            System.out.println(input1);
        }
    }
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

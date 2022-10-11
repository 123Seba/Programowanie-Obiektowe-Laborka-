import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//zad1
        /*System.out.printf(zad1.function1());*/
   /* int a=0;
    int b=0;

//zad2
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj lizcbe");
        a= input.nextInt();

        Scanner input2=new Scanner(System.in);
        System.out.println("Podaj lizcbe");
        b= input2.nextInt();

        zad2.function2(a,b);*/

        //System.out.println(zad3.function3(5));
        //System.out.println(zad4.function4(30));
        //System.out.println(zad5.function5(4));
        //System.out.println(zad6.function6(16));

        //zad7
        int a=0;
        int b=0;

        int c=0;
        int d=0;
        int e=0;

        Scanner input=new Scanner(System.in);
        System.out.println("Podaj lizcbe");
        a= input.nextInt();

        Scanner input2=new Scanner(System.in);
        System.out.println("Podaj lizcbe");
        b= input2.nextInt();
        if (a<=b){
            c=(int)(Math.random()*(b-a+1)+a);
            d=(int)(Math.random()*(b-a+1)+a);
            e=(int)(Math.random()*(b-a+1)+a);
        }
        if (a>b){
            c=(int)(Math.random()*(a-b+1)+b);
            d=(int)(Math.random()*(a-b+1)+b);
            e=(int)(Math.random()*(a-b+1)+b);
        }
        System.out.println();
        System.out.println(c+" "+d+" "+e);
        System.out.println(zad7.function7(c,d,e));
    }
}

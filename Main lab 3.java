import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        //function1();

       // function2a();
        //function2b();
        //function2c();

        //function3();

        //function4();

        //function5();
        //function6();
    }

        public static double ScanDouble() {
            double a = 0;
            Scanner input = new Scanner(System.in);
            a = input.nextDouble();
            return a;
        }

        public static void function1() {
            double a = 0;
            double b = 0;
            double c = 0;
            double delta = 0;
            double deltaSqrt = 0;
            double x1 = 0;
            double x2 = 0;
            double x = 0;

            System.out.println("Podaj a: ");
            a = ScanDouble();
            System.out.println("Podaj b: ");
            b = ScanDouble();
            System.out.println("Podaj c: ");
            c = ScanDouble();

            delta = (b * b) - 4 * (a * c);

            deltaSqrt = Math.sqrt(delta);
            if (delta > 0) {
                x1 = (-b - deltaSqrt) / 2 * a;
                x2 = (-b + deltaSqrt) / 2 * a;
                System.out.println("x1= " + x1);
                System.out.println("x2= " + x2);
            }
            if (delta == 0) {
                x = (-b) / 2 * a;
                System.out.println("x= " + x);
            }
            if (delta < 0) {
                System.out.println("Nie ma miejsc zerowych");
            }

        }
        public static void function2a(){
            double x=0;
            double a=0;
            System.out.println("Podaj argument funkcji: ");
            x= ScanDouble();
            if (x>0){
                a=2*x;
            }
            if (x==0){
                a=0;
            }
            if (x<0){
                x=-(3*x);
            }
            System.out.println("a(x)= "+a);
        }

        public static void function2b(){
            double x=0;
            double b=0;
            System.out.println("Podaj argument funkcji: ");
            x= ScanDouble();
            if (x>=1){
                b=x*x;
            }
            if (x<1){
                b=x;
            }
            System.out.println("b(x)= "+b);
        }
        public static void function2c(){
            double x=0;
            double c=0;
            System.out.println("Podaj argument funkcji: ");
            x= ScanDouble();
            if (x>2){
                c=2+x;
            }
            if (x==2){
                c=8;
            }
            if (x<2){
                c=x-4;
            }
            System.out.println("c(x)= "+c);
        }

            public static void function3() {
                double x = 0;
                double y = 0;
                double z = 0;

                System.out.println("Podaj liczbe: ");
                x = ScanDouble();
                System.out.println("Podaj liczbe: ");
                y = ScanDouble();
                System.out.println("Podaj liczbe: ");
                z = ScanDouble();
                double[] tab = new double[3];
                tab[0] = x;
                tab[1] = y;
                tab[2] = z;
                Arrays.sort(tab);
                for (int i = 0; i < tab.length; i++) {
                    System.out.println(tab[i]);
                }
            }
        public static void function4(){
            boolean descz;
            boolean autobus;
            String a,b;
            Scanner input=new Scanner(System.in);
            System.out.println("Czy pada deszcz: ");
            a= input.nextLine();
            System.out.println("Czy jest autobus: ");
            b= input.nextLine();
            if (a.equals("tak")){
                descz=true;
            }else {
                descz=false;
            }//if

            if (b.equals("tak")){
                autobus=true;
            }else {
                autobus=false;
            }//if
            

            if (descz==true&&autobus==true){
                System.out.println("Wez parasol "+", "+"Dostaniesz sie na uczelnie");
            }
            if (descz==true&&autobus!=true){
                System.out.println("Nie dostaniesz sie na uczelnie");
            }
            if (descz!=true&&autobus==true){
                System.out.println("Dostaniesz sie na uczelnie"+", "+"Milego dnia i pieknej pogody");
            }
        }//function4
        public static void function5() {
            boolean znizka;
            boolean podwyzka;
            String a, b;
            Scanner input = new Scanner(System.in);
            System.out.println("Czy jest znizka na samochod: ");
            a = input.nextLine();
            System.out.println("Czy otrzymales podwyzke: ");
            b = input.nextLine();
            if (a.equals("tak")) {
                znizka = true;
            } else {
                znizka = false;
            }//if

            if (b.equals("tak")) {
                podwyzka = true;
            } else {
                podwyzka = false;
            }//if

            if (znizka!=true||podwyzka==true){
                System.out.println("Mozesz kupic samochod !"+", "+ "Znizki na samochod nie ma");
            }
            if (znizka!=true||podwyzka!=true){
                System.out.println("Zakup samochod trzeba odlozyc na pozniej..."+", "+"Znizki na samochod nie ma");
            }
            if (znizka==true||podwyzka==true){
                System.out.println("Mozesz kupic samochod!");
            }
        }
        public static void function6(){
            int a,b,wyb=0;
            Scanner scanner=new Scanner(System.in);


            while(wyb!=6) {
                System.out.println("1. dodaj");
                System.out.println("2. odejmij");
                System.out.println("3. pomnoz");
                System.out.println("4. podziel");
                System.out.println("5. reszta z dzielenia");
                System.out.println("6. wyjdz");

                System.out.println("Co chesz zrobic: ");
                wyb= scanner.nextInt();

                switch (wyb) {
                    case 1:
                        System.out.println("Podaj liczbe a: ");
                        a= scanner.nextInt();
                        System.out.println("Podaj liczbe b: ");
                        b= scanner.nextInt();
                        System.out.printf("Wynik: ");
                        System.out.println(a + b);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Podaj liczbe a: ");
                        a= scanner.nextInt();
                        System.out.println("Podaj liczbe b: ");
                        b= scanner.nextInt();
                        System.out.printf("Wynik: ");
                        System.out.println(a - b);
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Podaj liczbe a: ");
                        a= scanner.nextInt();
                        System.out.println("Podaj liczbe b: ");
                        b= scanner.nextInt();
                        System.out.printf("Wynik: ");
                        System.out.println(a * b);
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Podaj liczbe a: ");
                        a= scanner.nextInt();
                        System.out.println("Podaj liczbe b: ");
                        b= scanner.nextInt();
                        if (b==0){
                            System.out.println("Nie mozna dzielic przez 0 ");
                        }else{
                            System.out.printf("Wynik: ");
                            System.out.println(a / b);}
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Podaj liczbe a: ");
                        a= scanner.nextInt();
                        System.out.println("Podaj liczbe b: ");
                        b= scanner.nextInt();
                        if (b==0){
                            System.out.println("Nie mozna dzielic przez 0 ");
                        }else{
                            System.out.printf("Wynik: ");
                            System.out.println(a%b);}
                        System.out.println();
                        break;
                }
            }//while
        }

    }


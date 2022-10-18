public class Main {
    public static void main(String[]args){

//zad1.function1();

//zad2.function2();

        //zad3.function3();
//zad4.function4();
        //zad5.function5();










    }public static void function1() {
        int ileStudentow = 0;
        double suma = 0;
        double sr = 0;
        int i = 0;
        do {
            System.out.println("Ile studentow: ");
            Scanner input = new Scanner(System.in);
            ileStudentow = input.nextInt();
        } while (ileStudentow < 1);
        while (i < ileStudentow) {
            Scanner input2 = new Scanner(System.in);
            double ile = 0;
            System.out.println("Ile punktow");
            ile = input2.nextDouble();
            suma += ile;
            i++;
        }//while
        sr = suma / ileStudentow;
        System.out.println("Srednia: " + sr);
        public static double Scan () {
            double num = 0;
            Scanner input = new Scanner(System.in);
            num = input.nextDouble();
            return num;
        }

        public static void function2 () {
            //Scanner input=new Scanner(System.in);
            int ileDot = 0;
            int ileUje = 0;
            double sumDot = 0;
            double sumUje = 0;
            double liczba = 0;

            for (int i = 0; i < 10; i++) {
                System.out.println("Podaj liczbe: ");
                liczba = Scan();
                if (liczba > 0) {
                    ileDot++;
                    sumDot += liczba;
                }
                if (liczba < 0) {
                    ileUje++;
                    sumUje += liczba;
                }
            }//for
            System.out.println("Liczba liczb dodatnich: " + ileDot);
            System.out.println("Suma liczb dodatnich: " + sumDot);
            System.out.println("Liczba liczb ujemnych: " + ileUje);
            System.out.println("Suma liczb ujemnych" + sumUje);
        }
        public static void function3 () {
            double n = 0;
            double liczba = 0;
            double sum = 0;
            do {
                System.out.println("Podaj ile liczb w ciagu: ");
                n = Scan();
            } while (n < 1);

            for (int i = 0; i < n; i++) {
                System.out.println("Podaj liczbe: ");
                liczba = Scan();
                if (liczba % 2 == 0) {
                    sum += liczba;
                }
            }//for
            System.out.println("Suma parzystych: " + sum);
        }
        public static void function4 () {
            double n = 0;
            int liczba = 0;
            double sum = 0;
            do {
                System.out.println("Podaj ile liczb w ciagu: ");
                n = Scan();
            } while (n < 1);

            for (int i = 0; i < n; i++) {
                Random random = new Random();
                liczba = random.nextInt(45 - (-10)) + (-10);
                System.out.println("Liczba: " + liczba);
                if (liczba % 2 == 0) {
                    sum += liczba;
                }
            }//for
            System.out.println("Suma parzystych: " + sum);


        }
        public static void function5 () {
            String slowo = " ";
            String reversed = " ";

            Scanner input = new Scanner(System.in);
            System.out.println("Podaj slowo: ");
            slowo = input.nextLine();

            StringBuilder reverseString = new StringBuilder(slowo);
            reverseString.reverse();
            reversed = reverseString.toString();
            System.out.println("Reversed: " + reversed);

            if (slowo.equals(reversed)) {
                System.out.println("Podane slowo jest palindromem: ");
            } else {
                System.out.println("Podane slowo nie jest palindromem");
            }
        }
    }
}

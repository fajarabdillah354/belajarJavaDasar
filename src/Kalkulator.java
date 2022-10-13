import java.util.*;

public class Kalkulator {
   public static void menu(){
        while (true){
            System.out.println("==== Selamat Datang Di Program Kalkulator Sederhana ====");
            System.out.println("== created by fajar abdillah ahmad ==");
            System.out.println("1. (+)untuk penjumlahan ");
            System.out.println("2. (-)untuk pengurangan ");
            System.out.println("3. (/)untuk pembagian ");
            System.out.println("4. (x)untuk perkalian ");
            System.out.println("5. (luas)untuk mencari luas bangun datar");

            Scanner input = new Scanner(System.in);
            System.out.print("Silahkan masukan operator yang di inginkan :");
            String inputUser = input.nextLine();



            if (inputUser.equals("+")) {
                System.out.println("** operasi penjumlahan **");
                penjumlahan();
                System.out.println("pilih y/n untuk mengulang : ");
                Scanner rety = new Scanner(System.in);
                String ulang = rety.nextLine();
                if (ulang.equals("y")){
                    menu();
                }else {
                    break;
                }
            } else if (inputUser.equals("-")) {
                System.out.println("** operasi pengurangan **");
                pengurangan();
                System.out.println("pilih y/n untuk mengulang : ");
                Scanner rety = new Scanner(System.in);
                String ulang = rety.nextLine();
                if (ulang.equals("y")){
                    menu();
                }else {
                    break;
                }
            } else if (inputUser.equals("/")) {
                System.out.println("** operasi pembagian **");
                pembagian();System.out.println("pilih y/n untuk mengulang : ");
                Scanner rety = new Scanner(System.in);
                String ulang = rety.nextLine();
                if (ulang.equals("y")){
                    menu();
                }else {
                    break;
                }
            } else if (inputUser.equals("x")) {
                System.out.println("** operasi perkalian **");
                perkaian();
                System.out.println("pilih y/n untuk mengulang : ");
                Scanner rety = new Scanner(System.in);
                String ulang = rety.nextLine();
                if (ulang.equals("y")){
                    menu();
                }else {
                    break;
                }
            } else {
                System.out.println(")> perintah tidak di kenal <(");
            }

        }


    }

    public static int penjumlahan(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka pertama : ");
        int a = input.nextInt();
        System.out.print("masukan angka kedua : ");
        int b = input.nextInt();
        var hasil = a + b;
        System.out.println("hasil operasi = "+hasil);
        return hasil;

    }

    public static int pengurangan(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka pertama : ");
        int a = input.nextInt();
        System.out.print("masukan angka kedua : ");
        int b = input.nextInt();
        var hasil = a-b;
        System.out.println("hasil operasi = "+hasil);
        return hasil;

    }

    public static float pembagian(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka pertama : ");
        float a = input.nextInt();
        System.out.print("masukan angka kedua : ");
        float b = input.nextInt();
        float hasil = a/b;
        System.out.println("hasil operasi = "+hasil);
        return hasil;
    }


    public static int perkaian(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka pertama : ");
        int a = input.nextInt();
        System.out.print("masukan angka kedua : ");
        int b = input.nextInt();
        var hasil = a*b;
        System.out.println("hasil operasi = "+hasil);
        return hasil;
    }

    public static void menampilkanMenu(){
            System.out.println("==== Selamat Datang Di Program Kalkulator Sederhana ====");
            System.out.println("== created by fajar abdillah ahmad ==");
            System.out.println("1. (+)untuk penjumlahan ");
            System.out.println("2. (-)untuk pengurangan ");
            System.out.println("3. (/)untuk pembagian ");
            System.out.println("4. (x)untuk perkalian ");
            System.out.println("5. (luas)untuk mencari luas bangun datar");

            Scanner input = new Scanner(System.in);
            System.out.print("Silahkan masukan operator yang di inginkan :");
            String inputUser = input.nextLine();


            if (inputUser.equals("+")) {
                System.out.println("** operasi penjumlahan **");
                penjumlahan();

            } else if (inputUser.equals("-")) {
                System.out.println("** operasi pengurangan **");
                pengurangan();
            } else if (inputUser.equals("/")) {
                System.out.println("** operasi pembagian **");
                pembagian();
            } else if (inputUser.equals("x")) {
                System.out.println("** operasi perkalian **");
                perkaian();
            } else {
                System.out.println(")> perintah tidak di kenal <(");
            }


    }


    public static void main(String[] args) {
        menu();



        System.out.println("********* TERIMAKASIH **********");
    }


}

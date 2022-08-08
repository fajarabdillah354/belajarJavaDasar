import java.util.*;

public class Kalkulator {

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

    public static int pembagian(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka pertama : ");
        int a = input.nextInt();
        System.out.print("masukan angka kedua : ");
        int b = input.nextInt();
        var hasil = a/b;
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



    public static void main(String[] args) {
        System.out.println("==== Selamat Datang Di Program Kalkulator Sederhana ====");
        System.out.println("== created by fajar abdillah ahmad ==");
        System.out.println("1. (+)untuk penjumlahan ");
        System.out.println("2. (-)untuk pengurangan ");
        System.out.println("3. (/)untuk pembagian ");
        System.out.println("4. (x)untuk perkalian ");
        System.out.println("5. (luas)untuk mencari luas bangun datar");
        System.out.print("Silahkan masukan operator yang di inginkan :");
        Scanner input = new Scanner(System.in);
        String inputUser = input.nextLine();
        if(inputUser.equals("+")){
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
        }else{
            System.out.println(")> perintah tidak di kenal <(");
        }


        System.out.println("********* TERIMAKASIH **********");
    }


}

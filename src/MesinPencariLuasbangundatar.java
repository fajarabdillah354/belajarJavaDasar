import java.util.*;
public class MesinPencariLuasbangundatar {

    public static void main(String[] args) {
        tampilanMenu();
    }

    public static void testerMenu(){
        var test = new Kalkulator();
        test.menu();
    }

    public static void tampilanMenu(){
        System.out.println("=== MESIN PENCARI LUAS BANGUN DATAR ===");
        System.out.println("=== created by Fajar Abdillah Ahmad ===");
        System.out.println("******** MENU *********");
        System.out.println("ketik 1 untuk Program Kalkulator");
        System.out.println("ketik 2 untuk Program Pencarian luas");
        Scanner input = new Scanner(System.in);
        System.out.print("silahkan masukan jawaban anda : ");
        int inputUser = input.nextInt();
        switch (inputUser){
            case 1 :
                testerMenu();
                break;
            case 2 :
                luasBangun();
                break;
            default:
                System.out.println("****** menu tidak tersedia *******");
        }


    }

    public static int luasPersegi(){
        Scanner input = new Scanner(System.in);
        System.out.println("--- Menentukan Luas Persegi ---");
        System.out.print("masukan nilai sisi persegi :");
        int inputUser = input.nextInt();
        int hitungLuas = inputUser*4;
        System.out.println("Luas persegi = "+hitungLuas);
        return hitungLuas;
    }


    public static int luasPersegiPanjang(){
        Scanner input = new Scanner(System.in);
        System.out.println("--- Menentukan Luas Persegi Panjang ---");
        System.out.print("masukan panjang persegi panjang : ");
        int a = input.nextInt();
        System.out.print("masukan lebar persegi panjang : ");
        int b = input.nextInt();
        int hasil = a*b;
        System.out.println("Luas persegi panjang = "+hasil);
        return hasil;

    }

    public static int luasSegitiga(){
        Scanner input = new Scanner(System.in);
        System.out.println("--- Menentukan Luas Segitiga ---");
        System.out.print("masukan nilai alas segitiga : ");
        int a = input.nextInt();
        System.out.print("masukan nilai tinggi segitiga : ");
        int b = input.nextInt();
        int hasil = (a*b)/2;
        System.out.println("Luas segitiga = "+hasil);
        return hasil;
    }

    public static int luasBelahKetupat(){
        Scanner input = new Scanner(System.in);
        System.out.println("--- Menentukan Luas BelahKetupat");
        System.out.print("masukan nilai diagonal 1 : ");
        int a = input.nextInt();
        System.out.print("masukan nilai diagonal 2 : ");
        int b = input.nextInt();
        int hasil = (a*b)/2;
        System.out.println("luas belahketupat = "+hasil);
        return hasil;
    }

    public static int luasLayang(){
        Scanner input = new Scanner(System.in);
        System.out.println("--- Menentukan luas Layang-Layang ---");
        System.out.print("masukan nilai diagonal 1 : ");
        int a = input.nextInt();
        System.out.print("masukan nilai diagonal 2 : ");
        int b = input.nextInt();
        int hasil = (a*b)/2;
        System.out.println("luas belahketupat = "+hasil);
        return hasil;
    }


    public static void luasBangun(){
        System.out.println("=== LUAS BANGUN YANG TERSEDIA ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Persegi Panjang");
        System.out.println("3. Luas Segitiga");
        System.out.println("4. Luas BelahKetupat");
        System.out.println("5. Luas Layang - Layang");
        System.out.print("silahkan masukan pilihan anda : ");
        Scanner input = new Scanner(System.in);
        String inputUser = input.nextLine();
        if (inputUser.equals("1")){
            luasPersegi();
        } else if (inputUser.equals("2")) {
            luasPersegiPanjang();
        }else if(inputUser.equals("3")){
            luasSegitiga();
        }else if(inputUser.equals("4")){
            luasBelahKetupat();
        }else if (inputUser.equals("5")){
            luasLayang();
        }

    }

}

import java.util.Scanner;

public class MenghitungLuas {
    public static void main(String[] args) {
        kata(" Luas Segitiga");
        hitung();
    }

    //method hitung
    static int hitung(){
        Scanner inputNilai = new Scanner(System.in);
        System.out.print("masukan nilai alas : ");
        int alas = inputNilai.nextInt();
        System.out.print("masukan nilai tinggi : ");
        int tinggi = inputNilai.nextInt();
        int hasil = (alas*tinggi)/2;
        System.out.println("hasil luas : "+ hasil);
        return hasil;
    }

    static String kata(String value){
        System.out.println("program menghitung "+value);
        System.out.println("======= silahkan input data-data  di bawah ini ========");
        return value;
    }
}

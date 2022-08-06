
import java.util.*;

public class InputUser {

    public static void main(String[] args) {
        System.out.println(" ======= program pengecekan angka ganjil dan genap =======");
        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukan angka yang akan anda masukan : ");
        int nilai = inputUser.nextInt();
        System.out.println("anda memasukan angka "+ nilai);
        if(nilai % 2 == 0){

            System.out.println("ini adalah angka genap");
        }else {
            System.out.println("ini adalah angka ganjil");
        }
    }
}

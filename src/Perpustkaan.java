import java.util.Scanner;

public class Perpustkaan {

    public static void main(String[] args) {
    choiceMenu();

    }


    public static String listitem(){

        System.out.println("======= Perpustakaan ========");
        String[] listBuku = {
                "Atomic Habbit", "Bisnis UKM", "Cara Menjadi Kaya", "Sangkuriang", "Mindset", "isi Otak Orkay"

        };


        for (var i = 0;i<listBuku.length;i++){
            System.out.println((i+1)+"."+listBuku[i]);
        }
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Silahkan pilih buku :");
        String pilih = inputUser.nextLine();
        return pilih;
    }


    public static String choiceMenu(){
        String pilih = listitem();
        switch (pilih){
            case "1" :
                System.out.println("Selamat anda berhasil meminjam buku Atomic Habbit");
                break;
            case "2" :
                System.out.println("Selamat anda berhasil meminjam buku Bisnis UKM");
                break;
            case "3" :
                System.out.println("Selamat anda berhasil meminjam buku SANGKURIAN");
                break;
            case "4" :
                System.out.println("Selamat anda berhasil meminjam buku Mindset");
                break;
            case "5" :
                System.out.println("Selamat anda berhasil meminjam buku Isi Otak Orkay");
                break;
            default:
                System.out.println("perintah tidak di kenali !!!");
        }
        return pilih;



    }


}



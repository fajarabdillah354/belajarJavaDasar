import java.util.*;

public class ListBarang {

    public static void main(String[] args) {
        tampilkanMenuBarang();
    }

    public static String[] list = new String[10];

    public static void menampilkanBarang(){
        System.out.println("==== list barang kebutuhan CAMPING ====");
        for (var i =0;i< list.length;i++){
            var barang = list[i];
            var no = i+1;
            if(barang!= null){
                System.out.println(no+". "+barang);
            }
        }
    }

    //test MenampilkanBarang
    public static void testMenampilkanBarang(){
        list[1]="sepatu";
        list[2]="sandal";
        list[3]="baju";
        menampilkanBarang();
    }

    public static void menambahBarang(String barang){
        //pengecekan apakah length list penuh
        var isFull = true;
        for(var i = 0;i< list.length;i++){
            if(list[i] == null){
                isFull = false;
                break;
            }
        }

        //meresize jika length list sudah penuh
        if (isFull){
            var temp = list;
            list = new String[list.length * 2];
            for (var i = 0;i< temp.length;i++){
                list[i] = temp[i];
            }

        }


        // tambah barang jika masih ada yang kosong
        for (var i = 0;i< list.length;i++){
            if (list[i] == null){
                list[i] = barang;
                break;
            }
        }
    }

    //test menambah barang
    public static void testMenambahBarang(){
        for (var i = 0;i<25;i++){
            menambahBarang("cotoh ke- "+i);
        }menampilkanBarang();

    }

    public static boolean hapusBarang(Integer nomor ){
     if((nomor-1)>= list.length){
         return false;
     }else if(list[nomor-1]==null){
         return false;
     }else{
         for (int i = (nomor-1);i< list.length;i++){
             if(i == (list.length-1)){
                 list[i] = null;
             }else{
                 list[i] = list[i+1];
             }
         }
         return true;
     }

    }

    //unit test HapusBarang
    public static void testHapusBarang(){
        menambahBarang("sepatu");
        menambahBarang("sandal");
        menambahBarang("baju");


        var hapus = hapusBarang(2);
        System.out.println(hapus);
        menampilkanBarang();
        menambahBarang("tas gunung");
        menambahBarang("air minum");
        menampilkanBarang();
    }

    public static String inputUser(String intro){
        Scanner inputUser = new Scanner(System.in);
        System.out.print(intro + " :");
        String  input = inputUser.nextLine();
        return input;
    }

    //unit tast inputUser
    public static void testInputUsers(){
        var name = inputUser("masukan nama anda ");
        System.out.print(name);
    }



    public static void tampilkanMenuBarang(){
        while (true){
            menampilkanBarang();
            System.out.println("*** menu ***");
            System.out.println("1. Tambah barang");
            System.out.println("2. Hapus barang");
            System.out.println("3. keluar");

            var input =inputUser("pilih");
            if(input.equals("1")){
                tampilkanTambahBarang();
            } else if (input.equals("2")) {
                tampilkanHapusBarang();
            }else if (input.equals("3")){
                break;
            }else {
                System.out.println("========= PILIHAN TIDAK TERSEDIA =========");
            }

        }
    }

    //TEST TAMPILKA MENU BARANG
    public static void testtampilkanMenuBarang(){
        menambahBarang("sepatu");
        menambahBarang("sandal");
        menambahBarang("baju");
        tampilkanMenuBarang();
    }



    public static void tampilkanTambahBarang(){
        System.out.println("+++ menambahkan barang yang akan di bawa +++");
        var barang = inputUser("silahkan pilih(x untuk batal)");
        if(barang.equals("x")){
            //batal
        }else {
            menambahBarang(barang);
        }
    }



    public static void tampilkanHapusBarang(){
        System.out.println("=== menghapus barang ===");
        var barang = inputUser("silahkan pilih(x untuk batal)");
        if (barang.equals("x")){
            //batal
        }else{
            boolean sukses = hapusBarang(Integer.valueOf(barang));
        }

    }

    //test tampilkanHapusBarang
    public static void testTampilkanHapusBarang(){
        menambahBarang("tas");
        menambahBarang("baju");
        menambahBarang("celana");
        menampilkanBarang();
        tampilkanHapusBarang();
        menampilkanBarang();

    }



}


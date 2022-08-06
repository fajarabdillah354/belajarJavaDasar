public class Scope {
    public static void main(String[] args) {
        System.out.println("ini adalah contoh scope dalam java");
        var x = "fajar";//var ini hanya bisa di akses dalam block kode main
        int data = 3;
        if (x == "fajar"){
            for(int a = 1;a <= 3;a++){
                System.out.println(a + "" + " anak pertama");
                break;

            }
        }

    }

}

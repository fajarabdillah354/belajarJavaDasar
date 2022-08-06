public class ifExpresion {
    public static void main(String[] args) {
        System.out.println("====== Belajar If statement java =======");
        var nilai = 68;
        var uts = 65;

        if(nilai > 68 && uts > 65){
            System.out.println("selamat anda lulus ujian ");
        } else if (nilai == 68 && uts == 65){
            {
                System.out.println("nilai anda pas-pas an");
            }
        }else if(nilai < 68 && uts < 65){
            System.out.println("maaf anda belum lulus,Silahkan coba kembali");
        }else{
            System.out.println("========= anda gagal =======");
        }
    }
}
/* pengkondisian dengan if terbagi menjadi beberapa bagian
1. if statement
2. else statement
3. else if statement
 */
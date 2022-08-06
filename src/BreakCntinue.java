public class BreakCntinue {
    public static void main(String[] args) {
        System.out.println("======= program menampilkan angka genap ========");
        System.out.println(tampil(20));
    }
    //method menampilkan angka
    static int tampil(int value){
        for (value = 1;value<=20;value++){
            System.out.println("perulangan ke - "+value);
            if(value % 2 == 0){//kondi nilai value habis di bagi 2
                break;//akan memberhentikan perulangan
            }else{
                System.out.println("nilai akhir "+value);
                continue;//akan memberhentikan kondisi pengkondisian if

            }
        }

        return value;

    }

}

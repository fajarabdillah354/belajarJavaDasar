import java.util.*;

public class SearchingSequential {
    public static void main(String[] args) {
        int[] data = {45,23,66,71,1,9,6,44,99};
        boolean ketemu = false;
        int cariAngka = 99;
        int i;
        for (i = 0;i<data.length;i++){
            if(cariAngka == data[i] ){
                ketemu = true;
                break;
            }
        }
        if(ketemu){
            System.out.println("angka " + cariAngka + " yang anda cari ada dalam index ke - "+i);
        }else{
            System.out.println("angka tidak ditemukan");
        }

    }
}

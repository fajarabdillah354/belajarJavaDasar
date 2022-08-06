public class latihanSementara {
    public static void main(String[] args) {
        var a = 20;
        var b = 39;
        var c = hitung(a,b);
        System.out.println(c);
        int jumlahMurid = 35;
        int[] jumlah = {80,90,90,100};
        nilai("fajar",jumlah);
//        cekAbsen();

    }
    static int hitung(int value1,int value2){
        var total = value1 + value2;
        return total;
    }

    static void nilai(String nama, int[] jumlah){
        var total = 0;
        for(var tampung : jumlah){
            total += tampung;
        }
        var kkm = total/jumlah.length;
        if(kkm >=  75){
            System.out.println("selamat "+nama+" anda lulus ujian dengan nilai tertinggi "+jumlah[3]);
            System.out.println("rata-rata : "+kkm);
        }else{
            System.out.println("maaf "+nama+" anda belum lulus ujian");
        }
    }


//    static void cekAbsen() {
//
//        for (var absen = 1;absen <= 35;absen++) {
//            if (absen % 2 == 0) {
//                System.out.println(absen + " "+"anda masuk kelompok B");
//            }else{
//                System.out.println(absen + " "+"anda masuk kelompok A");
//            }
//        }
//
//    }
}

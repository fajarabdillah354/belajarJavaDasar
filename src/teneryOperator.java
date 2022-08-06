import org.w3c.dom.ls.LSOutput;

public class teneryOperator {
    public static void main(String[] args) {
        /* contoh ternery operator yaitu percabangan seperti if else */
        var nilai = 75;
        String ucapan = nilai > 75 ? "Nilai anda di atas rata -rata " : nilai >= 75 ? "nilai anda pas KKM" : "ANDA BELUM LULUS PADA SEMESTER INI ";
        System.out.println(ucapan);
    }


}

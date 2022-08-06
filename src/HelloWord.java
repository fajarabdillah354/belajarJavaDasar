public class HelloWord {
    public static void main(String[] args) {
        System.out.println("HELLO_WORD");
        System.out.println("saya fajar");
        System.out.println("sebagai mahasiswa");
        System.out.println("HELLO_WORD");

        var ryan = "ryan";
        String[] mahasiswa = {
                "fajar",ryan,"sandi"
        };

        System.out.println(mahasiswa[1]);

        int[][] nomorUrut = {
                {2,3,4},
                {1,5,6},
                {7,8,9}
        };
        System.out.println(nomorUrut[1][0] + nomorUrut[0][2]);
    }
}

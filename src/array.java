public class array {
    public static void main(String[] args) {
//        macam bentuk array
//        1. pembuatan array dengan manual
        String[] iniArray;
        iniArray = new String[3];
        iniArray[0] = "fajar";
        iniArray[1] = "sandi";
        iniArray[2] = "ryan";

        System.out.println(iniArray[0]);
        System.out.println(iniArray[1]);
        System.out.println(iniArray[2]);

//        2 . pembuatan array dengan inisialisasi
        String[] array ={
                    "fajar" , "ujeh" , "sandi"
        };
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        int[] arr = {
                2,3,4,5
        };
        System.out.println(arr[0]);
        System.out.println("penggabungan arr 1 dan arr 2 : "+ " "+ arr[1] + arr[0]);

//        3. pembuatan array dalam array
        String[][] dobelArray = {
                {"siti","fajar","ujeh"},
                {"sandi","alfan","uti"},
                {"fahmi","dini","azka"},
        };
        System.out.println(dobelArray[1][1]);
    }

}

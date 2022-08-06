import java.util.Scanner;

public class ApkTodoList {
    public static  String[] model = new String[10];


    public static void main(String[] args) {
        viewShowTodoList();
    }



    public static void showTodoList(){
        System.out.println("======TODOLIST========");
        for(var i = 0;i < model.length;i++ ){
            var todo = model[i];
            var no = i +1;
            if(todo != null){
                System.out.println(no + ". " +todo);

            }
        }

    }

    //unit test showTodoList
    public static void testShowTodiList(){
        model[0] = "membuat daftar belanja";
        model[1] = "pergi ke pasar";
        showTodoList();
    }



    public static void addTodoList(String todo){
        var isFull = true;
        //pengecekan apakah model penuh
        for (var i = 0;i < model.length;i++){
            if(model[i] == null){
                //model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        //jika penuh ukuran akan di resize
        if (isFull){
            var temp = model;
            model = new String[model.length * 2];
            for(var i = 0;i < temp.length;i++){
                model[i] = temp[i];
            }
        }

        //tambahkan data yang masuk jika data masih null
        for(var i = 0;i < model.length;i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }

    }

    //unit test addTodoList
    public static void testAddTodoList(){
        for (var i = 0;i < 25;i++){
            addTodoList("contoh data ke - "+i);
        }
        showTodoList();
    }



    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number-1);i<model.length;i++){
                if(i == (model.length-1)){
                    model[i] = null;
                }else{
                    model[i] = model[i+1];
                }
            }
            return true;
        }
    }

    //unit testRemoveTodoList
    public static void testremoveTodoList(){
        addTodoList("bangun pagi");
        addTodoList("mandi");
        addTodoList("sarapan");
        addTodoList("berangkat kerja");

        var result = removeTodoList(4);//ketika kita menghapus todolist yang nomonnya lebih dari yang ada maka nanti akan false
        System.out.println(result);

        showTodoList();
    }

    public static String inputUser(String ingpo){
        Scanner inputUser = new Scanner(System.in);
        System.out.print(ingpo + " : ");
        String input = inputUser.nextLine();

        return input;
    }

    //unit testinput
    public static void testInput(){
        var name = inputUser("masukan nama anda");
        System.out.println("hi "+name);
    }


    public static void viewShowTodoList(){
       while (true){
           showTodoList();
           System.out.println(" Menu : ");
           System.out.println("1. Tambah");
           System.out.println("2. Hapus");
           System.out.println("X. keluar");

           var input = inputUser("pilih");
           if(input.equals("1")){
               viewAddTodoList();
           } else if (input.equals("2")){
               viewRemoveTodoList();
           } else if (input.equals("x")){
               break;
           }else {
               System.out.println("***** Pilihan tidak tersedia *****");
           }
       }
    }

    //unit test viewShowTodoList
    public static void testviewShowTodoList(){
        addTodoList("bangun pagi");
        addTodoList("mandi");
        addTodoList("sarapan");
        addTodoList("berangkat kerja");
        viewShowTodoList();
    }

    public static void viewAddTodoList(){
        System.out.println("Menambah TODO");
        var todo = inputUser("todo (pilih x jika batal)" );
        if (todo.equals("x")){//akan tetap menampilkan todolist yang telah ada
            //batal
        }else{
            addTodoList(todo);
        }

    }

    public static void testviewAddTodoList(){
        addTodoList("bangun pagi");
        addTodoList("mandi");
        addTodoList("sarapan");
        addTodoList("berangkat kerja");

        viewAddTodoList();

        showTodoList();
    }


    public static void viewRemoveTodoList(){
        System.out.println("====== Menghapus ToDoList =======");

        var number = inputUser("Hapus nomor yang akan di hapus (x jika batal)  ");
        if(number.equals("x")){
//            batal
        }else{
            boolean sukses = removeTodoList(Integer.valueOf(number));
            if(!sukses){
                System.out.println("Gagal menghapus ToDoList "+number);
            }
        }
    }

    public static void testviewRemoveTodoList(){
        addTodoList("bangun pagi");
        addTodoList("mandi");
        addTodoList("sarapan");
        addTodoList("berangkat kerja");

        showTodoList();
        viewRemoveTodoList();
        showTodoList();

    }




}

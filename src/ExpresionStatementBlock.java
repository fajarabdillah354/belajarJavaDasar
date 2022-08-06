import java.util.Date;

public class ExpresionStatementBlock {
    public static void main(String[] args) {
//        1. exprsion(hanya berisi single value)

        String x;
        x = "fajar";
        System.out.println(x);

//        2. statement

//        a. assigment statement(pemberian tugas pada variabel)
        var tugas = "matdiks";
//        b. method invocation statement
        System.out.println("fajar abdillah ahmad");
//        c. increment
        int c = 20;
        c++;
        System.out.println(c);
//        d. object creation statement
        Date data = new Date();

      /* 3. block
        {
            isi block
                }
        */
        System.out.println();
    }
}

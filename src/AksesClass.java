import javax.xml.namespace.QName;

public class AksesClass {
    public static void main(String[] args) {
        var member1 = new CobaClass();
        member1.name = "fajar abdillah ahmad";//memanipulasi var name yang ada di class lain
        member1.addres = "jakarta timur";
        System.out.println("hi nama saya "+ member1.name +" "+ " saya berasal dari "+ member1.addres);

        System.out.println("saya tinggan di negara "+member1.country);

        member1.sayHello("udin",18);//mengaksees method yang ada di class lain


        /*
        pemanggilan construktor yang telah di buat dalam file lain
         */

        var orang = new CobaConstuctor("jokowidodo",59,"solo jawa tengah");

        System.out.println(orang.name);
        System.out.println(orang.umur);
        System.out.println(orang.addres);
        orang.Hey("ujhe");

        /* akses overloading constructor

         */
        CobaConstuctor orang2 = new CobaConstuctor("budi");

        CobaConstuctor orang3;
        orang3 = new CobaConstuctor();
        orang3.name = "fahmi";
        orang3.Hey("sandi");
    }



}

public class CobaConstuctor {

    String name;
    Integer umur;
    String addres;

    CobaConstuctor(String paramName, Integer paramUmur, String paramAddres){
        name = paramName;
        umur = paramUmur;
        addres = paramAddres;
    }//constructor sama dengan nama classnya

    CobaConstuctor(String paramName){
        this(paramName,null,null);
    }

    CobaConstuctor(){
        this(null);
    }
    void Hey(String paramName){
        System.out.println("hhey "+paramName+" "+"my name is "+name);
    }
}

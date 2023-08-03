package Gun28._03_Ornek;

public class Main {
    public static void main(String[] args) {


        Book kitap1=new Book();
        kitap1.name="GK YOLU";
        kitap1.publishYear=2023;
        kitap1.author="Faruk Çeker";
        System.out.println("1. kitap="+kitap1);


        Book kitap2=new Book("GreenCard Yolu",2023,"Cansu Çeker");
        Book kitap3=new Book("GreenCard Way",1991);

        System.out.println("kitap2 = " + kitap2);
        System.out.println("kitap3 = " + kitap3);









    }
}

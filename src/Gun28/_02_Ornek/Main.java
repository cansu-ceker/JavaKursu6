package Gun28._02_Ornek;

import Gun28._01_Ornek.Ogrenci;

public class Main {
    public static void main(String[] args) {



        Book book1=new Book();
        book1.name="GK YOLU";
        book1.publishYear=2023;
        book1.author="Faruk Çeker";
        System.out.println("1. kitap="+book1);


        Book book2=new Book("GreenCard Yolu",2023,"Cansu Çeker");
        Book book3=new Book("GreenCard Way",1991);


        System.out.println("2.kitap özellikleri = " + book2);
        System.out.println("3. kitap = " + book3);









    }
}

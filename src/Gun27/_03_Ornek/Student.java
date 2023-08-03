package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {

    String studentName;  //2.adım
    int ogrenciMaxSaat;

    //       bu Lesson dıger clas adındakı Lesson dan gelıyor
    ArrayList<Lesson>dersleri=new ArrayList<>();


    public void dersYazdir()
    {
        System.out.println("\n *** Transkript***");
        System.out.println("Sayın \t"+studentName);
        System.out.println("Aldığınız dersler aşağıdadır:");

     for ( Lesson d : this.dersleri)
         System.out.println(d.dersName+" "+d.dersSaat);
    }


    public static void universiteKurallari()   //6.adım
    {
        System.out.println("Kural 1: Çay ile gel.");
        System.out.println("Kural 2: Tekrar yap.");
        System.out.println("Kural 3: Başaracaksın inançlı ve sabırlı ol.");
    }





}

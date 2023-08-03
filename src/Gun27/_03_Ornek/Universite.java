package Gun27._03_Ornek;

import Gun25._02_Ornek.Ogrenci;

public class Universite {
    public static void main(String[] args) {

        Lesson ders1=new Lesson();  //3.adım
        Lesson ders2=new Lesson();
        Lesson ders3=new Lesson();

        ders1.dersName="Algoritma";
        ders1.dersSaat=6;
        ders2.dersName="Java";
        ders2.dersSaat=6;
        ders3.dersName="Test tool";
        ders3.dersSaat=8;


        Student ogr1=new Student(); //4.adım

        ogr1.studentName="Cansu";
        ogr1.ogrenciMaxSaat= 20;

        ogr1.dersleri.add(ders1);  //5.adım
        ogr1.dersleri.add(ders2);
        ogr1.dersleri.add(ders3);

        ogr1.dersYazdir();

        Student.universiteKurallari();







    }
}

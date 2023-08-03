package Gun25._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class okulMain {
    public static void main(String[] args) {

//        ogrenci ogr1=new ogrenci();
//        ogrenci ogr2=new ogrenci();
//        ogrenci ogr3=new ogrenci();

        // bunların YERİNE
                //ogrencı bu lıstenın tıpp ondan ogrencı yazdık, normalde buraya Integer Strıng falan derdik sımdı class ın adını yazıyoruz
        ArrayList<ogrenci>ogrenciler=new ArrayList<>();    // bunu yazdık.

        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        for (int i = 0 ; i <3 ; i++)
        {
            ogrenci ogr=new ogrenci();

            System.out.print("Öğrencinin adını girin=");
            ogr.adi=okuStr.nextLine();

            System.out.print("Öğrencinin soyadını girin=");
            ogr.soyadi=okuStr.nextLine();

            System.out.print("Öğrencinin sınıfını girin=");
            ogr.sinifi=okuInt.nextInt();

            System.out.print("Öğrencinin adresini girin=");
            ogr.adresi=okuStr.nextLine();

            ogrenciler.add(ogr);

        }

  for (  ogrenci o : ogrenciler)
  {
      System.out.println("o.adi = " + o.adi);
      System.out.println("o.soyadi = " + o.soyadi);
      System.out.println("o.sinifi = " + o.sinifi);
      System.out.println("o.adresi = " + o.adresi);


  }






















    }
}

package OOOOdev14_Class;

import java.util.ArrayList;
import java.util.Scanner;

public class Sinif {
    public static void main(String[] args)
    {
        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        ArrayList<Ogrenci> liste=new ArrayList<>();

        for (int i = 0 ; i <3 ; i++)
        {
            Ogrenci ogr=new Ogrenci();
            System.out.print("Öğrenci adı gir=");
            ogr.tamAdi=okuStr.nextLine();
            System.out.print("Öğrenci okul no gir=");
            ogr.okulNo=okuInt.nextInt();
            System.out.print("Öğrenci not gir=");
            ogr.notu=okuInt.nextInt();

            liste.add(ogr);
        }


          ogrenciler(liste);
        notOrtalamasi(liste);

    }

    public static void ogrenciler(ArrayList<Ogrenci> lst)
    {
        for ( Ogrenci e: lst)
            System.out.println("Öğrenci adı:"+e.tamAdi+"\t Okul no:"+ e.okulNo+"\t Öğrenci notu:"+e.notu);


    }


    public static void notOrtalamasi(ArrayList<Ogrenci> lst)
    {
          double toplam=0;
        for ( Ogrenci e : lst)
            toplam=toplam+e.notu;

double ortalama= toplam/lst.size();
        System.out.println("ortalama=" + ortalama);

    }

}



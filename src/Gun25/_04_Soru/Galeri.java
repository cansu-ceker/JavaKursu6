package Gun25._04_Soru;

import Gun25._03_Ornek.ogrenci;

import java.util.ArrayList;
import java.util.Scanner;

public class Galeri {
    public static void main(String[] args) {

        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        ArrayList<arabalar>aracList=new ArrayList<>();

        for (int i = 0 ; i <3 ; i++)
        {
            arabalar arc= new arabalar();

            System.out.print("Araba no girin=");
            arc.arabaNo=okuInt.nextInt();

            System.out.print("Arabanın markasını girin=");
            arc.marka=okuStr.nextLine();

            System.out.print("Araba üretim yılı girin=");
            arc.uretimYili=okuInt.nextInt();

            aracList.add(arc);
        }

        arabalarYazdir(aracList);
        uretimOrtalamasiYazdir(aracList);

    }
    public static void arabalarYazdir(ArrayList<arabalar>aracList)
    {
        for (  arabalar a : aracList)   // ArryaListte yazdıkların gıbı
            System.out.println(a.arabaNo+" "+a.marka+" "+a.uretimYili);

    }

    public static void uretimOrtalamasiYazdir(ArrayList<arabalar>aracList)
    {
        int toplamYil=0;
        for (  arabalar a : aracList)
            toplamYil=toplamYil+a.uretimYili;

        int ort=toplamYil/aracList.size();
        System.out.println("ort = " + ort);
        
    }

}

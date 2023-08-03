package OOOOdev9_Diziler;

public class Soru5 {
    public static void main(String[] args) {

        //String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        //Array'daki eleman sayısını yazdırınız.
        //Cevap 4 olmalı.

     String [] dizi= {"new jersey","new york","boston","California"};


        int elemanSayisi=0;

        for (int i = 0 ; i < dizi.length ; i++)
        {
          elemanSayisi++;
        }

        System.out.println("eleman sayısı = " + elemanSayisi);







    }
}

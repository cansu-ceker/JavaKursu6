package Gun21;

import java.util.ArrayList;

public class _01_list {
    public static void main(String[] args) {

   /* int[] dizi=new int[50];   uzunluk sabit.değiştirilemiyor.

int sayi; integer tipinde bir değişken

sayın java, bana öyle bir dizi tipi ver ki, ben ekledikçe boyu uzasın.sildikçe kısalsın

java derki : güzel olur tamam vericem.
Fakat şunu bil, kaç eleman olduğu belli ise şu ana kadar gösterdiğim dizi tipini kullan
çünkü bu hızlı çalışıyor,

senin istediğin DİNAMİK dizi olduğundan,bundan yavaş çalışacaktır

liste : eklersin silersin, boyu ona göre değişir.

    */

        // dizi,Array: boyut sayıısı belli sonradan değiştirilemez
   int [] dizi=new int[5];  // 5 elemanlı Array, boyutu değiştirilemez


        // boyutu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın
        // bunun adına ArrayList : boyutunu baştan vermen gerekmiyor. Başlangıçta boyut 0
        // eleman ekledikçe artar, sildikçe kısalır

        ArrayList<Integer>integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<String> isimler= new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet"); // uzunluk 1 oldu
        isimler.add("Metin"); // uzunluk 2 oldu
        isimler.add("Burak"); // uzunluk 3 oldu
        isimler.add("Cansu"); // uzunluk 4 oldu

        System.out.println("isimler = " + isimler);                //  [Ahmet, Metin, Burak, Cansu]
        System.out.println("isimler dizisinin uzunluğu = " + isimler.size());  // uzunluğunu verirp yazdırır :  4

        isimler.add(1,"Nurhayat");  //  verilen indekse ekledi : [Ahmet, Nurhayat, Metin, Burak, Cansu] oldu, 1 nolu indekse nurhayatı yazdı, index 0 dan basladıgından ahmet kaldı basta
        System.out.println("isimler = " + isimler);

        isimler.set(1,"Elife");  // verilen indeksteki elemanı değiştirir :[Ahmet, Elife, Metin, Burak, Cansu] oldu. 1. indeksteki değiştirdi yerine elife yazdı
        System.out.println("isimler = " + isimler);

        isimler.remove("Ahmet");  // Ahmet i sildi, parantez içine ahmet yazsaydı  olmazdı, uygulamazdı
        System.out.println("isimler = " + isimler);

        int indexOfMetin= isimler.indexOf("Metin");   //  Metin in indeksini verdi
        System.out.println("indexOfMetin = " + indexOfMetin);

        String ilkEleman = isimler.get(0);   // 0. elemanı ver
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear();   // sildi  hepsini
        System.out.println("isimler = " + isimler);






    }
}

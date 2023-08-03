package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        int sayi=5;   // hafızada sadece 1 sayı saklıyor
        int [] dizi=new int[6]; // hafızada 6 saklıyor, sabit bıyutlu
        ArrayList<Integer>liste=new ArrayList<>();   // boyu değişken, sınır yok

        // öyle bir dizi tipi olsun ki içinde  TEKRAR eden değerler OLMASIN
        // bazen istersem, her zaman sıralı olsun
        // bazen istersem, eklendiği sırada sıralı olsun
        // bazen de yeter ki hızlı çalışsın, sıra önemli olmasın
        // SET ler adı verilen özel diziler var

        //   HashSet        -> ekledikçe hızlı çalışmak için kendine göre bir sırada tutuyor
        //   LinkedHashSet  -> ekledikçe, eklenme sırasına göre tutar
        //   TreeSet        -> ekledikçe, onları her zaman sıralı tutuyor,int se küçükten büyüğe,  String se alfabetik sıra

        // bunların ortak özelliği TEKRAR eden DEĞER YOK ve INDEX YOK


        HashSet<Integer> hs1= new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        boolean eklendiMİ=hs1.add(5);  // tekrar eklendi, acaba diziye kabul etti mi? etmedi. tekrara izin yok
        hs1.add(2);  // tekrar eklendi,acaba diziye kabul etti mi?

        System.out.println("hs1 = " + hs1);
        System.out.println("eklendiMİ = " + eklendiMİ); // false, eklenmedi yani








    }
}

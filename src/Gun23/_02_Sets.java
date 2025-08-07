package Gun23;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {

        //SETS            : eleman mantıgı yok set set dusunur
        // HashSet        : Hızlı, bunun için kendine göre  sırada tutar
        // LinkedHashSet  : EKLENME SIRASI na göre sıralı tutar
        // TreeSet        : her zaman içinde SIRALI tutar, kendinden sortlu, ALFABETİK SIRALI eger String ise
        //                                                                   SAYISAL SIRALI eger int ise

        HashSet<String>hs=new HashSet<>(); // kafasına gore sırasız hızlıca calısmak ıcın 
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        hs.add("bir");  // bunu eklemez çünkü TEKRAR EDENİ YAZMAZ
        System.out.println("hs = " + hs);


        LinkedHashSet<String>lhs=new LinkedHashSet<>();   // hangı sırayla eklendıyse oyle yazdırdı
        lhs.add("bir");
        lhs.add("yedi");
        lhs.add("sekiz");
        lhs.add("dört");
        lhs.add("iki");
        lhs.add("bir"); // bunu eklemez çünkü TEKRAR EDENİ YAZMAZ
        System.out.println("lhs = " + lhs);

        TreeSet<String> ts=new TreeSet<>();  // alfabetık sırayla a b c d... yazdırdı
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        ts.add("bir"); // bunu eklemez çünkü TEKRAR EDENİ YAZMAZ
        System.out.println("ts = " + ts);

        TreeSet<Integer> tsInt=new TreeSet<>();
        tsInt.add(5);
        tsInt.add(89);
        tsInt.add(70);
        tsInt.add(52);
        tsInt.add(21);
        tsInt.add(0);
        System.out.println("tsInt = " + tsInt);




    }
}

package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hm =new HashMap<>();

        hm.put(1001,"Ismet Temur");
        hm.put(1002, "Yusuf Yılmaz");
        hm.put(2001, "Buğra Yıldız");
        hm.put(5001, "Elife Sözen");
        hm.put(1002, "Seda Parça");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for ( Integer k : hm.keySet())  // anahtarları bu şekilde tek tek alabilirsin
            System.out.print(k+ "\t");

        System.out.println(); // bır satır atlasın ekranda dıye bunu koyduk

        for (String v : hm.values())    // değerleri bu şekilde tek tek alabilirsin
            System.out.print(v+ "\t");

        System.out.println();



        System.out.println("hm = " + hm);  // bu fotograf gbı verıyor run yapınca

        for (Map.Entry<Integer,String> kv : hm.entrySet())            //*********************
            System.out.println(kv.getKey()+ " - "+kv.getValue());

        /*
                    2001 - Buğra Yıldız
                    1001 - Ismet Temur
                    5001 - Elife Sözen
                    1002 - Seda Parça,

                    seklınde aldık anahtar ve degerlerı son foreach ıle
                    burada fotograf gbı degıl degerlerı almıs oluyrouz
         */


    }
}

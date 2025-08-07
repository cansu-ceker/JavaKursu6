package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {

        HashSet<String>renler=new HashSet<>();
        renler.add("Red");
        renler.add("red");    // R r farklı yanı aynı dıye dusunmez
        renler.add("Green");
        renler.add("Blue");
        renler.add("RED");
        System.out.println("renler = " + renler);   //  kendine göre  sıralar yanı belli bir SIRA YOK
                                                    // mesela cıktısı şu : renler = [Red, red, RED, Blue, Green]



        //ekrana TEK TEK yazdırma aşağıdaki gbi yapılır. Bunlarda indeks olmadıgından bu sekılde :

        for (String eleman: renler)  // sıra garanti değil, olabilir de olmayabilir de buna foreach denir
        {
            System.out.println("eleman = " + eleman);    //eleman = Red
                                                         //eleman = red
                                                         //eleman = RED gbı tek tek yazdırır
        }



        // set in kendi sırası nasıl ise onun aynısını verir
                                                  // gostergeyı yanı itarator tanımladık
        Iterator gosterge= renler.iterator();     // itelemek gibi düşünebilirsin, hafızadaki sırayı garanti ediyor
        while (gosterge.hasNext())    // sırada eleman var ise demek
        {
            System.out.println("gosterge.next() = " + gosterge.next());  // .Next   göstergenin gösterdiği elemanı temsil ediyor

        }


        // bunun adı FOREACH, sıra garantı degıl

        Integer []dizi={34,5,6,7,8,89,899,77};
        for (Integer eleman : dizi)
            System.out.println("eleman = " + eleman);

        ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(dizi));
        for (Integer e:liste)
            System.out.println("e="+e);




    }
}

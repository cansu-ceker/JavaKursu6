package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _04_JavaMap {
    public static void main(String[] args) {

        // bir kartvizit uygulamasını 2 kişi için yapın

        Map<String,String> ugurKartVizit=new HashMap<>();
        ugurKartVizit.put("isim","Uğur Yılmaz");
        ugurKartVizit.put("email","ugur@gmail.com");
        ugurKartVizit.put("adres","çekmeköy/istanbul");
        ugurKartVizit.put("telefon","050566677788");

        System.out.println("ugurKartVizit.get(isim) = " + ugurKartVizit.get("isim"));
        System.out.println("ugurKartVizit.get(email) = " + ugurKartVizit.get("email"));


        Map<String,String> zaferKartVizit=new HashMap<>();
        zaferKartVizit.put("isim","Zafer Canlı");
        zaferKartVizit.put("email","zafer@gmail.com");
        zaferKartVizit.put("adres","ümraniye/istanbul");
        zaferKartVizit.put("telefon","055566677788");


         // mapleri baska bır map e ekleme ıslemı:
        // Map< String,String>... ti ya yukarıda
        //            ,2. String yerine  Map<String,String>  yazdık, yani zaferKartvizitin içindekilerin tipini attık
        Map< String, Map<String,String> > kartvizitler=new HashMap<>();   // yukarıdaki kartvızıtlerı yanı ikisini tek bir mape koyma işlemi bu
 //          ugur,   ugurKartVizit   bunların turlerı

        kartvizitler.put("uğur",ugurKartVizit);
        kartvizitler.put("zafer",zaferKartVizit);
        //  ugur keyi  ugurtkartvızıt valuelarını VE
        // zafer keyi zafer akrtvızıt valuelerını , kartvızıtler e atadı

        //zaferin adresi
        System.out.println( kartvizitler.get("zafer").get("email") );

        //ugurun emaili
        System.out.println( kartvizitler.get("uğur").get("email"));


        // hepsini foreach ile yazdırma:
        // Map.Entry -- entrySet  lerden  1 tanesi demek
        // entrySet() --- keys+values demek


        for(Map.Entry<String, Map<String,String> > kv : kartvizitler.entrySet()) // entrySet() keys+values
        {
            System.out.println("kv = " + kv);

           System.out.println(kv.getValue());

            System.out.println(kv.getValue().get("email"));
            //                                kv.getValue() -- bu bir bütün,HashMap o yuzden boelemyoz
            //                                  getValue() dedıgımız  ugurKartVizit + zaferKartVizit once bunları bunlardan da emaili getir.
            // kartvizitler.put("uğur",ugurKartVizit);
            // kartvizitler.put("zafer",zaferKartVizit);

        }











    }
}

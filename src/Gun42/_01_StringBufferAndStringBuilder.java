package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        String cumle="";
        cumle=cumle+"Bugün";   // cümle Bugün oldu
        cumle=cumle+" hava";
        cumle+="  çok soğuk";

        System.out.println("cumle = " + cumle);

        System.out.println(cumle+" değil mi"); // cevap   Bugün hava çok soğuk değil mi, ama atama yapamdık  uzerıne ekledık elle yazdık

        System.out.println("cumle.concat(\"dün değildi.\") = " + cumle.concat("  dün değildi."));  //cevap   Bugün hava çok soğuk dün değildi, ama halan aslında cumle degısmedı yıne ekleme yapmıs olduk

        cumle.concat(" merhaba"); // cümlenin değeri değişmez, atama gerektirir
        cumle=cumle.concat(" MERHABA");  // eşitleme var, atama yapıldı, cümlenin değeri değişir

        /****************************************** StringBuilder *****************************************************/
        // bigisayar string islemler yaparken yoruluyor, evet yıne hızlı yapıyor ama o cok hızlı yaptıgı ıslemlere gore
        // concat, + bunlar yavsa kalıyor bu sebpele ozel bır sınıf uretmısler, StringBuilder, bu concat vs + ya a göre cok hızlı.

        StringBuilder cumle2=new StringBuilder();
        cumle2.append("BUGÜN");                             // append: eklemek, iliştirmek
        cumle2.append(" HAVA");                             // direk kendisine atama işlemi yapar eşitleme gerekmiyor
        cumle2.append(" SOĞUK");
        System.out.println("cumle2 = " + cumle2);

        /************************* +, concat, StringBuilder -> bu 3 modelin hız testi*************************************/
        long startTime= System.currentTimeMillis();
        String test1="";
        for (int i = 0 ; i <1000 ; i++)
        {
        test1=test1+" merhaba";
        }
        System.out.println(" + için geçen süre= "+(System.currentTimeMillis()-startTime)+ " ms"  );  //3584 ms


        startTime=System.currentTimeMillis();
        String test2="";
        for (int i = 0 ; i <1000 ; i++)
        {
            test2=test2.concat(" merhaba");
        }
        System.out.println(" concat için geçen süre= "+(System.currentTimeMillis()-startTime)+ " ms"  );  //3263 ms


        startTime=System.currentTimeMillis();
        StringBuilder test3= new StringBuilder();
        for (int i = 0 ; i <1000 ; i++)
        {
            test3.append(" merhaba");
        }
        System.out.println(" StringBuilder için geçen süre= "+(System.currentTimeMillis()-startTime)+ " ms"  );  //1 ms

// Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

//        concat : birleştirme
//        append : sonuna ekleme


        System.out.println("**********************************************************");
        // StringBuilder i yakından tanıyalım

        StringBuilder sb=new StringBuilder();
        sb.append("Bugün ");
        sb.append("hava ");
        sb.append("biraz soğuk ");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4);
        System.out.println("sb = " + sb);

        sb.reverse();                                 // String i ters çeviriyor
        System.out.println("sb = " + sb);
        sb.reverse();                                 // yine terse çevirdi, düzeldi eski haline gekdi yani - TERS ÇEVİRME İŞLEMİ
        System.out.println("sb = " + sb);

        sb.delete(0,5);                              // index 0 dahil 5 hariç, silme yapıyor- yazdırınca 0-5 arasını sıldıgını goruruz- ARALIKSAL SİLME İŞLEMİ
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3);                          // index 3 tekini sil, sadece belırtılen ındextekı karakterı sıler -İNDEX SİLME İŞLEMİ
        System.out.println("sb = " + sb);

        sb.insert(5,"kelime");                       // 5 nolu indexe kelimeyi ekle -ARAYA EKLEME İŞLEMİ
        System.out.println("sb = " + sb);

       String parca= sb.substring(5,8);             //5 dahil 8 değil
        System.out.println("parca = " + parca);


        // String fonksiyonlarını kullanmak için toString demek yeterli
        sb.toString().endsWith("az");


        sb.replace(5,8,"saç");  //  5 dahil 8 degıl, cumlede olan verilen aralıktakileri  siler onların yerine bu() ıcınde  verilen kelimeyi ekler
        System.out.println("sb = " + sb);

        sb=new StringBuilder(); // dersek tamamen sıfırlamak yenilemek içini boşlatmak oluyor
        sb=new StringBuilder("bugun çok havalısın maşallah"); // bu şekilde ilk atama da yapılabilir


     StringBuffer sBuffer =new StringBuffer(); // tamamen StringBuilder ile aynı
        // tek farkı paralel çalışan yazılımlar için kullanılır. buılderdan once buffer vardı.
        // oyunda aynı anda 2 deusman cıktı, altta da sureklı cıkan dusmenları yazan bır swey var, aynı anda olunca nasıl olcak,
        // her ıkısını da paral lolarak takıp edılebılsın dıye bufferı cıkarmıslar ama programlarda cok olmadıgı ıcın paralel calısma
        // sonrada buılderı yaratmıslar, paralel olarak calısmayan daha cok kullanılıyor dıye buılder cıkarmıslar


















    }
}

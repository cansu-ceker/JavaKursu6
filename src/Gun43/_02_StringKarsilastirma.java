package Gun43;

public class _02_StringKarsilastirma {
    public static void main(String[] args) {

        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";



        // İLKEL tipleri karşılaştırdığından 2 sinde de DEĞERLERİ KARŞILAŞTIRIR
        // çünkü başka bir şeyi yok


        if (cumle1==cumle2)                                   // String ifade burada ilkel tip gibi davrandığından eşit çıkacak sonuç
            System.out.println("cumle1 ve cumle2 eşit");
        else
            System.out.println("cumle1 ve cumle2 eşit DEĞİL");


        if (cumle1.equals(cumle2))                            // String ifade burada ilkel tip gibi davrandığından eşit çıkacak sonuç
            System.out.println("cumle1 ve cumle2 eşit");
        else
            System.out.println("cumle1 ve cumle2 eşit DEĞİL");


        // REFERANS tiplerde ise durum
        // scanner le okuduğundan aşağıdaki gibi  referans olarka alıyor vereferansalrı karşılaştırır

        String cumle3= new String("Bugün hava çok güzel");
        String cumle4= new String("Bugün hava çok güzel");



        if (cumle3==cumle4)       // = = referans tiplerde referansları aynı mı, bunun manası referansları aynı mı yı sordu , AYNI DEĞİL biri cumle3 biri cumle4
            System.out.println("cumle3 ve cumle4 eşit");
        else
            System.out.println("cumle3 ve cumle4 eşit DEĞİL");


        if (cumle3.equals(cumle4))   // bunun manası DEĞERLERİ aynı mı , equals HER ZAMAN DEĞERLERİ KARŞILAŞTIRIR
            System.out.println("cumle3 ve cumle4 eşit");
        else
            System.out.println("cumle3 ve cumle4 eşit DEĞİL");



        // ÖZET : Nesne (String) ve referans (dizi, ArrayList, Nesneler) tiplerde
        //        String te HER ZAMAN equals kullanılır
        //        int gbi vs  İlkel (Sayısal, boolean) tiplerde == kullanılır




    }
}

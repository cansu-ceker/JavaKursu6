package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _02_JavaLocalDate {
    public static void main(String[] args) {

        //LocalDate sadece gun ay yıl bilgisini tutar

        LocalDate tarih =LocalDate.now();  // şu andaki tarihi verir--------------- Local den tarihi aldım

        DateTimeFormatter ozel6= DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");   //--------------------------- istedigim formatı kendım yazdım,olusturdum
        System.out.println("tarih.format(ozel6) = " + tarih.format(ozel6)); // Temmuz 19 Çarşamba 2023------------  aldıgım bugunun tarıhını, yazdıgım olusturdugum formatta ekrana yazdır

        System.out.println("**************************** başka dilde formatta gösterimi ******************************");

        // local den aldığım tarihi, oluşturdugum formatta fakat BASKA DİLDE gösterimi
        System.out.println("tarih.format(ozel6) = " + tarih.format(ozel6.withLocale(Locale.GERMANY)));   // Juli 19 Mittwoch 2023
                                                     // lokalde aldıgım tarihi almanya tipinde gösterir



    // Lokalizasyon  tanımlaması ne demek
    // en-US
    // en-UK  : İngilte nın ingilizce konuşulan lokalizasyonu (bölgesi)
    // fr-CA  : Kanada nın fransızca konuşulan lokalizasyonu (bölgesi)
    // en-CA  : Kanada nın ingilizce konuşulan lokalizasyonu (bölgesi)
    // tr-TR  : Türkiye'nin Türkçe konuşulan bölgesi


        Locale lCince=new Locale("zh","CH");  // çin in zh konuşulan bölgesi
        System.out.println("çince tarih = " + tarih.format(ozel6.withLocale(lCince)));

     // esksık şu an   System.out.println("tarih.format(ozel6) = " + tarih.format(ozel6.withLocale(Locale.getDefault())));   // Locale. yapoınca mesele turkıye ıspanya vs cıkmıyor o yuzden,


        // kullanılabilir Local leri bulma
        Locale [] kullanilabilirLokaller=Locale.getAvailableLocales();
        for ( Locale l : kullanilabilirLokaller)
        {
            if (!l.getDisplayLanguage().toLowerCase().contains("ind")) continue;   // hepsını kucuge cevır, içinde ind olanların, haricindeki tum  hepsini pas gec
                                                                                   //                                             bastakı !

            System.out.print("Dili=" + l.getDisplayLanguage());
            System.out.print(",Ülkesi=" + l.getDisplayCountry());

            System.out.print(",Dili=" + l.getLanguage());
            System.out.print(",Ülkesi=" + l.getCountry());
            System.out.println();
        }

        Locale lTurkiye = new Locale("tr","TR");
        System.out.println("tarih = " + tarih.format(ozel6.withLocale(lTurkiye)));

        System.out.println("\n*********************************************");
        // tarih= 2053 -5- 20 ; gibi kendimiz bir tarihi nasıl set ederiz
        LocalDate tarih1=LocalDate.of(2053,5,20);
        LocalDate tarih2=LocalDate.of(2053, Month.MAY,20);
        System.out.println("tarih2.format(ozel6) = " + tarih2.format(ozel6));













    }
}

package Gun40;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {

    //LocalDate sadece gun ay yıl bilgisini tutar
        
        LocalDate tarih =LocalDate.now();  // şu andaki tarihi verir
        System.out.println("tarih = " + tarih); 
        System.out.println("yılını ver = " + tarih.getYear());
        System.out.println("ayını ver = " + tarih.getMonth());
        System.out.println("ay değerini ver,kaçıncı ay = " + tarih.getMonthValue());
        System.out.println("ayın kaçıncı günü = " + tarih.getDayOfMonth());
        System.out.println("haftanın hangi günü = " + tarih.getDayOfWeek());
        System.out.println("haftanın kaçıncı günü = " + tarih.getDayOfWeek().getValue());
        System.out.println("yılın kaçıncı günü = " + tarih.getDayOfYear());
        
        
        //kendisindeki hazır formatlara bakalım
        System.out.println("ISO_DATE="+tarih.format(DateTimeFormatter.ISO_DATE));   // 2023-07-19 yıl-ay-gün şeklinde yazdırır
        System.out.println("SHORT="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));   //  19.07.2023
        System.out.println("MEDIUM="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))); //  19.Tem.2023
        System.out.println("LONG="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));  // 19 Temmuz 2023 Çarşamba
        System.out.println("FULL="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL))); //  19 Temmuz 2023 Çarşamba


        //istediğimiz formatta gösterim
        System.out.println("\n****************** istediğimiz formatta gösterim *********************");

        System.out.println("tarih = " + tarih);  // 2023-07-19

        DateTimeFormatter ozelFormat= DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        System.out.println("tarihhhh. = " + tarih.format(ozelFormat)); //  19/07/2023

        DateTimeFormatter ozel2= DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih.format(ozel2) = " + tarih.format(ozel2)); // 19.7.23

        DateTimeFormatter ozel3= DateTimeFormatter.ofPattern("EEEE  dd.MM.yyyy");
        System.out.println("tarih.format(ozel3) = " + tarih.format(ozel3)); //  Çarşamba  19.07.2023

        DateTimeFormatter ozel4= DateTimeFormatter.ofPattern("EE dd.MM.yyyy");  // 2 tane EE olunca kısaltılmış yazıyor: Çar dedi mesela
        System.out.println("tarih.format(ozel4) = " + tarih.format(ozel4)); // Çar 19.07.2023

        DateTimeFormatter ozel5= DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.yyyy");
        System.out.println("tarih.format(ozel5) = " + tarih.format(ozel5)); //  Temmuz Çarşamba 19.07.2023

        DateTimeFormatter ozel6= DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("tarih.format(ozel6) = " + tarih.format(ozel6)); // Temmuz 19 Çarşamba 2023
        // System.out.println("ozel6 = " + ozel6);  // bu sekılde olmaz, ozel6 bır formattır ve  formatı dırekt yazdıramayız     ****************************

       // tek kalemde şu şekilde de yazılabilir
          System.out.println("tarih.format(ozel6) = " + tarih.format(DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy")));
                                                      // tarihi, bu paterne sahip formattan ver

        // guunu ozel4 formatna gore goster
        //  tarıhı ozel6 formatına gore goster gıbı okucaz bunu



















        
    }
}

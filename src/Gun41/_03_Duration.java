package Gun41;

import javax.jws.soap.SOAPBinding;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _03_Duration {
    public static void main(String[] args) {

        // Duration : LocalTime ve LokalDateTime lar arası fark için kullanılır
        // yani ortada bir saat varsa farkta, Duration kullanılır


        long startTime=System.currentTimeMillis();

        //LocalTime
        LocalTime dersBalangic=LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(21,50,5);

        Duration gunlukDersSuresi=Duration.between(dersBalangic,dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);

        System.out.println("gunlukDersSuresi.toDays() = " + gunlukDersSuresi.toDays());
        System.out.println("gunlukDersSuresi.toHours() = " + gunlukDersSuresi.toHours());
        System.out.println("gunlukDersSuresi.toMinutes() = " + gunlukDersSuresi.toMinutes());
        System.out.println("gunlukDersSuresi.getSeconds() = " + gunlukDersSuresi.getSeconds());
        System.out.println("gunlukDersSuresi.toMillis() = " + gunlukDersSuresi.toMillis());
        System.out.println("gunlukDersSuresi.toNanos() = " + gunlukDersSuresi.toNanos());


        System.out.println("*************************** LocalDateTime **********************************************");
        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);  // yıl-ay-gun-saat-dakıka
        LocalDateTime to  =LocalDateTime.now(); // bugün

        Duration fark= Duration.between(from,to);
        System.out.println("fark = " + fark);

        System.out.println("fark.toDays() = " + fark.toDays());  //farkın toplam gunu
        System.out.println("fark.toHours() = " + fark.toHours());  //farkın toplam saati
        System.out.println("fark.toMinutes() = " + fark.toMinutes()); // farkın toplam dakikası


        System.out.println("*************************** Kodun Performansı **********************************************");
        long finishTime=System.currentTimeMillis();
        System.out.println("finish-startTime = " + (finishTime-startTime));



















    }
}

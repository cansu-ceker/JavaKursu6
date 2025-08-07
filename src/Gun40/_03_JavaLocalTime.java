package Gun40;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _03_JavaLocalTime {
    public static void main(String[] args) {

        // LocalTime : Tarih bilgisi içermez sadece saat,dakika, saniye, nano sanıye

        LocalTime saat= LocalTime.now();
        System.out.println("saat = " + saat);  //21:24:02.094 (şu an saat bu)

        System.out.println("saat.getHour() = " + saat.getHour());  //21
        System.out.println("saat.getMinute() = " + saat.getMinute()); //24
        System.out.println("saat.getSecond() = " + saat.getSecond()); //2
        System.out.println("saat.getNano() = " + saat.getNano()); //94000000


        // kendimiz özel format verelim
        DateTimeFormatter of1= DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("saat hh:mm:ss = " +saat.format(of1));  // saati özelformat1 e göre yazdır  09:24:02

        DateTimeFormatter of2= DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("saat kk:mm = " +saat.format(of2));   // 21:24

        DateTimeFormatter of3= DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("saat hh:mm a  = " +saat.format(of3));  // 09:24:02 PM

        System.out.println("******************************************************************");

        LocalTime saat1=LocalTime.of(7,34,45);   // saat bilgisi set etme
        System.out.println("saat1.format(of3) = " + saat1.format(of3));  //07:34:45 AM
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
}

package Gun40;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class _04_Soru {
    public static void main(String[] args) throws InterruptedException {

        // canlı dijital saat yapınız
        // 21:32:45 --> 21:32:46  --> 21:32:47...  21:33:00 --> ... devam

        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk:mm:ss");


        while(true)
        {
            LocalTime saat= LocalTime.now();
            System.out.print("\r " + saat.format(f));   // \r silip üstüne yazıyor bir siliyor bır yazıyor, sil yaz , sil yaz
            // 1 sn bekletme
            Thread.sleep(1000);
        }













    }
}

package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _08_Soru_benYazdimKodDOgruDEGIL {
    public static void main(String[] args) throws InterruptedException {

        // şuanki saati  geriye doğru saniye saniye saydırınız
        // kullanıcıdan alınan saati geriye doğru  saniye saniye  saydırınız
        //19:35:56 formatındaki

        Scanner okuStr=new Scanner(System.in);

        System.out.print("saati giriniz (10:10:10) şeklinde = ");
        String saat=okuStr.nextLine();

        DateTimeFormatter f= DateTimeFormatter.ofPattern("kk:mm:ss");
        LocalTime time= LocalTime.parse (saat,f);

        LocalTime son=LocalTime.of(0,0,0);

        do {

            System.out.print("\r " + time.format(f));
            Thread.sleep(1000);

        }while (son.getHour()==0);



















    }
}

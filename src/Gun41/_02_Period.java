package Gun41;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {
        
        // Period : 2 tarih arasındaki farkı tutar
        // LocalDate ler için kullanılır

        LocalDate dogumTarihi = LocalDate.of(1991,4,15);   // formatı bu sekılde bunn
        LocalDate buGun= LocalDate.now();

        Period fark=Period.between(dogumTarihi,buGun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+ " Yaşındasınız.");

        /**************************************************************************************************/

        Period  period3Gun = Period.ofDays(3);
        Period  period4Ay = Period.ofMonths(4);

        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period4Ay = " + period4Ay);

        LocalDate ucGunSonra= buGun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucGunSonra2=buGun.plusDays(3);
        System.out.println("ucGunSonra2 = " + ucGunSonra2);

        LocalDate dortAySonra = buGun.plus(period4Ay);
        System.out.println("dortAySonra = " + dortAySonra);


        System.out.println( "**************************************************************************************************");
        // 1.Soru: Kursun bitiş tarihini ve gününü bulunuz 6 ay : 15.05.2023

        LocalDate kursBaslangic=LocalDate.of(2023,5,15);
        Period kursSuresi= Period.ofMonths(6);
        LocalDate kursBitis= kursBaslangic.plus(kursSuresi);
        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis günü = " + kursBitis.getDayOfWeek());



        System.out.println( "**************************************************************************************************");
        // 2.Soru: Kursun bitmesine ne kadar süre kaldı?  zaman aralığıdır bu yani Periyod alıcaz

                                      //küçüğü yanı eskı zamanı önce yazmalısın once bugunu ılerıkı tarıhı sonra
        Period kalanSure=Period.between(buGun,kursBitis);
        System.out.println("kalanSure = " + kalanSure);




        System.out.println( "**************************************************************************************************");
        // 3.Soru: Kurs ne kadar süredir devam ediyor? zaman aralığıdır bu yani Periyod alıcaz

        Period suAnaKadarkiDevamSuresi=Period.between(kursBaslangic,buGun);
        System.out.println("suAnaKadarkiDevamSuresi = " + suAnaKadarkiDevamSuresi);































    }
}

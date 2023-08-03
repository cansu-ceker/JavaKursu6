package Gun41;

import java.time.LocalDate;

public class _05_ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate buGun=LocalDate.now();
        LocalDate dun=buGun.minusDays(1);

        boolean sonraMi = buGun.isAfter(dun); // bugun dünden sonra mı
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi= buGun.isBefore(dun); // bugun dunden once mi
        System.out.println("onceMi = " + onceMi);

        boolean esitMi =buGun.isEqual(dun);  // bugun düne eşit mi
        System.out.println("esitMi = " + esitMi);

        boolean artikYilMi= buGun.isLeapYear(); // bugunun bulundugu yıl artık yıl mı
        System.out.println("artikYilMi = " + artikYilMi);









    }
}

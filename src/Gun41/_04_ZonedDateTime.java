package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) {

        ZonedDateTime zdt=ZonedDateTime.now(); // şu anda benim bulunduğum yerşn default zamanını veriyor, LocalDateTime.now(); gibi
        // diğer zonelar için ZonedDateTime.now(ZoneId);

        System.out.println("zdt = " + zdt);
        //zdt = 2023-07-20T21:03:16.805+03:00[Asia/Istanbul]
        // Asia/Istanbul   : ZoneId

       // Locale.getAvailableLocales(); gibi

        Set<String> zamanZoneIdleri = ZoneId.getAvailableZoneIds();
        for ( String z : zamanZoneIdleri)
        {

            if (!z.toLowerCase().contains("bul"))
            continue;

            System.out.println("z = " + z);

        }

        ZoneId zoneIdIstanbul =ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul =ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);
        // zoneIstanbul = 2023-07-20T21:14:08.719+03:00[Europe/Istanbul]









    }
}

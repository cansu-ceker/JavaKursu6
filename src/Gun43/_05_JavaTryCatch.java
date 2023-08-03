package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _05_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı.");

        try { // dene, hatanın başladığı yerin üstüne konur

        LocalDate tarih=LocalDate.of(2023, Month.FEBRUARY,30); //Runtime Error

        }  // hata olduğu zaman programı kırma

        catch (Exception ex)    // ex isimli değişkende oluşan hataların bilgisi atanıyor
        { // hata olduğunda yapılması istenenler buraya yazılıyor

            System.out.println("Hata oluştu."+ex);
            System.out.println("ex.getMessage() = " + ex.getMessage());
            // log tutabilirsin, ekran fotoğrafını alabilirsin

        }

        System.out.println("Program bitti.");

        // kurstaki hata durum yönetimi

        try {

            // java Toolları çalışmaya devam et
            // konuları grupla çalışmaya devam
            // anlamadığın yerler mi oldu, runtime error
        }
        catch (Exception ex)
        {
            //hatanın sebebini anla
            // daha fazla odaklan
            // anlamadığın yerleri sor
            // videoları tekrar izle
            // grup çalışmasına  devam et
        }







    }
}

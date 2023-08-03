package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        //tipi     adı     başlangıç değeri
        //int      sayi  =  5;

                                                          // (System.in)
        //tipi     adı      yeni bir tane okuyucu oluştur (klavyeden-konsoldan)
        Scanner   okuyucu = new Scanner(System.in);

        System.out.print("Sayı Giriniz =");
        int okunan=okuyucu.nextInt();   //klavyeden girilen TAMSAYIyı oku
                                      //rakam girilip entera basılınca değeri alıp okunan a atıyor
        System.out.println("okunan = " + okunan);
        System.out.println("Bitti.");

        /* ilk komutta okutma işlemi nasıl yaptırcaz onu yazdık,
           konsoldan klavyeden sana giriş yapılcak oradan okuyacaksın dedık,
           mesela 17 okudu

           2. komutta, o okudugunu int yap dedik, int x=17 işlemini yaptırdık, eğer ilk girdiğimiz sayı değil kelime olsaydı String yapardık

           yazdırdık sonraki komutlarda da
         */


    }
}

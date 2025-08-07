package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1=new Kisi();
        //kisi1.ad="İsmet";
        //kisi1.soyad="temur";
        //kisi1.yas=25;

        // guvenlı kullanım ıcın ve programda olusabılecek bır hatayı engellmeek ıcın dırekt kullanıcının yazdıgını kabul etmek yerıne metod yapıp kontrol edıyoruz

        kisi1.yasAta(-25);
        kisi1.setAd("cansu");
        kisi1.setSoyad("çeker");

        System.out.println(kisi1.yasVer());
        System.out.println(kisi1.getAd());
        System.out.println(kisi1.getSoyad());






/*
    değişkene direkt erişimi kapatıp  yani private yaparak şu sekkılde private int yas;
    bir metod ile korumalı veri gonderme ve alma işlemine Encapsulation denir.


    veri atarken kullanıcının hata yapmasını engellemek için
            private  String ad;
            private String soyad;
            private int yas;   bunları private yaparak korumaya aldık

    veri atarken kullanıcının hata yapıp yapmadıgını kontrol edecek metodlar yaptık

    boylece guvenlı bır verı atama yapmıs olduk. ıste bu ısleme  Encapsulation denir.

          birazfazla kod yazmak gerekıyor
          ama
          verı guvenlıgını saglıyor

 */

    }
}

package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1=new Kisi();
        //kisi1.ad="İsmet";
        //kisi1.soyad="temur";
        //kisi1.yas=25;

        kisi1.yasAta(-25);
        kisi1.setAd("cansu");
        kisi1.setSoyad("çeker");


        System.out.println(kisi1.getAd());
        System.out.println(kisi1.getSoyad());
        System.out.println(kisi1.yasVer());

        // değişkene direkt erişimi kapatıp
        // bir metod ile korumalı veri gonderme ve alma
        // işlemine Encapsulation denir.



    }
}

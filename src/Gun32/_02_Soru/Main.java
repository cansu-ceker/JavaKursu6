package Gun32._02_Soru;

public class Main {
    public static void main(String[] args) {


        Araba arb1=new Araba();
        arb1.setRenk("kırmızı");
        arb1.setModel(2025);
        arb1.setKapiSayisi(8);
        arb1.setMotorHacmi(1255);

        System.out.println("arb1 = " + arb1);

        Araba arb2=new Araba("siyah", 2045, 5000, 23);  // bu sekılde gırıste 23 u dırekt atayamasın dıye hata yı engllemek adına Araba classın ıcındekı ublic Araba(String renk, int model, int motorHacmi, int kapiSayisi) metodunda setRenk(renk ) gbı kontrol asamaları yaptık zaten onları getter setter dan yapmıstır o yaptıklarımı aldık bu metodun ıcıne koyduk bu sekılde arabaya atama yapılırsa da uygun mu gırılen verıler kontrol edılsın dıye
        System.out.println("arb2 = " + arb2);

    }
/*
       KURAL: genel yazılım kuralıdır
             bütün değişkenler private yapılır
             yani kapsulleme ile kullanılır
             eğer gerekiyorsa private kaldırılır

         private olunca gettersetter yaparak kapsulleme yapılması zorunludur


 */



}

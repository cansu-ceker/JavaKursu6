package Gun30._01_StaticVariables.Ornek1;

public class Ogrenci {

    String ad;
    String soyad;
  // String okulAd;  //bu sekılde yaparsak her ogrencıde tek tek okulunu da yazdırmanın ıcıne eklememız lazım ama her ogrencının okulu aynı dolayıysla asagıdakı gbı static dedık sen bır tanesın dedık

    static String okulAd="Atatürk İlkokulu";
    // kod adı : sen bir tanesin dolayısıyla direkt adını verebiliriz


    public  Ogrenci(String ad, String soyad)
    {
        this.ad=ad;
        this.soyad=soyad;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }

}

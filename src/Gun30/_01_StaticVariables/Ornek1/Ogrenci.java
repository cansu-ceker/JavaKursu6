package Gun30._01_StaticVariables.Ornek1;

public class Ogrenci {

    String ad;
    String soyad;
  // String okulAd;  //bu sekılde yaparsak her ogrencıde tek tek okulunu da yazdırmanın ıcıne eklememız lazım ama her ogrencının okulu aynı dolayıysla asagıdakı gbı static dedık sen bır tanesın dedık

    static String okulAd="Atatürk İlkokulu";
    // kod adı : sen bir tanesin, dolayısıyla direkt adını verebiliriz
    // bitatic :) bitanecik static :)
    // bır verı var ve her yerde o yazılıyor o zaman onu statık yaprım cnku o bıtanecık, her ksııye gore degısmeyen bılgı
    // tekrarlayan tum nesneler icin kullanılacak degıskenlerde static kullanıyoruz
    //static varsa hafızadan tasarruf saglar
    // hepsine atanır, hafızada tek olark bulunur
    // static yapıldıgında, nesnenın degıl sınıfın degıskenı oldu artık

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

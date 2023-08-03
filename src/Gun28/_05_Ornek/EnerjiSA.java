package Gun28._05_Ornek;

public class EnerjiSA {
    public static void main(String[] args) {

        Musteri mus1=new Musteri("Cansu");  // const olusturdugum ıcın dırekt ıcıne yazabılıyorum

        mus1.elektrikHesabi.TuketimEkle(50);
        mus1.elektrikHesabi.TuketimEkle(60);
        mus1.elektrikHesabi.TuketimEkle(70);

        System.out.println("toplamTuketim = " + mus1.elektrikHesabi.toplamTuketim);
        mus1.elektrikHesabi.faturaYaz();









    }
}

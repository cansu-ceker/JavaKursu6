package Gun39._03_Soru;

public class Kartal extends  Hayvan {


    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    public void yiyecegi() {   // void oldugu ıcın sout yapılııyor
        System.out.println("et yer");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("1KG");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("8 saat");
    }

    @Override
    public void sesi() {
        System.out.println("fiyuuuu");
    }
}

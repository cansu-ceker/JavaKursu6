package Gun39._03_Soru;

public class Kedi extends Hayvan {


    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("mam ve balık yer");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("100gr");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("16 saat");
    }

    @Override
    public void sesi() {
        System.out.println("miyav");
    }
}

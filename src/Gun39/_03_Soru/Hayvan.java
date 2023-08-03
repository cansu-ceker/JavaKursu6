package Gun39._03_Soru;

public abstract class Hayvan {

    private final int id;
    private  String isim;
    private  boolean vahsi;
    private String dogumTarihi;



    public abstract void yiyecegi();     // abstract yazabıolmemız ıcın bu class abs olmalı o sebeple class ın yanına abs yazdık
    public abstract void yemekMiktari();  // boyle yazıncxa ıcı yok, bunu extend alanlar ıcını doldurcak demek
    public abstract void gunlukUykuSuresi();
    public abstract void sesi();

    private static int sayacID=1;   // STATIC YAZMASAYDIK HEP 1 OLURDU SONUCU

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.id = sayacID++;     // setId(sayacID++);  bu olmaz cnk ıd ya en basta ykarıda ya da cons da tanımlanır sette tanımlanmaz, burada yukarıda tanımlayamadık bu soruda, cnku fınal dedık, fınal deyıp=1 dersen her yerde 1 olur id, final degıstgrıılmez cnku
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
    }



    @Override
    public String toString() {

        System.out.println("ismi="+this.isim);
        System.out.println("yiyeceği=");  yiyecegi();
        System.out.println("yemek miktarı=");  yemekMiktari();
        System.out.println("gunluk uyku suresi=");  gunlukUykuSuresi();
        System.out.println("sesi=");  sesi();


        return "Hayvan=" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi;
    }

    public int getId() {
        return id;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}

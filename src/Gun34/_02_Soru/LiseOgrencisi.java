package Gun34._02_Soru;

public class LiseOgrencisi extends Ogrenci{

    private String brans;


    /*
     public LiseOgrencisi(String isim, Tipi tip, String brans) {  sag tıkle cons yaptık sonra (buradaki) tipi kaldırdık neden, cnku zaten bunun ne tıpı oldugu bellı ben onu
       super(isim, tip);      burada Tipi.LISE diye set edersem her olusacak lıse ogrencısıne tıpını atamıs olurum,
        this.brans = brans;       yanı ogrencıyı yanı nesneyı maınde tanımlarken tıpını yazmama gerek kalmaz kı kalmsın dıye ()nın ıcınde  tip i kaldırdık
    }
     */

    public LiseOgrencisi(String isim, String brans) {
        super(isim, Tipi.LISE);  // otomatrık cons la gelenı degıstırdık
        this.brans = brans;
    }

    //over methodtan tostrng
    @Override
    public String toString() {
        return super.toString()+", brans="+ this.brans;
    }

    // getter setter:
    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}

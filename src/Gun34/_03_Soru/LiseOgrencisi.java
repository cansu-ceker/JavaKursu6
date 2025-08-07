package Gun34._03_Soru;

public class LiseOgrencisi extends Ogrenci {

    private String brans;
    private static int LiseSayacID=1;


    public LiseOgrencisi(String isim, String brans) {
        super(isim, Tipi.LISE,LiseSayacID++);  // otomatrık cons la gelenı degıstırdık
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

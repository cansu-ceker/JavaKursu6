package Gun34._02_Soru;

public class IlkOgrencisi extends Ogrenci {

    private String klup;

    public IlkOgrencisi(String isim, String klup) {   // mainde  parantez ıcıne cayse ve klup yazdık bak dırekt cnk tıpını zaten burdan alcak net ve bellı oldugu ıcın bı daha tıpını o parantezde yazmıyoruz
        super(isim,Tipi.ILK);   // otomatrık cons la gelenı degıstırdık

        setKlup(klup);    //SEt yaıyoruz kapsulluyorz
    }

    @Override
    public String toString() {
        return super.toString()+"klup:"+ this.klup;
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }
}

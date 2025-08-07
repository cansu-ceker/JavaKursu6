package Gun34._03_Soru;

public class IlkOgrencisi extends Ogrenci {

    private String klup;
    private static int ilkSayacID=1;

    public IlkOgrencisi(String isim, String klup) {   // mainde  parantez ıcıne cayse ve klup yazdık bak dırekt cnk tıpını zaten burdan alcak net ve bellı oldugu ıcın bı daha tıpını o parantezde yazmıyoruz
        super(isim, Tipi.ILK,ilkSayacID++);   // KENDI ICINDE SAYAC ARTSIN DIYE BOYLE YAPTIK

        setKlup(klup);    //SEt yapıyoruz kapsulluyorz
    }

    @Override
    public String toString() {
        return super.toString()+", klup="+ this.klup;
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }
}

package Gun33._02_Inheritance;

public class Yilan extends Hayvan{

    private  int uzunluk;
                                                 // int uzunlugu bız ekledık
    public Yilan(String renk, String cins, int kilo,int uzunluk) {
        super(renk, cins, kilo);
        setUzunluk(uzunluk);  //this.uzunluk=uzunluk; yapoardık normalde ama burda encap yapmak ıcın setUzunluk(uzunluk) yaptık
    }

    @Override
    public void konustu() {
        //super.konustu();
        System.out.println("tısladı");
    }


    //asagıdakı generate-override-to strıng, uzunluk sec, yapınca kendı cıkıyor.  uzunluk fıeld ortak olanlardan farklı oldugundan yenı bır ozellık eklemek ıstedık,  yukarıda private  int uzunluk; yaptık sımdı de dıyoruz kı this.uzunluk u kullan,

    @Override
    public String toString() {
        return super.toString()+this.uzunluk;
        // return super.getCinsi+ super.getRengi+this.uzunluk da yapabılırdık
    }

    //asagıda gettersetter
    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
}

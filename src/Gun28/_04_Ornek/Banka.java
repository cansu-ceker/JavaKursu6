package Gun28._04_Ornek;

public class Banka {

    String bankaAdi;
    int subeSayisi;
    int kurulusYili;


    public Banka() {
    }

    public Banka(String bankaAdi, int subeSayisi, int kurulusYili) {
        this.bankaAdi = bankaAdi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String bankaAdi, int kurulusYili) {
        this(bankaAdi,kurulusYili,0);
    }

    public Banka(String bankaAdi) {
        this(bankaAdi,0,0);
    }

    public String toString() {
        return "Banka{" +
                "bankaAdi='" + bankaAdi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}

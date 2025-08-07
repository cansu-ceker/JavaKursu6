package Gun33.BEN;

public class GenelMudur extends Calisan{

    private double tazminat;


    public GenelMudur(String isim, double maas, double maasKatSayisi, double tazminat) {
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maashesapla() {
        return super.maashesapla() + tazminat;
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }
}

package Gun33._03_Soru;

public class Calisan {
    private String isim;
    private double maas=0;
    private double maasKatSayisi;    //1.2   1.5 kendın ver


    public Calisan(String isim, double maas, double maasKatSayisi) {
        //this.isim = isim;           // bunları da capsulatıpn yapmak lazım o yuzden set set seklınde
        setIsim(isim);
        setMaas(maas);
        setMaasKatSayisi(maasKatSayisi);
    }


    public double maasHesapla ()
    {
        return this.maas*this.maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getMaasKatSayisi() {
        return maasKatSayisi;
    }

    public void setMaasKatSayisi(double maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }


}

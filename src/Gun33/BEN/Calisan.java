package Gun33.BEN;

public class Calisan {
    private String isim;
    private double maas;
    private double maasKatSayisi;


    public Calisan(String isim, double maas, double maasKatSayisi) {

        setIsim(isim);
        setMaas(maas);
        setMaasKatSayisi(maasKatSayisi);

    }


    public double maashesapla(){

       return this.maas* this.maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan" +
                "\nisim='" + isim +
                "\nmaas=" + maas +
                "\nmaasKatSayisi=" + maasKatSayisi +
                "\nödenecek maas"+ maashesapla()
                ;
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

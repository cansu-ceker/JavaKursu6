package Gun35.BEN;

import javax.jws.soap.SOAPBinding;

public class Kisiler {
    private String  ad;
    private String  soyAd;
    private String gorevi;

    public Kisiler(String ad, String soyAd, String gorevi) {
        setAd(ad);
        setSoyAd(soyAd);
        setGorevi(gorevi);}

    public static void kimlikBelgesiYazdir(Kisiler gelenKisi){
        System.out.println("\n******KIMLIK BELGESI*******");
        System.out.println("Adı="+ gelenKisi.getAd());
        System.out.println("Soyadı="+ gelenKisi.getSoyAd());
        System.out.println("Gorevi="+ gelenKisi.getGorevi());

        if (gelenKisi instanceof Calisan)
            System.out.println("Departmanı="+ ((Calisan) gelenKisi).getDepartmani());
        if (gelenKisi instanceof Ogrenci)
            System.out.println("Subesi="+ ((Ogrenci) gelenKisi).getSubesi());

    }


    public String getAd() {return ad;}

    public void setAd(String ad) {this.ad = ad;}

    public String getSoyAd() {return soyAd;}

    public void setSoyAd(String soyAd) {this.soyAd = soyAd;}

    public String getGorevi() {return gorevi;}

    public void setGorevi(String gorevi) {this.gorevi = gorevi;}

    @Override
    public String toString() {
        return "Kisiler" +
                "\nad=" + ad +
                "\nsoyAd=" + soyAd +
                "\ngorevi=" + gorevi
                ;
    }
}

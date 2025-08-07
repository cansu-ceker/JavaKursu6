package Gun32._03_Soru;

import java.util.Scanner;

public class Ogrenci {

    private String ad;
    private String soyad;
    private int yas;
    private int okulNo;
    private static int sayacId=1;

    public Ogrenci(String ad, String soyad, int yas) {
        setAd(ad);
        setYas(yas);
        setSoyad(soyad);

        this.okulNo=sayacId++;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override // bunu kendı cıkartıyor onemlı degıl yazmasanz olur dedı
    public String toString() {
        return "Ogrenci{" +
                "okulNo='" +this.okulNo + '\'' +
                "ad='" +this.ad + '\'' +
                ", soyad='" + this.soyad + '\'' +
                ", yas=" + this.yas +
                '}';
    }




}

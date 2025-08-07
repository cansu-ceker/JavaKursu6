package Gun29.BENcevap;

public class musteri {
    int musteriNo;
    String ad;
    String soyad;
    hesap musteriHesap;

   // public musteri() {   }
   // bu bos u su an gereklı degıl cunku mainde musteri m1=new musteri(); seklınde bos btanımlamadık

    public musteri(int musteriNo, String ad, String soyad) {
        this.musteriNo = musteriNo;
        this.ad = ad;
        this.soyad = soyad;
    }
}

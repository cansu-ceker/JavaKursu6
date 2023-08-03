package Gun29._03_Protected.Paket1;

public class Doctor {

   public String hastaneAd;    // basına public yazıcam ki diğer paketlerden erişim izni verilsin değiştirilebilir olsun dedik
    String adi;                // default olsun
    protected String bolumu;   // defaultla aynı
    private String SicilNo;    // private sadece class ın içinden erişilsin olsun dedik
                               //saglık bakanlıgı sıcıl no degıstırebılır dedık

    Doctor (){  // sadece kendi paketindekiler erişebilir

    }



    public Doctor(String adi) {  // diğer tüm paketlerden erişim sağlanabilir
        this.adi=adi;
    }
}

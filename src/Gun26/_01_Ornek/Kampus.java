package Gun26._01_Ornek;

public class Kampus  {
    public static void main(String[] args) {

        Ogrenci ogr1=new Ogrenci();
        ogr1.okulNo=1001;
        ogr1.ad="Hakan";
        ogr1.soyad="Kılıç";
      //  ogr1.okulAd="Bayrak okulu";

                                // baska bır class da oldugu ıcın okul adında, onu da tanımlaman lazım kı kullanasın
        ogr1.okul=new Okul();   // okul tek bır String olmadıgı için boyle yaparız
        ogr1.okul.okulAd="Bayrak okulu";  // ismet in okulu nun adı
        ogr1.okul.mudurAd="Selim Özel";   // ismet in okulu nun muduradı
        ogr1.okul.adres="Ümraniye/İstanbul"; // ismet in okulunun adresi

        System.out.println("ogr1.ad = " + ogr1.ad);
        System.out.println("ogr1.O = " + ogr1.okul.mudurAd);












    }



}

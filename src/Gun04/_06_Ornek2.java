package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {


        // String to int

        String bagis1="500";   //bunlar kelime -  "" koyuyoruz ki kelime oldugu anlasılsın, "" olmasaydı esıtlıgın solu kelıme sagı sayı olurdu tip uyumsuzlugu olurdu,
        String bagis2="1500";  //yani String bagis1=500; seklınde yazılmaz String, sol taraf kelıme sag taraf ınt olur yanı tıp uyusmazlıgı olur olmaz bu sekıld yazılmaz yanı nu adım da kelime

        //   bana toplam bağış miktarı lazım
        //   int toplam=bagis1+bagis2;   bu çalışmaz olmadı yani
        //   bunların int e yani rakama dönüştürülmesi lazım

        //kelımeden rakama donusturdugumuz zıcın bır ayrıstırma yanı parse etme ıslemı var


        //                = bu kısmı yanı bagıs1 i al Integer a parse yanı ayrıstırma yap
        // bu kısım da cevırmek ıstedıgımz kısım yanı int
        int rakamBagis1=Integer.parseInt(bagis1);
        int rakamBagis2=Integer.parseInt(bagis2);  // Integer.parseInt komutuyla parçalayıp rakama int e dönüştürüyor
        int toplam=rakamBagis1+rakamBagis2;

        System.out.println("toplam = " + toplam);



    }
}

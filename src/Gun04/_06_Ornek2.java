package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {

        String bagis1="500";   //bunlar kelime -  "" koyuyoruz ki kelime oldugu anlasılsın, "" olmasaydı esıtlıgın solu kelıme sagı sayı olurdu tip uyumsuzlugu olurdu,
        String bagis2="1500";  //yani String bagis1=500; seklınde yazılmaz String, nu adım da kelime

        //bana toplam bağış miktarı lazım
        // int toplam=bagis1+bagis2;   bu çalışmaz olmadı yani
         //bunların int e yani rakama dönüştürülmesi lazım


        int rakamBagis1=Integer.parseInt(bagis1);
        int rakamBagis2=Integer.parseInt(bagis2);  // Integer.parseInt komutuyla parçalayıp rakama int e dönüştürüyor
        int toplam=rakamBagis1+rakamBagis2;

        System.out.println("toplam = " + toplam);







    }
}

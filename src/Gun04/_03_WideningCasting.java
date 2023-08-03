package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {


        //  1. küçük alanı --> büyüğe atılabiliyor (genişleme- Widening)
        //  byte --> short --> int --> long --> float --> double
        // veri kaybı kesinlikle yok


        int sayi=9;
        long toplam=6700;
        double oran=3.2;


        // sayı , orana atılıyor yanı sol taraf sag tarafa atılıyor
         oran=sayi;  //tamsayı olan int, daha geniş ondalıklı double a hafızaya atılır
        System.out.println("oran = " + oran);  //veri kaybı yok
                                               //double a attık diye 9.0 yazdı


        toplam=sayi; // int long a atılıyor
        System.out.println("toplam = " + toplam); // veri kaybı yok
                                                  //long a attık 9 yazar



        oran=toplam;  //long, double a atıldı
        System.out.println("oran = " + oran); //veri kaybı yok
                                             //double a attık diye 9.0 yazdı




    }
}

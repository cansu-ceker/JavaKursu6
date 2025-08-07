package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {

        byte ogrNo1=98;
        byte ogrNo2=97;
        byte ogrNo3=9;
        byte ogrNo4=100;


        //int           //byte
        int toplamNot=ogrNo1+ogrNo2+ogrNo3+ogrNo4;      // byte<int
                                                        // byteları inte yani küçüğü büyüğe
                                                        //atabiliriz.
                                                        //394


        /* sağ taraf sol tarafa atılamıyorsa sistem sorar sen bunu bılerek mı yapıyosun dıye

        evet ben bunu bılerek yapıyorum demek gıbı bı ıslemler yapmak gerek
         mesela
         int toplamNot=ogrNo1; dedin -> bu ok yapılabılır cnku ogrNo1 byte dır , byte olan bu sol tarafı, int e yani sola atabılırsın
          fakat sonra
          ogrNo2= toplamNot;  -> bunu dıyemezsın senı uyarır emın mısın bak,
                                 toplamNot u int tanımladın, şimdi bunu sola yanı byte olan ogrNo2 ye atamazsın buyuk kucuge atılmaz
                                 eger bunu bılerek yapıyosan bana ısaret gonder dogru duzgun yaz bıleyım der
         ogrNo2=(byte)toplamNot: -> seklınde (byte) a cevırdım ben toplamNot u ve dolayısıyla byte ı byte a attım derse ok
        */



        // küçükler büyüklere atılıyor ama
        // büyük bir veriyi küçük yere atamayız sığmaz o sebeple tip dönüşümü gerekir


        //ondalıklı bir sayının sadece tamsayı kısmı gerekebilir
        //   10/3 ---> 3 der bilgisayar,
        //   10/(double)3 ----> 3.333 der

        //int -> byte atınca dur bakalım dedi   (DARALTMA)
        //bunu bilinçli şekilde yaparsak aşağdaki gbi yazmalıyız:

        byte toplam2= (byte)toplamNot; // 394 ü byte alana atıyorum
        System.out.println("toplam2 = " + toplam2);


        // büyük hafıza ayrılmış bir alanı, küçük hafıza ayrılmış alana atma
        // işlemi var. veri kaybı ihtimali var






    }
}

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



        //sağ taraf sol tarafa atılamıyorsa sistem sorar sen bunu bılerek mı yapıyosun dıye



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

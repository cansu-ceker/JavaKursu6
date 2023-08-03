package Gun20;

public class _02_JavaMethod {
    public static void main(String[] args) {



        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");


        merhabaYaz();  // giden var, dönen yok
       toplamYaz(4,5);  // gider var, dönen yok
        int enb=Math.max(4,5); // giden avr,dönen var. eşitlenebiliyorsa dönen var demektir
        double rndSayi=Math.random();  // giden yok,dönen var, eşitleyebiliyorsak dönen var diyoruz


/***********************************************************************/
// javanın yazdıgı kodları bulmak ıcın neymiş dıye bakmak ıcın control basılı tut mesela max ın ustune tıkla nasıl yazılıyor vs gorunuyor
//javaya ait herhangi bir metodun üzerine CTRL ile tıkladığımızda
//metodun içeriğini/kodlarını görebiliriz

       enbBulYaz(4,5);
        enb=enbBulGeriGonder(4,5);
        System.out.println("enb = " + enb);
    }

    public static int enbBulGeriGonder(int s1,int s2) // sırasıyla eşleşiyor
    // ayrıca VOİD tipsiz demek yani returnsuz, burada biz geridöndürüyorsak onu void i silip oraya yazmalıyız, burada int geridöndürüyoruz o yüzden public static int dedik
    {
           int enb=0;
           if(s1>s2)
               enb=s1;   // return s1; de yazabiliriz
           else
               enb=s2;   // return s2; de yazabiliriz

           return enb;   // dönecek elemanın tipini metodun adından önce yazıyoruz
    }

    public static void enbBulYaz(int s1,int s2)
    {
        if (s1>s2)
            System.out.println("s1 = " + s1);
        else
            System.out.println("s2 = " + s2);

    }

    public static void toplamYaz(int s1,int s2)
    {
            System.out.println("Toplam = " + (s1+s2));

    }

    public static void merhabaYaz() // bak burada dönen yok void kaldı
    {
        System.out.println("Merhaba Dünya");

    }




}

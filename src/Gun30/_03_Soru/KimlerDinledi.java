package Gun30._03_Soru;

public class KimlerDinledi {

    int a;
    static int b=0;  // sen bitanesin dedik en son ne deger atanırsa onu aklında tutuyor o sebeple soru 3 te b 2 dir deriz

    void artir()
    {
        a++;
        b++;
    }

    public static void main(String[] args) {
        KimlerDinledi kd1= new KimlerDinledi();
        kd1.a=5;

        KimlerDinledi kd2= new KimlerDinledi();
        kd2.a=7;

        //1. soru: a nın değeri şu an kaçtır?
        // burada hangi a diye sormamız lazım, cunku kd1 in a sı 5, kd2 nin a sı 7

        System.out.println("kd1 = " + kd1.a);  //5
        System.out.println("kd2 = " + kd2.a);  //7


        // 2.soru: b nin değeri kactır? tek bir değeri avrdır o da sıfırdır

        kd1.artir();  // kd1.a ->6  , b->1
        kd2.artir();  // kd2.a ->8,   b->2 oldu

        // 3.soru: a ve b nin değerleri kaçtır?
        System.out.println("kd1.a = " + kd1.a);  //6
        System.out.println("kd2.a = " + kd2.a);  //8
        System.out.println("b = " + b);          // 2 ,  en son ne deger atanırsa onu aklında tutuyor o sebeple 2 dir deriz





    }


}

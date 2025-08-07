package Gun16;

public class  _01_JavaDiziNedir {
    public static void main(String[] args) {

        int sayi=8;

        int ogrNot=0;
        int ogrNot1;
        int ogrNot2;
        int ogrNot3;
        //...
        //...
        //...
        int ogrNot50;

        // bir tanımlamada BİRDEN FAZLA değer tutabilen bir değişkene ihtiyacım var
        //çözüm:

        int [] notlar=new int [50];  // 50 tane int saklayabilen notlar isimli değişken

        notlar[0]=75;
        notlar[1]=88;
        //...
        //...
        //...
        notlar[49]=95;  // en son eleman sayısı lenght-1 dir, 0-49 index dir
        //50. öğrenci notu
        //notlar[50]=75; böyle olmaz 49 yazmalıyız


        System.out.println("notlar[0] = " + notlar[0]);

        System.out.println("notlar ın uzunluğu = " + notlar.length);
        // 50 yani toplam eleman sayısını verir.






    }
}

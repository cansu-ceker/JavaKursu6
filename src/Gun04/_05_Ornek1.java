package Gun04;

public class _05_Ornek1 {
    public static void main(String[] args) {

        //emeklilerin maaşlarını yatırma gibi işlmelerde ,dısarıdan veri gelince yaparız bunları,
        // dısarıdan gelenlerı bılmıyoruz

        int bolunen=10;
        int bolen=3;

      int sonuc=bolunen/bolen; ///    10/3
     System.out.println("sonuc = " + sonuc);  // 3 , int olduğu için sonuc 3



      double sonuc1 =bolunen/bolen;
        System.out.println("sonuc1 = " + sonuc1);  // 3.0 cıkar sonuc
                                                 // cunku int/int = int tir diye bilgisayar

       double sonuc2= (double) bolunen /  bolen;  // ya da double sonuc=  bolunen / (double) bolen
        System.out.println("sonuc2 = " + sonuc2); // 3.3 çıkar cunku herhangi birini double olarak atınca
                                                //int /double ya da double/int = double dıyor bılgısayar


        /*       int sayi1=10;
                 int sayi2=3;

                 int tamSonuc=sayi1/sayi2;  BURASI  int/int --> int
                 System.out.println("tamSonuc = " + tamSonuc);   3 çıkar




                 int sayi1=10;
                 int sayi2=3;

                 double doubleSonuc=sayi1/ (double)sayi2;  BURASI  int/double --> double sonuc
                 System.out.println("doubleSonuc = " + doubleSonuc);   3.3 çıkar


                 aşağıdaki gibi de yazabiliriz:

                  int sayi1=10;
                 double sayi2=3;

                 double doubleSonuc=sayi1/sayi2;
                 System.out.println("doubleSonuc = " + doubleSonuc); 3.3 çıkar


         */

    }
}

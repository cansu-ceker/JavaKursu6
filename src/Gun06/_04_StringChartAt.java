package Gun06;

public class _04_StringChartAt {
    public static void main(String[] args) {
        //istenilen noktadaki karakteri verir
        //bugün -->5


        //           0123456789012 diye okur bilgisayar
        String cumle="Merhaba Dünya";  //uzunluğu 13   , 0-12 index  yani 13 tanedir
                                       // bilgisayar bunu okurken 0 dan başlar  yani bu 0-12 index

        System.out.println("uzunluk = " + cumle.length());

        char ilkHarf=cumle.charAt(0);   // 0 daki karakteri ver
        System.out.println("ilkHarf = " + ilkHarf);

        char aradaki =cumle.charAt(5);   // 6.karakterdekini gösterdi
        System.out.println("ARADA SORDUĞUM = " + aradaki);

           /* char bir harf
           String harf, kelime, cümle

          1- char harf='a';    bu kod 1 odalık yer ayırıyor bilgisayar --> a
          2- String harf="a"; bu kod 1 oda + bitiş işareti kadar yer ayırır -->  a\n
                              String arada boşluk da saklıyor cümle gibi algılayıp

           yani 1 ve 2 aynı şey değil

           char bir oda
           String bir kat,

            */

    }
}

package Gun08;

public class _04_JavaAritmeticOperators {
    public static void main(String[] args) {


        int a=9;
        int b=5;

        System.out.print(" Toplama işlemi= ");
        System.out.println("a+b sonucu = " + (a+b));

        System.out.print(" Çıkartma işlemi= ");
        System.out.println("a+b sonucu = " + (a-b));

        System.out.print(" Çarpma işlemi= ");
        System.out.println("axb sonucu = " + (a*b));

        System.out.print(" Çıkartma işlemi= ");
        System.out.print("a/b sonucu = " + (a/b));
         // normal sonuç 1.8 fakat bilgisayar ikisi de tamsayı tipinde ise küsuratı atar
        // bu sebeple sonuc 1 olur, yuvarlama yapmaz. int/int = int tir
        //küsuratlı yani ondalıklı sonuç istiyorsam, işleme girenlerden en az birisi double olmalıdır

        System.out.print("ondalıklı a/b sonucu ise1 = " + ( (double) a/b) );
        //ya da
        System.out.print("ondalıklı a/b sonucu ise1 = " + (a/(double)b));
        // yaparız


/* ******************************************************************** */

        System.out.println(" Modül işlemi= bölümünden kalan demek ");
        System.out.println("a%b = " + (a%b));  // 9 u 5 e böldük, 1 tane 5 var, kalan 4 oldu
        System.out.println("b%a = " + (b%a));  // 5i 9 a bölemiyor 5 kalır yani bölünemeyeni alır 5 i aldı burada

        // sayı tek mi çift mi
        // sayi%2   1  eşitse tektir
        //          0 eşitse çifttir
        // 9%3 -> 0 dır, bölünür çünkü, bölünemeyen parça yoktur

        //145 te 4 ü nasıl alırım :  145/10 nedir cevap 14,5 tur bilgisayar onu 14  alır
        //                           14%10 modul yaptırırsın, 4 olur cevap bu % bölme değil modul ısaretıdır, bolunmeyen parca 4 tur sıstem 4 u yazar










    }
}

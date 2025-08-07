package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06_JavaTryMultipleCatch {
    public static void main(String[] args) {


        System.out.println("Program başladı.");

       try {
           Scanner oku = new Scanner(System.in);

           System.out.print("Sayi1=");
           int sayi1 = oku.nextInt();

           System.out.print("Sayi2=");
           int sayi2 = oku.nextInt();

           int bolum = sayi1 / sayi2;
           System.out.println("bolum = " + bolum);

          // String kelime=""; bu kodu genel hatay düşsün de görelim diye yazdık
          // kelime.charAt(3);


       }catch (ArithmeticException ex)     // belirli bir hata case   hata olunca kırmızı erde bu yazıyor zaten ArithmeticExceptiion dıye, bu sekılde bıldıgımız hata varsa bu hata olursa bunu yap, bu hata olursa sunu yao vs dıye yazabılırız try catch
       {
           System.out.println("sıfıra bölme hatası oluştu");
       }

       catch (InputMismatchException ex)  // belirli bir hata casek
       {
           System.out.println("lütfen sayı giriniz");
       }

       catch (Exception ex)  // belirli bir hata case
       {
           System.out.println("beklenmeyen hata oluştu");
       }

           System.out.println("program bitti");





// hata oldugu anda catch e duser







    }
}

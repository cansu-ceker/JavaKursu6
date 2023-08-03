package Gun10;

import java.util.Scanner;

public class _00_JavaIf {
    public static void main(String[] args) {

        // Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.  (confirm new password)

        Scanner oku=new Scanner(System.in);
        System.out.print(" Şifre1= ");  // merhaba olsun bu
        String sifre1= oku.nextLine();

        System.out.print(" Şifre2= ");
        String sifre2= oku.nextLine();

        if (sifre1.equals(sifre2))                  // if (sifre1==sifre2)  ile aynı şey ama == bu, String ifadelerde hafızadaki yerlerini kıyaslar karşılaştırır. String in içlerini karşılaştırcaksak equals yapacaksın.
            System.out.println("Şifreler AYNI");    // int yazıyosak == kulan

        if (!sifre1.equals(sifre2))                // if (sifre1!=sifre2) ile aynı şey
            System.out.println("Şifreler FARKLI");


        /// String ifade görüyorsak EŞİTLİğini   EQUALS ile yapacaksın




    }
}

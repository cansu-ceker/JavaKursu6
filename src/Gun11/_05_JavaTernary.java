package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {

        // Otopark ücretleri : (Ternary operatör ile yapınız.)
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("saat gir=");
        double saat= oku.nextDouble();

        System.out.println((saat<=3) ? "borç 10TL" : (saat<=5) ? "borç 15TL" : "borç 20TL");

        // 2. yontem. "borc 10tl" gıbı tırnaklı alınca Strıglı oluyor, aşagıdakı gbı dırekt rakam gırınce int dusunuyor ok o zaman "" koymadan rakama gir TL yazmaz o zaman

        System.out.println((saat<=3) ? 10 : (saat<=5) ? 15 : 20);





    }
}

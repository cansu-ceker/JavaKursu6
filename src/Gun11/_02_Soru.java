package Gun11;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız


        Scanner oku=new Scanner(System.in);
        System.out.print("Kaç saat kaldınız=");
        double saat=oku.nextDouble();

        if (saat<=3)
            System.out.println("Borcunuz 10TL");

        else { // bu satırdakı else, saat >3 demek yanı >3 ise asagıdakı suslunun ıcını calıstır demek, dolayısla asagıda  if (saat>3 && saat<=5) yapmaya gerek yoık

            if (saat<=5)
                System.out.println("Borcunuz 15 TL");
            else
                System.out.println("Borcunuz 20TL");

        }

        // süslü parantez komutun o parantezler ıcınde donmesın saglar,


    }
}

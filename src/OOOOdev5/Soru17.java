package OOOOdev5;

import java.util.Scanner;

public class Soru17 {
    public static void main(String[] args) {

        // tek seferde girilen 3 kelimelik ismi,        ad , 2.ad ve soyadını      A.E.Y. şeklinde yazınız.
        //     mesala : Mehmet Alı Yılmaz -> M.A.Y

        Scanner oku=new Scanner(System.in);
        System.out.print("Ad Soyad =");
        String adSoyad= oku.nextLine();

       char ad1=adSoyad.charAt(0);

       int bosluk1=adSoyad.indexOf(" ");

       char ad2=adSoyad.charAt(bosluk1+1);

       int bosluk2=adSoyad.lastIndexOf(" ");

       char soyad=adSoyad.charAt(bosluk2+1);

       String tamAd=ad1+"."+ad2+"."+soyad+".";


        System.out.println("SONUÇ = " +tamAd.toUpperCase());



    }
}

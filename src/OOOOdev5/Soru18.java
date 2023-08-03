package OOOOdev5;

import java.util.Scanner;

public class Soru18 {
    public static void main(String[] args) {

        //tek seferde girilen 3 kelimelik ismi,        ad , 2.ad ve soyadını     ayrı ayrı yazdırınız.
        //      mesala : Mehmet Alı Yılmaz -> Mehmet  i  Ali  yi ve Yılmaz ı ayrı ayrı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print(" Ad girin= ");
        String adSoyad= oku.nextLine();

        int bosluk1=adSoyad.indexOf(" ");

        System.out.println("Ad1 = " + adSoyad.substring(0,bosluk1));


       // String ad1=adSoyad.substring(0,bosluk1);
       // System.out.println("Ad1 = " + ad1);


        int bosluk2=adSoyad.lastIndexOf(" ");
        String ad2=adSoyad.substring(bosluk1+1,bosluk2);
        System.out.println("Ad2 = " + ad2);

        String soyad=adSoyad.substring(bosluk2+1);
        System.out.println("Soyad = " + soyad);



    }
}

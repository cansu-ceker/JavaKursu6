package OOOOdev11_Metodlar;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

//       "OrtaKelime" isminden bir method oluşturun.
//        Bu method String'i parametre olarak almalı.
//        Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
//        Ortadaki kelimeyi return yapınız.
//        Örnek: Ben Java'yı seviyorum.
//        print : Java'yı
//        Örnek2:
//        Java'yı kolayca öğreniyorum.
//        print: kolayca


        // 1. yol eski yol,

        Scanner oku=new Scanner(System.in);

        System.out.print(" cümle girin = ");
        String cumle= oku.nextLine();

        int bosluk1=cumle.indexOf(" ");
        int bosluk2=cumle.lastIndexOf(" ");

        String ortaCumle=cumle.substring(bosluk1+1,bosluk2);
        System.out.println("ortaCumle = " + ortaCumle);



        // 2. yol yeni yol,


//        String dizi[] =new String[3];
//
//
//       System.out.println("orta = " + orta);
//        }
////
//       public static String OrtaKelime (String orta)
//       {
//           String dizi[2]= orta;
//
//          return orta;
    }








}

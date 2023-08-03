package Gun13;

import java.util.Scanner;

public class _02_Switch {
    public static void main(String[] args) {

        //girilen bir sayının birler basamagındakı degerını yazı ıle yazdırın
        // 2364---> dört yazsın
        // sayılarla ılgılı seylerde her zaman int yapmak daha dogru olur


        Scanner oku=new Scanner(System.in);
        System.out.println("sayı gir=");
        int sayi= oku.nextInt();

       int birlerBas=sayi%10;

        switch (birlerBas)   //  switch (sayi%10) da olurdu
        {
            case 0 : System.out.println("sıfır"); break;   // eger ki int tanımlamasak String tanımlasaydık case "0" : dıye gıderdı tırnak kpoymak gerekırdı
            case 1 : System.out.println("bir"); break;
            case 2 : System.out.println("iki"); break;
            case 3 : System.out.println("üç"); break;
            case 4 : System.out.println("dört"); break;
            case 5 : System.out.println("beş"); break;
            case 6: System.out.println("altı"); break;
            case 7 : System.out.println("yedi"); break;
            case 8 : System.out.println("sekiz"); break;
            case 9 : System.out.println("dokuz"); break;

        }


    }
}

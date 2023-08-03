package Odev2;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {

        //Kullanıcıdan alacağının 2 sayının 4 işlemini ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print(" Sayi1 gir= " );
        double sayi1= oku.nextDouble();


        System.out.print(" Sayi2 gir= " );
        double sayi2= oku.nextDouble();

        double toplam=sayi1+sayi2;
        double carp=sayi1*sayi2;
        double bol=sayi1/sayi2;
        double cikar=sayi1-sayi2;

        System.out.println("Toplama = " + toplam);
        System.out.println("Çıkarma = " + cikar);
        System.out.println("Çarpma = " + carp);
        System.out.println("Bölme = " + bol);










    }
}

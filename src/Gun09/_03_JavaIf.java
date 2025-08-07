package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını büyük sayı= değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print(" Sayı1 = ");
        int sayi1= oku.nextInt();

        System.out.println(" Sayı2 = ");
        int sayi2= oku.nextInt();

        if (sayi1>sayi2)
            System.out.println("Büyük sayı="+sayi1);

        if (sayi1<sayi2)
            System.out.println("Büyük sayı="+sayi2);

        if (sayi1==sayi2)
            System.out.println(" Sayılar eşittir. ");



    }
}

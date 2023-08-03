package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("1.sayi=");
        int sayi1= oku.nextInt();

        System.out.print("2.Sayi=");
        int sayi2=oku.nextInt();

        Scanner oku2=new Scanner(System.in);
        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma  için P");
        System.out.println("Bölme   için B");
        System.out.print("Seçiminiz=");
        String girilenHarf=oku2.next();  // T-Ç-P-B

        switch (girilenHarf.toUpperCase())
        {
            case "T": System.out.print("Toplam=" + (sayi1 + sayi2));break;
            case "Ç": System.out.print("Çıkarma=" + (sayi1 - sayi2));break;
            case "P": System.out.print("Çarpma=" + (sayi1 * sayi2));break;
            case "B": System.out.print("Bölme=" + ((double)sayi1 / sayi2));break;
            default: System.out.println("Hatalı girdiniz.");
        }



    }
}

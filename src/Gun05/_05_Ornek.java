package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {

        //kullanıcıdan aldıgınız 2 tam sayının toplamını ekrana yazdırın

        Scanner oku= new Scanner(System.in);   // kullanıcının sayı gırmesıne olanak saglayan kod

        System.out.print("Birinci sayıyı girin = ");  // kullanıcıdan sayı gırmesı geektıgını yazdırarak odndan ıstıyoruz
        int sayi1=oku.nextInt();                      // gırılen sayıyı sayi1 adlı yerde hafızaya attırıyoruz

        System.out.print("İkinci sayıyı girin = ");
        int sayi2= oku.nextInt();

        int toplam=sayi1+sayi2;

        System.out.println("Toplam = " + toplam);

    }
}

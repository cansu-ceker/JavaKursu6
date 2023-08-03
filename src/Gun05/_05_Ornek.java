package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {

        //kullanıcıdan aldıgınız 2 tam sayının toplamını ekrana yazdırın

        Scanner oku= new Scanner(System.in);

        System.out.print("Birinci sayıyı girin = ");
        int sayi1=oku.nextInt();

        System.out.print("İkinci sayıyı girin = ");
        int sayi2= oku.nextInt();

        int toplam=sayi1+sayi2;

        System.out.println("Toplam = " + toplam);








    }
}

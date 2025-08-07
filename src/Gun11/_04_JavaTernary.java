package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {

        //Girilen sayı 50 de büyük ise 1, değilse 0 değerini
        // ekrana yazdırın. Ternary operatörü ile yapınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("sayi=");
        int sayi= oku.nextInt();

        System.out.println( (sayi>50) ? 1 : 0);

        //2. yöntem
         int sonuc=(sayi>50) ? 1 :0;
        System.out.println("Sonuç="+sonuc);









    }
}

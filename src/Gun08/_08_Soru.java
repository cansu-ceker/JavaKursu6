package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {

        // kullanıcının gireceği 2 sayının birbirine
        // eşit olup olmadığını yazdırın


     Scanner oku=new Scanner(System.in);



        System.out.print(" Sayı1 giriniz= ");
        int sayi1= oku.nextInt();


        System.out.print("Sayı2 giriniz = ");
        int sayi2= oku.nextInt();

        System.out.print("sayılar eşit mi = " + (sayi1==sayi2));



    }
}

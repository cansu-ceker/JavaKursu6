package OOOOdev6;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        //Girilen bir sayının birler basamağını tek olup olmadığını ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı=");
        int sayi= oku.nextInt();


        if(sayi%2 ==1)
            System.out.println(" SAYI TEK");

        if(sayi%2 ==0)
            System.out.println(" SAYI ÇİFT");






    }
}

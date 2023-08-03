package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
    // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print(" Sayı= ");
        int sayi= oku.nextInt();

        if (sayi%2==0)
            System.out.println("Sayı ÇİFT");
        else
            System.out.println("Sayı TEK");


        // çiftler için mod  0   (2,4,6, -2, -4, -6)
        // tekler  için mod  1    (1, 3, 5)
        // tekler  için mod -1   (-1, -3, -5)
        // yani
        // mod 0 sa çifttir, değilse tektir

    }
}

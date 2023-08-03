package Gun10;

import java.util.Scanner;

public class _04_IfElse {
    public static void main(String[] args) {

        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi şeklinde yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print(" Sayı= ");
        int sayi= oku.nextInt();

        if (sayi>0 && sayi%2==1)
            System.out.println("uygun sayı girildi");
        else
            System.out.println("uygun sayı girilmedi");


        // çiftler için mod  0   (2,4,6, -2, -4, -6)
        // tekler  için mod  1    (1, 3, 5)
        // tekler  için mod -1   (-1, -3, -5)
        // yani
        // mod 0 sa çifttir, değilse tektir






    }
}

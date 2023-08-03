package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {

        // girilen bir sayının tek mi çift mi olduğunu yazdırınız
        // tek veya çift şeklinde yazdırınız


        Scanner oku=new Scanner(System.in);
        System.out.print(" Sayi = ");
        int sayi= oku.nextInt();

        if (sayi%2==0)

            System.out.println(" Sayı çift ");

        if (sayi%2==1)

            System.out.println(" Sayı tek ");











    }
}

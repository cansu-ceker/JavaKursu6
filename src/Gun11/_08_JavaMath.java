package Gun11;

import java.util.Scanner;

public class _08_JavaMath {
    public static void main(String[] args) {

        //Math.max yontemı ıle girilen 3 sayıdan buyuk olanı bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi1=");
        double sayi1= oku.nextDouble();

        System.out.print("sayi2=");
        double sayi2= oku.nextDouble();

        System.out.print("sayi3=");
        double sayi3= oku.nextDouble();

        double ilkBuyuk= Math.max(sayi1,sayi2);

        System.out.println("En büyük sayı = " + Math.max(ilkBuyuk,sayi3) );

     // 2. yöntem

        System.out.println(Math.max(sayi1, Math.max(sayi2,sayi3)) );






    }
}

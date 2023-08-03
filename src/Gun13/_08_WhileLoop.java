package Gun13;

import java.util.Scanner;

public class _08_WhileLoop {
    public static void main(String[] args) {

        //kullanıcının gireceği 6 sayıdan tek olanların toplamını yazdırın

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        int sayac=1;

        while (sayac<=6)
        {

        }
        System.out.println("TEKLER TOPLAMI="+toplam);




        System.out.print(sayac+". sayıyı giriniz=");
        int sayi= oku.nextInt();

        if (sayi%2==1)
            toplam=toplam+sayi;

        sayac++;



    }
}

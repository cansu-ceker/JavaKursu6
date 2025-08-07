package Gun14;

import java.util.Scanner;

public class _02_doWhile {
    public static void main(String[] args) {
        //kullanıcı 0 değerini giderene kadar
        //girdiği sayıların toplamını bulunuz

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        int sayi;  // int sayi=0; da olur


        do  // bu döngü en az bir kez çalışır
        {
            System.out.print("sayi giriniz=");
            sayi=oku.nextInt();
            toplam=toplam+sayi;
        }
        while (sayi!=0) ;   //şart kontolü sonra
                            // boyle altta olunca while,   ; unutma

        System.out.println("toplam = " + toplam);


    }
}

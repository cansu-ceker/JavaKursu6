package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {

       // girilen 5 sayının toplamının sonucunu bulunuz

        Scanner oku=new Scanner(System.in);


        int toplam=0;
        int sayac=1;
        while (sayac<=5)  // iken yap: şartı yazıyoruz, dönme şartını
        {
            System.out.println(sayac+".sayi giriniz=");
            int sayi= oku.nextInt();
            toplam=toplam+sayi;

            sayac++;

        }
        System.out.println("toplam="+toplam);











    }
}

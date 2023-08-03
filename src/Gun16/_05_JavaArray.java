package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);

        double toplam=0;
        int adet=0;
        int []sayi= new int[7]; //0123456 indexli bir dizi

        for (int i = 0 ; i<sayi.length ; i++)
        {
            System.out.print((i+1)+".Sayıyı girin=");
            sayi[i]= oku.nextInt();

            toplam=toplam+sayi[i];

        }
        double ortalama=toplam/sayi.length;

        for (int i = 0 ; i<sayi.length ; i++)
        {
           if (sayi[i]>ortalama && sayi[i]%2==1)
           {
               adet++;
           }
        }

        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalamayı geçenlerin adet = " + adet);









    }
}

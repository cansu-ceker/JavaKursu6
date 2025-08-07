package Gun19_Yoktuk;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Java2DAarrays {
    public static void main(String[] args) {

        // 3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.


        int [][] tablo=new int[3][2];
        int tekMik=0;

        Scanner oku=new Scanner(System.in);

 // okuma işlemi yapıldı, tablo girilen sayılarla dolduruldu
        for (int i = 0 ; i <tablo.length ; i++)
        {
            for (int j = 0 ; j < tablo[i].length; j++)
            {
                System.out.print("Sayı girin = ");
                tablo[i][j]=oku.nextInt();

                if (tablo[i][j]%2==1)
                    tekMik++;

            }
        }

       int [] tekler=new int[tekMik];  // teklerin miltarı kadar bir dizi tanımlandı, içinde 3 tane tek varsa yazılan sayıların, 3 tane tek boyutlu yer ayırcak bılgısayar
       int teklerIndex=0;

        for (int i = 0 ; i <tablo.length ; i++)
        {
            for (int j = 0 ; j < tablo[i].length; j++)
            {
                if (tablo[i][j]%2==1)
                {
                    tekler[teklerIndex] = tablo[i][j];
                    teklerIndex++;
                }

            }
        }

        System.out.println(Arrays.toString(tekler));



    }
}

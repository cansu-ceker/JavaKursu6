package Gun16;

import java.util.Scanner;

public class _03_JavaArray {
    public static void main(String[] args) {

        // 50 kişilik bir sınıfın notlarını giriniz ve
        // ortalamadan büyük kaç not olduğunu bulunuz ve bunları yazdırınız.


        Scanner oku=new Scanner(System.in);
        int [] notlar=new int[50];  //50tane int kutusu oluşturuldu hafızada
        int toplam=0;
        int gecenlerinAdedi=0;

        for (int i = 0 ; i <notlar.length ; i++)
        {
            System.out.print((i+1)+".Sayı giriniz=");
            notlar[i]=oku.nextInt();

            toplam=toplam+notlar[i];

        }
         double ortalama=(double) toplam/notlar.length;

        for (int i = 0 ; i<notlar.length ; i++)
        {

            if (notlar[i]>ortalama)
            {
                System.out.println(notlar[i]); // geçenlerin notlarını yazdırdık bununla
                gecenlerinAdedi++;
            }

        }

        System.out.println("ortalama = " + ortalama);
        System.out.println("gecenlerinAdedi = " + gecenlerinAdedi);

/*
      benım cozum:


       Scanner reader= new Scanner(System.in);
        int[] notlar= new int[3];
        int toplam=0, sayac=0;

        for (int i = 0; i < notlar.length ; i++) {
            System.out.print( (i+1)+". sayıyı giriniz:");
             notlar[i]= reader.nextInt();
             toplam=toplam+notlar[i];
        }
         double ortalama=(double) toplam/notlar.length;

        for (int i = 0; i <notlar.length ; i++) {

            if (notlar[i]>ortalama){

                System.out.println(notlar[i]);
                sayac++;
            }
            System.out.println("ortalama = " + ortalama);
            System.out.println("kac tane gecmıs = " + sayac);
        }
 */
















    }
}

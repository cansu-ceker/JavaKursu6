package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {

        // Kullanıcıdan alınan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız


        Scanner oku = new Scanner(System.in);
        int dizi[] = new int[5];   //  int [] dizi=new int[5]; ile aynı şey


        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ".Sayı giriniz=");
            dizi[i] = oku.nextInt();
        }

        System.out.println(Arrays.toString(dizi));

        enBuyukYaz(dizi);
        enKucukYaz(dizi);
        ortalamaYaz(dizi);

    }

    public static void enBuyukYaz(int[] dizi)
    {
        Arrays.sort(dizi);
        System.out.println("en büyük = " + dizi[dizi.length - 1]); // sondaki

    }

    public static void enKucukYaz(int[] dizi)
    {
        Arrays.sort(dizi);
        System.out.println("en küçük = " + dizi[0]);  // baştaki

    }

    public static void ortalamaYaz(int[] dizi)
    {

        double toplam = 0;

        for (int i = 0; i < dizi.length; i++) {

            toplam = toplam + dizi[i];

        }
        double ortalama = toplam / dizi.length;
        System.out.println("Ortalama = " + ortalama);


    }

}

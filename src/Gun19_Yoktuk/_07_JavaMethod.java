package Gun19_Yoktuk;

import java.util.Arrays;

public class _07_JavaMethod {
    public static void main(String[] args) {

        // mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir metoda,fonksiyona
        // göndererek random 100 e kadar olan sayılarla dodurunuz. ve aynı fonksiyonda
        // yazdırınız.


        int [] dizi=new int[20];
        diziDoldurYaz (dizi);   // dizi gidecek aşağı diye  parantez ıcıne dızı yazdık

    }

    public static void diziDoldurYaz ( int[]dizi )   // bu public ın ıcındekı dizi kelımelerı yerıne asadrdfefsd da yazsan hepsıne, calısır yanı yuköarıdakı yanı maındekı ıle aynı olmak zorunda degıl
    {
        for (int i = 0 ; i < dizi.length ; i++)
        {
            dizi[i]=(int)(Math.random()*100);
        }

        System.out.println(Arrays.toString(dizi)); // 1 boyutlu dızıyı yazdırma yontemıydı


    }






}

package OOOOdev9_Diziler;

import java.util.Arrays;

public class Soru11 {
    public static void main(String[] args) {

        //int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.

        int [] dizi= {12,2,5,15,8};

        Arrays.sort(dizi);

        System.out.println ("max = "+dizi[dizi.length-1]);







    }
}

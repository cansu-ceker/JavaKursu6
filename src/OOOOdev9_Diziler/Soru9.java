package OOOOdev9_Diziler;

import java.util.Arrays;

public class Soru9 {
    public static void main(String[] args) {

        //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int [] dizi= {15,25,22,18,30};

        Arrays.sort(dizi);

        System.out.println ("en büyük 2. eleman = "+ dizi[dizi.length-2]);













    }
}

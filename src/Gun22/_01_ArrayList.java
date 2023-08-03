package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        // Array     ->  Array metodları
        // ArrayList -> Collection metodları


        ArrayList<Integer> sayilar= new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar1 = " + sayilar);

        // sıralama işlemi
        Collections.sort(sayilar);
        System.out.println("sayilar2 = " + sayilar);

        // tersine çevirme işlemi
        Collections.reverse(sayilar);
        System.out.println("sayilar3 = " + sayilar);

        // bütün elemanları tek bir değerle set etme
        Collections.fill(sayilar,0); // sayıları 0 değeri ile doldur
        System.out.println("sayilar4 = " + sayilar);

        // replace
        Collections.replaceAll(sayilar,0,5);   // sayılar listesindeki 0 ları 5 yap
        System.out.println("sayilar5 = " + sayilar);

        // tanımlarken değer atama***********************************************************************************!!
//        int []dizi={2,3,45,56};
        ArrayList<Integer> liste= new ArrayList<>(Arrays.asList(3,4,56,78,99));
        ArrayList<String> strList= new ArrayList<>(Arrays.asList("ahmet","ayşe","kaya"));

        System.out.println("liste = " + liste);
        System.out.println("strList = " + strList);


        //AddAll : bir liste, bir veya daha fazla değer ekler
        Collections.addAll(sayilar,56,77,88,99,77);
        System.out.println("sayilar6 = " + sayilar);

        //bir diziyi, bir ArrayList e atmak
       Integer[] dizi2={2,3,45,56};
        ArrayList<Integer> liste3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste3 = " + liste3);


        // int sadece sayı saklar
        // Integer sayı saklar ve bir sürü metod saklar















    }
}

package Gun17;

import java.util.Arrays;

public class _06_JavaArraysMetodlar {
    public static void main(String[] args) {

        String [] isimler ={"Ahmet", "Zeynep","Roman","Kaya","Cihan"};

        //hem String hem int diziyi direkt ekrana yazdırmak için
        System.out.println("isimler = " + Arrays.toString(isimler));


        int []a={1,8,3,54};
        System.out.println("a = " + Arrays.toString(a));


        //diziyi alfabetik sıralama (sort)--- Arrays.toString(....)
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));


        // ekrana yazdırırken hep .toString


        // diziler eşit mi--- Arrays.equals( , )

        int [] b={1,8,3,54};
        int [] c={1,3,8,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); //true
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,c)); // false

       // contains gibi çalışır. var ise pozitif sayı verir, yok ise negatif sayı verir
       //  sadece sıralı dizilerde çalışır o zaman pozitif sayı verir

         System.out.println("Arrays.binarySearch(a,3) = " + Arrays.binarySearch(a,3));  // negatif sonuc verir çünkü
                                                                                        //   a dediği bu -->  int []a={1,8,3,54};
                                                                                        //   a sıralı değil, hıc bakmıyor ıcınde var mı 3 dıye, sonuc negatif veriyor

        System.out.println("Arrays.binarySearch(c,3) = " + Arrays.binarySearch(c,3));  // pozitif sonuc verir çünkü
                                                                                       //   c dediği bu -->   int []c={1,3,8,54};

         // diziiyi hızlıca doldurmak bir değer ile

        Arrays.fill(a,5);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));




                                                                                       //   c sıralı olkdugundan ıcıne bakıyo 3 varsa  sonuc pozitif veriyor

    }
}

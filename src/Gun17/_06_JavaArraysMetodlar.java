package Gun17;

import java.util.Arrays;

public class _06_JavaArraysMetodlar {
    public static void main(String[] args) {

        String [] isimler ={"Ahmet", "Zeynep","Roman","Kaya","Cihan"};

        //hem String hem int diziyi direkt ekrana yazdırmak için
        System.out.println("isimler = " + Arrays.toString(isimler));


        int []a={1,8,3,54};
        System.out.println("a = " + Arrays.toString(a));   // erkana yazılan strıng hep dıye dusun ondan .toString dedık dıye dusun


        //diziyi alfabetik sıralama (sort)--- Arrays.sort(....)
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));

//        Arrays.sort(a);  bunlar da oluyor ama asagıdakı esıt mı sorunu bozmasın dıye kapattım cansu ben yazıp denedım bu satırı zaten hocada yok nbu
//        System.out.println("a = " + Arrays.toString(a));


        // ekrana yazdırırken hep Arrays.toString(...)





        // diziler eşit mi--- Arrays.equals( , )

        int [] b={1,8,3,54};
        int [] c={1,3,8,54};

        System.out.println("a ile b eşit mi = " + Arrays.equals(a,b)); //true
        System.out.println("a ile c eşit mi = " + Arrays.equals(a,c)); // false

       // contains gibi çalışır. var ise pozitif sayı verir, yok ise negatif sayı verir
       //  SADECE SIRALI dizilerde çalışır o zaman pozitif sayı verir

         System.out.println("a da 3 var mı = " + Arrays.binarySearch(a,3));  //  negatif sonuc verir çünkü
                                                                             //  a dediği bu -->  int []a={1,8,3,54};
                                                                             //  a sıralı değil, hıc bakmıyor ıcınde var mı 3 dıye, sonuc negatif veriyor

        System.out.println("c de 3 var mı = " + Arrays.binarySearch(c,3));  // pozitif sonuc verir çünkü
                                                                           //  c dediği bu -->   int []c={1,3,8,54}; sıralı oldugu ıcın baktı ve 3u gordu ve sonuc +


         // diziyi hızlıca doldurmak bir değer ile
        Arrays.fill(a,5);  // diziyi doldur (a adındakini diziyi, 5 ile)
        System.out.println("a dizisi = " + Arrays.toString(a));




                                                                                       //   c sıralı olkdugundan ıcıne bakıyo 3 varsa  sonuc pozitif veriyor

    }
}

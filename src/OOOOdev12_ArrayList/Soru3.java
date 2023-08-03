package OOOOdev12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru3 {
    public static void main(String[] args) {

//        getSum() isminde bir method oluşturun.
//        Parametresi ArrayList olmalı
//        Return tipi int olmalı.
//        ArrayList teki tüm sayıları birbiri ile toplayın.
//        return olarak toplam sonucu döndürün.
//                Örneğin;
//        Arraylist = 1,2,3,4,5
//        return 15 olmalı

        Integer []dizi={1,2,3,4,5};
        ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(dizi));



      int SONUC=getSum(liste);
        System.out.println("SONUC = " + SONUC);



    }

   public static int getSum (ArrayList<Integer> a)
   {

       int toplam=0;

       for (int i = 0 ; i <a.size() ; i++)
           toplam=toplam+a.get(i);


       return toplam;
   }

}

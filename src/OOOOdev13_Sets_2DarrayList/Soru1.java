package OOOOdev13_Sets_2DarrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Soru1 {
    public static void main(String[] args) {

//        totalCount() isminde bir method oluşturun.
//        Parametresi  'Integer Hashset' olmalı
//        HashSetteki eleman sayısını alın.
//        totalCount'u döndürün.
//        _**Örnek:**_
//                hashset ; 4,2,3,1,7
//        cevap: 5


        Integer []dizi={4,2,3,1,7};
        HashSet<Integer>hs=new HashSet<>(Arrays.asList(dizi));

        totalCount(hs);


    }

    public static void totalCount (HashSet<Integer>hs)
    {
        System.out.println("cevap = " + hs.size());

    }


}

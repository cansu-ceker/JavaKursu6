package OOOOdev12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru2 {
    public static void main(String[] args) {


// ismi getCount() olan bir method oluşturun.
// Parametre olarak bir String ArayList  ve  bir tane String
// Return tipi int olmalı.
// ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
//     Örneğin;
//ArrayList = Orange , Kiwi , Peach , Banana , Orange
//String Orange:
// Count = 2 olmalı. (Orange 2 kez yazılmış)


       String []dizi={"Orange","Kiwi","Peach","Banana","Orange"};

        ArrayList<String> liste=new ArrayList<>(Arrays.asList(dizi));
        System.out.println("liste = " + liste);


       int count=getCount(liste);
        System.out.println("count = " + count);

    }

    public static int getCount (ArrayList<String> liste)
    {
        int tekrarAdet=0;


        for (int i = 0 ; i <liste.size() ; i++)
        {
         if(liste.get(i).equalsIgnoreCase("orange"))
             tekrarAdet++;


        }





        return tekrarAdet;
    }
}


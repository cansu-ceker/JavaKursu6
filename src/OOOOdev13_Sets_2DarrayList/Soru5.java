package OOOOdev13_Sets_2DarrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru5 {
    public static void main(String[] args) {

//        2D ArrayList
//        Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//        Store all the elements in one arraylist and print the arraylist
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//                **Örnek:**
//```
//**Girdi:**
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//**Çıktı:** [1,2,3,4,5,6,7,8,9]
//```

int [][] dizi= {{1,2,3} , {4,5,6} , {7,8,9}};
ArrayList<Integer>list=new ArrayList<>();


        for (int i = 0 ; i < dizi.length ; i++)
        {
            for (int j = 0 ; j <dizi[i].length ; j++)
            {
                list.add(dizi[i][j]);
            }
        }
        System.out.println("list = " + list);




    }


}

package OOOOdev12_ArrayList;

import java.util.ArrayList;

public class Soru1 {
    public static void main(String[] args) {

//Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//Store all the elements in one arraylist and print the arraylist
//Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
// **Örnek:**
//```
//**Girdi:**
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//**Çıktı:** [1,2,3,4,5,6,7,8,9]
//```

int [][]tablo= {{1, 2, 3},{4, 5, 6},{7, 8, 9 }};

       ArrayList<Integer>list=new ArrayList<>();

        for (int i = 0 ; i <tablo.length ; i++)
        {
            for (int j = 0 ; j <tablo[i].length ; j++)
            {
            list.add(tablo[i][j]);
            }
        }

        System.out.println("list = " + list);









    }
}

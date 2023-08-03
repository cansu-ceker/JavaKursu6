package OOOOdev12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru4 {
    public static void main(String[] args) {

//        getLength() isminde bir method oluşturun.
//        Parametre olarak String ArrayList
//        Return tipi Integer ArrayList
//        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
//                Tüm elementlerin uzunluğunu döndürün
//                Örneğin;
//        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
//        Tüm Stringlerin uzunluklarını yazdırın;
//        cevap: 10 ,  8 , 4 , 7 , 6 olmalı


        String []dizi={"New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"};
        ArrayList<String>liste=new ArrayList<>(Arrays.asList(dizi));



        ArrayList<Integer> SONUC=getLength(liste);
        System.out.println("SONUC = " + SONUC);


    }
    public static ArrayList<Integer> getLength(ArrayList<String> S)
    {
        ArrayList<Integer>uzunluklar=new ArrayList<>();


        for (int i = 0 ; i <S.size() ; i++)

            uzunluklar.add(S.get(i).length());

        return uzunluklar;


    }
}

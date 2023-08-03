package OOOOdev12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Soru5 {
    public static void main(String[] args) {

//        ismi changelnArraylist() olan bir method oluşturun.
//        Parametre olarak String ArrayList, String s1, String s2
//        Arraylist'te s1'i s2 olarak değiştirin
//        Return String arrayList
//                Örneğin;
//        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
//        s1 = blue
//        s2 = yellow
//        Tüm blue 'ları yellow'a dönüştürün.
//        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

        String [] dizi= {"yellow" , "red" , "blue" , "red" , "blue"};
        ArrayList<String>liste=new ArrayList<>(Arrays.asList(dizi));
        System.out.println("liste = " + liste);

        ArrayList<String>yeniListe=changelnArraylist(liste,"blue","yellow");
        System.out.println("yeniListe = " + yeniListe);



    }

    public static ArrayList<String> changelnArraylist(ArrayList<String>renk,String s1,String s2)
    {

        Collections.replaceAll(renk,s1,s2);

        return renk;

    }



}


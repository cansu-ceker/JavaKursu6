package OOOOdev13_Sets_2DarrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Soru2 {
    public static void main(String[] args) {

//        changeSet() isminde bir method oluşturun
//        Parametre olarak bir String HashSet   ve  iki String
//        return hashset olmalı
//        Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//**ÖRNEK:**
//        hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//        String 1 = **banana**
//        String 2 = **peach**
//**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"


       String[]dizi={"banana" , "strawberry" , "kiwi" , "pineapple"};
        HashSet<String>hs=new HashSet<>(Arrays.asList(dizi));



        String s1="banana";
        String s2="peach";

        HashSet<String>yazdir= changeSet(hs,s1,s2);
        System.out.println("yazdir = " + yazdir);




    }
    public static HashSet<String> changeSet(HashSet<String>hs, String s1, String s2)
    {
        ArrayList<String>liste=new ArrayList<>(hs);

        if (liste.contains(s1))
            Collections.replaceAll(liste,s1,s2);

        HashSet<String>gonder=new HashSet<>(liste);

return gonder;

    }



}

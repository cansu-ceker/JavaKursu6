package OOOOdev13_Sets_2DarrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Soru3 {
    public static void main(String[] args) {

//        commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
//        return tipi arraylist olmalı.
//**ÖRNEĞİN:**
//        İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
//        İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
//        Ortak değerleri ArrayListe ekleyiniz.
//        çıktı:  "Germany" , "Brazil" ,"USA"
//        ArrayListi yazdırınız.



        HashSet<String> hs1=new HashSet<>(Arrays.asList("Germany","England","South Africa","Brazil","USA"));
        HashSet<String> hs2=new HashSet<>(Arrays.asList("Germany","China","Brazil","France","USA"));

        ArrayList<String> liste=commonValues(hs1,hs2);
        System.out.println("liste = " + liste);



    }

    public static ArrayList<String> commonValues(HashSet<String> hs1,HashSet<String> hs2)
    {

        HashSet<String>ortakElemanlar=new HashSet<>();
        ortakElemanlar.addAll(hs1);
        ortakElemanlar.retainAll(hs2);
        ArrayList<String>l=new ArrayList<>(ortakElemanlar);

        return l;
    }


}

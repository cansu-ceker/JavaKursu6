package OOOOdev9_Diziler;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Soru13 {
    public static void main(String[] args) {

        //Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        //$ işaretlerini kaldırın ve sayıları toplayın.
        //Sayıların toplamını yazdırın.


        String kelime= "$12 $23 $10 $2 $5 $2";

        String [] kelimelerr=kelime.split(" ");


        for (int i = 0 ; i <kelimelerr.length ; i++)
        {
            kelimelerr[i]=kelimelerr[i].replaceAll("[$]","");

        }

        int [] sayilar= new int[kelimelerr.length];
        int toplam=0;

        for (int i = 0 ; i <kelimelerr.length ; i++)
        {
           sayilar[i]=Integer.parseInt(kelimelerr[i]);

           toplam=toplam+sayilar[i];

        }

        System.out.println("toplam = " + toplam);











    }
}

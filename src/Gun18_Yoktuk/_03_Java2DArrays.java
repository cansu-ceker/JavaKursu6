package Gun18_Yoktuk;

import java.util.Arrays;

public class _03_Java2DArrays {
    public static void main(String[] args) {

        int [][] tablo={
                {2,3,44},   // 1. satur 3 elemanlı
                {45,66,5}   // 2. satur 3 elemanllı
        };

        System.out.println(Arrays.toString(tablo[0])); // 1. satırın tumu yazdırmak ıcın
        System.out.println(Arrays.toString(tablo[1])); // 2. satırın tumu yazdırmak ıcın

        System.out.println("1.satırın uzunlugu = " + tablo[0].length); //satırın uzunlugunu verdırdık yanı sonuc =3 cıkacak
        System.out.println("2.satırın uzunlugu = " + tablo[1].length); //satırın uzunlugunu verdırdık yanı sonuc =3 cıkacak

        System.out.println("tabloda kac satır var = " + tablo.length); // kaç satır var tabloda kodu


        for (int satir=0 ; satir<tablo.length ; satir++) //satır 1 ve 2 var
        {
            for (int sutun=0 ; sutun<tablo[satir].length ; sutun++)    //her bır satırın sutunlarını yazdıran for
                System.out.print(tablo[satir][sutun] + " ");

            System.out.println(); //2,3,4 u yazdıktan sonra alt satıra gecıp 45,66,5 yazsın dıye yazdık bu komutu

        }



    }
}

package Gun18_Yoktuk;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

        // 2x3 lük bir tabloyu random 10 a kadar sayılarla doldurunuz.
        // Daha sonra kullanıcıdan bir sayı alınız.Bu sayı tabloda
        // var ise yerini (satir,sütun) yazdırınız.


          int [][] tablo= new int[2][3];

    // doldurma işlemi
        for (int satir = 0; satir < tablo.length; satir++)
        {
            for (int sutun = 0; sutun <tablo[satir].length ; sutun++)
                tablo[satir][sutun]= (int)(Math.random()*10); // 10 dahıl derse *11 yapardık
        }


// yazıdrma işlemi

        for (int satir = 0; satir < tablo.length; satir++)
        {
            for (int sutun = 0; sutun <tablo[satir].length ; sutun++)
                System.out.print(tablo[satir][sutun] + " ");


            System.out.println();  // satırın bıtırınce bır asagı kaysın dıye bunu yazdık
        }


        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int arananSayi= oku.nextInt();


      for (int satir = 0; satir < tablo.length; satir++)
      {
          for (int sutun = 0; sutun <tablo[satir].length ; sutun++)
              if ( tablo[satir][sutun]==arananSayi)
                  System.out.println("satir ="+satir+ ", sutun ="+sutun);

      }


    }
}

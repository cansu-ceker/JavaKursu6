package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazdırınız.


        int []dizi=new int[10];


        for (int i = 0 ; i<dizi.length ; i++)
          dizi[i]= (int) (Math.random()*11); // 10 dahil dediği için

        //   yazdırmak ıcın for dongusu kullanıyoduk ya ona gerek kalmadı onun yerine bır alttakı sout u yazarım ekrana dızıyı yazdırmak ıstersem:
       //   System.out.println("dizi = " + Arrays.toString(dizi)); yazabilirim.

        Scanner oku=new Scanner(System.in);
        System.out.print("Aranan sayıyı gir=");
        int arananSayi= oku.nextInt();

        for (int i = 0 ; i<dizi.length ; i++)
        {

            if (dizi[i]==arananSayi)
                System.out.println("Var, Sayının indexi = " + i);

        }








    }
}

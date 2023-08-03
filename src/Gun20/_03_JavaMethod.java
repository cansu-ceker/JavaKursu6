package Gun20;

import Tools.MyFunc;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {

        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("1.sayı =");
        int s1= oku.nextInt();

        System.out.print("2.sayı =");
        int s2= oku.nextInt();

        int buyuk=enBul(s1,s2);
        buyuk= MyFunc.enBul(s1,s2); //  Tools diye klasör açtım içine MyFunc class actım orası benım kutuphanem oldu oradan cagırabılırım bu sekılde kodları
                                    // cagırınca asagaıda kodunu yazmama gerek kalmadı
                                    // nasılsa benm kutuphanemde kayıtlı var o oradan alıp calısıyor
        System.out.println("buyuk = " + buyuk);
    }

    public static int enBul(int s1,int s2)
    {
         int buyuk=0;
         if (s1>s2)
             buyuk=s1;
         else
             buyuk=s2;
         return buyuk;

     /* 2. yol

      return (s1>s2 ? s1 : s2);   //   s1>s2 ise sonuc s1 olsun DEĞİLSE yani : demek, sonucs2 olsun

         3. yol

         if (s1>s2)
            return s1;
         else
             return s2;

 */

    }





}

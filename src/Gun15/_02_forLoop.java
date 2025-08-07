package Gun15;

import java.util.Scanner;

public class _02_forLoop {
    public static void main(String[] args) {

        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // bolum 2:  carpimin degeri 1000 ü geçtiğinde işlem sonlansın.


        Scanner oku=new Scanner(System.in);
        System.out.println(" Sayı giriniz= ");
       int sinir= oku.nextInt();

       int carpim=1;

        for (int i=1 ; i<=sinir ; i++ )
        {
            System.out.println("carpim = " + carpim + "*" +i);   // buna gerek yok gorelım dıye yazdık

            carpim=carpim*i;

            System.out.println("=" + carpim);  // buna gerek yok gorelım dıye yazdık


        if(carpim>1000)      // burada {} koymak zorundayız if ten sonra 2 ıslem oldugu ıcın yoksa calısmaz
        {
            System.out.println("işlem sonlandı");
            break;
        }

        }

    }
}

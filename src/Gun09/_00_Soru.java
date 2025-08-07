package Gun09;

import java.util.Scanner;

public class _00_Soru {
    public static void main(String[] args) {

        //girilen bir sayının tek sayı olup olmadığını yazdırın
        //true veya false


        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı gir = ");
        int sayi= oku.nextInt();


        System.out.println("TEK Mİ = " +((sayi%2)==1) );

        int kalan= sayi%2;
        boolean tekMi=(kalan==1);
        System.out.println("tekMi = " + tekMi);


        /* ya da uzunca aşagıdakılerı yazarsın dırekt sout ıcıne yazmakta zorlanırsan, yazasın int sayi yi  tanımladıktan sonra

         int kalan=sayi%2;  // 1 ise tektir
         System.out.println("tek mi = " + (kalan==1));



         */









    }
}

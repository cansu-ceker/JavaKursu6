package Gun11;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67   gibi

        Scanner oku=new Scanner(System.in);
        System.out.print("aralarında 1er boşluk bırakarak 2 sayı gir="); //55 423  aralarında 1 bosluk olunca bu String olurt int okumaqzz bunu bılgısyar
         String sayi= oku.nextLine();


         int boslukIndexi=sayi.indexOf(" ");

        String sayi1=sayi.substring(0,boslukIndexi); //55 sayı görünümlü String
        String sayi2=sayi.substring(boslukIndexi+1);  //423 sayı görünümlü String

        int intSayi1= Integer.parseInt(sayi1);
        int intSayi2=Integer.parseInt(sayi2);

        if (sayi1==sayi2)
            System.out.println("EŞİT");   //55 sayı oldu
        else
            System.out.println("eşit değil");  // 423 sayı oldu

         // sayı oldugu zaman esıtlıgı ınt ten sayıdan yaptır. equals ı String ken yap






    }
}

package Gun11;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67   gibi

        Scanner reader=new Scanner(System.in);
        System.out.print("sayıları gır:");
        String sayiStr=reader.nextLine();  // aralarında bosluluklu grıldıgı ıcın bılg onu String olarak algılar o yuzden str okutma yaptm

        int bosluk=sayiStr.indexOf(" ");
        String sayi1= sayiStr.substring(0,bosluk);
                String sayi2=  sayiStr.substring(bosluk+1);

                int s1=Integer.parseInt(sayi1);
                int s2=Integer.parseInt(sayi2);

                if (s1==s2)
                    System.out.println("sayılar esıt");
        else
                    System.out.println("degıl");



        Scanner oku=new Scanner(System.in);
        System.out.print("aralarında 1er boşluk bırakarak 2 sayı gir="); //55 423  aralarında 1 bosluk olunca bu String olurt int okumaqzz bunu bılgısyar
        String sayi= oku.nextLine();


         int boslukIndexi=sayi.indexOf(" ");

        String strSayi1=sayi.substring(0,boslukIndexi); //55 sayı görünümlü String
        String strSayi2=sayi.substring(boslukIndexi+1);  //423 sayı görünümlü String

        int intSayi1= Integer.parseInt(strSayi1); //55 sayı oldu
        int intSayi2=Integer.parseInt(strSayi2); // 423 sayı oldu

        if (intSayi1==intSayi2)
            System.out.println("EŞİT");
        else
            System.out.println("eşit değil");

         // sayı oldugu zaman esıtlıgı ınt ten sayıdan yaptır. equals ı String ken yap






    }
}

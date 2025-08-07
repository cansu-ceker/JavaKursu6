package Gun19_Yoktuk;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {

    // bir sayının tek mi çift mi olduğunu yazdırınız

        int sayi=55;
        if (sayi%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");

/* ********************************************************************** */

        tekMiÇiftMiYaz(55);
        tekMiÇiftMiYaz(60);


 /* ********************************************************************** */

         okuTekMiÇiftMiYaz();

    }

    public static void tekMiÇiftMiYaz (int sayi)
        {
            if (sayi%2==0)
                System.out.println("metottan geldi: çift");
            else
                System.out.println("metottan geldi: tek");
        }

    public static void okuTekMiÇiftMiYaz ()
    {
        Scanner oku=new Scanner(System.in);
        System.out.println("sayı girin = ");
        int sayi= oku.nextInt();

        tekMiÇiftMiYaz(sayi);    // bu satır aşağıdakilerin yerine geçiyor, kısaca bunu yazdık  bak çağırdık

//        if (sayi%2==0)
//            System.out.println("metottan geldi: çift");
//        else
//            System.out.println("metottan geldi: tek");
//

    }










}

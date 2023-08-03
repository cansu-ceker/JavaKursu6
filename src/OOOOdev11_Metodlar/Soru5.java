package OOOOdev11_Metodlar;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

      //  Girilen bir diziyi tersten yazdıran bir metod yazınız.


        ters();




    }

    public static void ters ()
    {

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle Giriniz=");
        String cumle=oku.nextLine();

        char [] harfler=new char[cumle.length()];

        for (int i = (cumle.length()-1) ; i >=0 ; i--)
        {
            harfler[i]=cumle.charAt(i);
            System.out.print(harfler[i]);

        }





    }

    }


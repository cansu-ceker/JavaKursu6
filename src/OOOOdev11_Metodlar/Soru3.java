package OOOOdev11_Metodlar;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

//        reverseString isminde bir method oluşturun.
//        Bu method bir String'i parametre olarak alsın.
//        Ve bu method, girilen String'i tersten yazsın.
//        Terste yazılmış halini yazdırınız.
//        Örn: String = "Java'yı Seviyorum."
//        Print: .muroyiveS ıy'avaJ


       reverseString();




    }

    public static void reverseString ()
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
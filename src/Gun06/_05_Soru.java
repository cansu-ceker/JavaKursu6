package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

     //girilen bir String in sadece son harfini yazdırın


       // 1. yöntem

        Scanner oku=new Scanner(System.in);   //kullanıcı bir cümle girsin
        System.out.print("Cümle girin = ");
        String cumle= oku.nextLine();        // girilen cümleyi bilgisayar okusun
        
        int uzunluk=cumle.length();          // cümlenin uzunluğunu buldurduk bu kodla
        char sonHarf=cumle.charAt(uzunluk-1);   // son harfi bulduk bu kodla
                                                // length-1 son harfi verir hep
        System.out.print("sonHarf = " + sonHarf);  // son harfi yazdırma kodu

 /*
        //2. yöntem

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle girin = ");
        String cumle= oku.nextLine();

        System.out.println("sonHarf = " + cumle.charAt( cumle.length()-1) );

*/




    }
}

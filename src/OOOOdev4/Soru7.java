package Odev2;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {

         //Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        //   Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Banka hesabın varsa true yaz,yoksa false yaz ");

        boolean hesap=oku.nextBoolean();


        System.out.println("Hesap = " + hesap);









    }
}

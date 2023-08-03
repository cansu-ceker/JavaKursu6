package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("sayi=");
        int sayi=oku.nextInt();


        // normal yöntem
        if (sayi%2==0)
            System.out.println("ÇİFT");
        else
            System.out.println("TEK");


        // 1. kısa yöntem
        String sonuc= (sayi%2 ==0) ? "çift" : "tek";    // ? if demek, : else demek
        System.out.println(sonuc);

        // 2. kısa yöntem
        System.out.println( (sayi%2==0) ? "çift" : "tek");

        //sonuç ne ise ona göre belirliyoruz yani data tipini,
        // burada sonuç String olduğu için tek, cift oldugu ıcın String sonuc= yazdık
        // mesela sonuç rakamlı bir ifade olsaydı integer yazacaktık






    }
}

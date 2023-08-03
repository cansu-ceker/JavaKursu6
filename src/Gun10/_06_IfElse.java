package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.



        Scanner oku=new Scanner(System.in);
        System.out.print(" Password= ");
        String sifre= oku.nextLine();
                                                  // ! koyduk pass, olmaMALI DEMEK İÇİN
                                                  // ! toLowerCase i etkilemez, && dan sonrasını bütün düşünüp onun tersini alır
        if (sifre.length()>=8 && sifre.length()<=12 && !sifre.toLowerCase().contains("pass"))
                                                                         // ("pass"== false)
        System.out.println("UYGUN");


        else
        System.out.println("UYGUN DEĞİL");


         // bu örnekte hepsi VE && olduğu için ( ) kullanmadık
        // VE ve VEYA olsa ( ) kullanmak zorundayız











    }
}

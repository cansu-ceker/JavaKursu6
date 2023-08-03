package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {


         // birbirinin tersi durumlar için kullan    if - else yi
        // ayrı ayrı if de yapabilirsin ama  o zaman bilg her 2 ifi de okuyup fazladan kod okur yorulur gerek yok

        Scanner oku=new Scanner(System.in);
        System.out.println(" Not gir= ");
        int not= oku.nextInt();


        // 1. yöntem, not 100 olsun 1. if çalışır ekrana geçtiniz yazar, arkada 2. ifi de çalıştırır uymadığı için yazmaz. ama arkada çalıştırır yorulur.
        if (not>=50)
            System.out.println("geçtiniz");
        if (not<50)
            System.out.println("kaldınız");

        // 2.yöntem olması gereken

        if (not>=50)
            System.out.println("gectiniz");
        else                                    // !(not>=50)  not 50den büyük değilse
            System.out.println("kaldınız");










    }
}

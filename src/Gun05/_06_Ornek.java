package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {

        
//bir karenin kenarını(tamsayı)kullanıcıdan isteyip çevresin ve alanını yazdır
// cevre=a+a+a+a    alan=a*a


        Scanner oku= new Scanner(System.in);

        System.out.println(" Kenar uzunluk girin= ");
        int a= oku.nextInt();
        
        int cevre=a+a+a+a;
        int alan=a*a;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


       /*  Scanner oku= new Scanner(System.in);

        System.out.println(" Kenar uzunluk girin= ");
        int a= oku.nextInt();
        System.out.println("cevre = " + (4*a));
        System.out.println("alan = " + (a*a));

       bu kodlarla da çalışır yazılır yani bu

        */





    }
}

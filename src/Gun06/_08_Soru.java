package Gun06;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // girilen bir ad soyad örneğin "Cansu Çeker"  C.Ç. şeklinde yazdırınız


        Scanner oku=new Scanner(System.in);
        System.out.print(" Ad Soyad= ");
        String adSoyad= oku.nextLine();   //Cansu Çeker

        char ilkHarf =adSoyad.charAt(0);  // adın ilk harfi oldugu için char ile yaptık

        int boslukIndex= adSoyad.indexOf(" ");  // boşlugun numrasını buldurduk
        char soyadIlkHarf =adSoyad.charAt(boslukIndex+1); // bosluk hangı numaradaysa ondan bır sonraki harfi, al, harf alıncagı ıcın char


        System.out.println(ilkHarf+"."+soyadIlkHarf+".");











    /* ayrı ayrı girdirdim bu benım cevap
        Scanner oku=new Scanner(System.in);
        System.out.print(" Ad= ");
        String ad= oku.nextLine();

        System.out.print("Soyad = ");
        String soyad= oku.nextLine();

        char a =ad.charAt(0);
        char s=soyad.charAt(0);

        System.out.println("Ad Soyad = " + a+". "+s+". ");

*/





    }
}

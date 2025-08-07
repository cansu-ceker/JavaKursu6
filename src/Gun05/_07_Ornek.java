package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {

        // bir dikdörtgenin kenarını kullanıcıdan iste, çevresi ve alanı bul yazdır
        // cevre= a+b+a+b  alan=a*b


        Scanner oku=new Scanner(System.in);

        System.out.print(" Kısa kenar uzunluğu= ");
        int kisaKenar= oku.nextInt();

        System.out.print(" Uzun kenar uzunluğu= ");
        int uzunKenar= oku.nextInt();

        int cevre=kisaKenar+kisaKenar+uzunKenar+uzunKenar;
        int alan=kisaKenar*uzunKenar;

        System.out.println("Çevresi = " + cevre + "\n"+ "Alanı =" + alan);

        // System.out.println("Çevresi = " + cevre);   -- bır usttekı yerıne bu ıkısını de yazabılırız
       // System.out.println("Alanı = " + alan);

        System.out.println("toplam:"+(kisaKenar+uzunKenar));











    }
}

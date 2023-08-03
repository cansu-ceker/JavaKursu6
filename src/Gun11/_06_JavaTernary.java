package Gun11;

import java.util.Scanner;

public class _06_JavaTernary {
    public static void main(String[] args) {

        //Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //olduğunu Ternary operatör ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı=");
        int sayi= oku.nextInt();

        System.out.println( sayi==0 ? "SIFIR" : sayi<0 ? "Negatif" : "pozitif");



    }
}

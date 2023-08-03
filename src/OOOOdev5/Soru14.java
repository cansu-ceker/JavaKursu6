package OOOOdev5;

import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {

        //Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

        Scanner oku=new Scanner(System.in);

        System.out.print(" Ad girin= ");
        String ad= oku.nextLine();

        System.out.print(" Soyad girin= ");
        String soyad= oku.nextLine();

        // System.out.println("TAM AD = " + ad+" "+soyad);

        System.out.println("TAM AD = " + ad.concat(" "+soyad));

    }
}

package OOOOdev5;

import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {

        //Girilen bir kelimenin ilk ve son harfini bulunuz.

        Scanner oku=new Scanner(System.in);

        System.out.print("Kelime gir = ");
        String kelime= oku.nextLine();

        System.out.println("Kelimedeki ilk index = " + kelime.charAt(0));

        int uzunluk=kelime.length();
        System.out.print("Kelimedeki son index = " + kelime.charAt(uzunluk-1));



    }
}

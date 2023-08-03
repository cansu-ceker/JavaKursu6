package Gun14;

import java.util.Scanner;

public class _03_doWhile {
    public static void main(String[] args) {

        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("ifade giriniz=");
        String kelime= oku.nextLine();  // String kelime; olmuyor dıkkat

        while (!kelime.equalsIgnoreCase("x"))
        {
            System.out.println("program çalışlıyor");
            System.out.print("kelime/harf gir=");

            kelime= oku.nextLine();

        }
        System.out.println("Program bitti");






    }
}

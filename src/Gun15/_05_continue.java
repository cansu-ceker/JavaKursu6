package Gun15;

import java.util.Scanner;

public class _05_continue {
    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.


        Scanner oku=new Scanner(System.in);
        System.out.println("metin gir=");
        String metin= oku.nextLine();

        for (int i = 0 ; i<metin.length() ; i++)
        {

            if (metin.charAt(i) ==' ')
                continue;

            System.out.println(metin.charAt(i));


        }















    }
}

package Gun14;

import java.util.Scanner;

public class _04_doWhile {
    public static void main(String[] args) {

        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku=new Scanner(System.in);
        String kelime;  // burada ne dedıgının onemı yok sadece whıle ıcınde kelımeo ldugu ıcın dongunun basında burada bı kelıme tanımalamak lazım
                        //  String kelime= "c";  da olur a da b de olur cansu da olur
        do
        {
            System.out.print("kelime/harf gir=");
            kelime= oku.nextLine();

            if (!kelime.equalsIgnoreCase("x"))
             System.out.println("Program çalışıyor");
        }
        while (!kelime.equalsIgnoreCase("x"));

        System.out.println(" program bitti");

    }
}

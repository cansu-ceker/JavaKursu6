package OOOOdev5;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {

        //Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

             Scanner oku=new Scanner(System.in);
        System.out.print("Kelime girin = ");
        String kelime= oku.nextLine();

        System.out.println("boş mu = " + kelime.isEmpty());




    }
}

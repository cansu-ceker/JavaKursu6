package OOOOdev6;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

         //Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bularak,    50 ve yukarısında ise geçtiniz , altında ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("vize=");
        int vize= oku.nextInt();

        System.out.print("final=");
        int fnl= oku.nextInt();

        double ort= (0.4*vize)+(0.6*fnl);

        if(ort>=50)
            System.out.println("Geçtiniz.");

        if(ort<50)
            System.out.println("Kaldınız.");









    }
}

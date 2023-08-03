package OOOOdev6;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        //Girilen bir cümle A harfi ile başlıyorsa , EVET, başlamıyorsa HAYIR yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle girin=");
        String cumle= oku.nextLine();


        if (cumle.toUpperCase().startsWith("A"))
            System.out.println("EVET");

        if (!cumle.toUpperCase().startsWith("A"))
            System.out.println("HAYIR");





    }
}

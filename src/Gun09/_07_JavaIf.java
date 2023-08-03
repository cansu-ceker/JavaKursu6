package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {

        // Girilen bir cümledeki a veya A farketmeksizin a harfinin olup olmadığı yazdırınız
        // VAR ve YOK şeklinde
        // HAVA---- var desin
        //hava ---- var desin
        //emel----yok desin
        //EMEL --- yok desin

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle = ");
        String cumle= oku.nextLine();

        cumle=cumle.toLowerCase(); // bütün harfler küçük oldu bu komutla

        if(cumle.contains("a"))             // bütün harfleri kucuk olan
            System.out.println("var");

        if (!cumle.contains("a"))
            System.out.println("yok");






    }
}

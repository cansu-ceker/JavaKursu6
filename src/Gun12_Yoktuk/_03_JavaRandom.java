package Gun12_Yoktuk;

import java.util.Scanner;

public class _03_JavaRandom {
    public static void main(String[] args) {
        //  (int)(Math.Random()*10)  -> 0-9 arası üretir, 0-20  0-100
        //  20-30 arası random sayı ?   min, birde max lazım, alt sınır ve üst sınır

        // Girilen min ve max aralığında random sayı üreten programı yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("min (alt Sinir)= ");
        int min=oku.nextInt();

        System.out.print("max (üst Sinir)= ");
        int max=oku.nextInt();
                                                     //  bu min ile topladık ki 0 dan baslayıp degıl de mın degerden ıtıbaren random sayı uretsın dıye
        int rndSayi= (int) (Math.random()*(max-min))  + min;
                        //  (burası 0 dan max-mın mıktarı kadar random sayı uret)


        System.out.println("rndSayi = " + rndSayi);

    }
}

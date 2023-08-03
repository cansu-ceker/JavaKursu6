package OOOOdev11_Metodlar;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
//        Ismi **randomNum** olan bir method oluşturun.
//        Parametre olarak **int max** almalı.
//        Bu method, 0 ile max arasında random bir değer döndürmelidir.
//        Random numarayı döndürünüz.




        randomNum(3);
        System.out.println("random numara=" +randomNum(3));

    }
    public static int randomNum (int max)
    {
        int rndSayi=(int)(Math.random()*max);

        return rndSayi;
    }





}

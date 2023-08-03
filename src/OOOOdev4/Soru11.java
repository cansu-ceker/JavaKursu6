package Odev2;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {

    //Kullanıcdan alacağınız 3 öğrenci ders notunun ortalamasını ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);


        System.out.print("Not1 girin= ");
        double not1= oku.nextDouble();

        System.out.print("Not2 girin= ");
        double not2= oku.nextDouble();


        System.out.print("Not3 girin= ");
        double not3= oku.nextDouble();


        double ort=(not1+not2+not3)/3;
        System.out.println("Not ortalaması = " + ort);



    }
}

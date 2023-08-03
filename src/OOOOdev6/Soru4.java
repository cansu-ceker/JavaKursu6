package OOOOdev6;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        //Kullanıcıdan 2 kere şifresini isteyiniz, aynı ise TAMAM, değil ise HATALI şifre yazınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("şifre1=");
        int sifre1= oku.nextInt();

        System.out.print("şifre2=");
        int sifre2= oku.nextInt();

        if(sifre1==sifre2);
        System.out.println("TAMAM");

        if(sifre1!=sifre2);
        System.out.println("HATALI");








    }
}

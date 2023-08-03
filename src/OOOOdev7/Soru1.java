package OOOOdev7;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67   gibi

       Scanner oku=new Scanner(System.in);
        System.out.print("2 SAYI GİRİN=");
        String sayi= oku.nextLine();

        int bosluk=sayi.indexOf(" ");

        String sayi1=sayi.substring(0,bosluk);
        String sayi2=sayi.substring(bosluk+1);

      if (sayi1.equals(sayi2))
          System.out.println("Sayılar eşit");
      else
          System.out.println("Sayılar eşit değil.");










    }



}

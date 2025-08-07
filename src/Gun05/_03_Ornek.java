package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {

        //kullanıcıdan adını ve soyadını alarak ekrana yazdırın


        Scanner oku=new Scanner(System.in);//okuma işlemini yapacak olan değişkeni tanımladık
        System.out.print("Adınız ve Soyadınız=");

        String adSoyad= oku.nextLine();  //okuma işlemi bu noktada yapılıyor

        System.out.println("adSoyad = " + adSoyad); // verinin gerçekten okunabildiğini
                                                   // ekrana yazıdrarak kontrol ettim









    }
}

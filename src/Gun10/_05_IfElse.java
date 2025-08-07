package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
         // Girilen bir stringin uzunluğu 10 dan büyükse ve
        // string içinde "study" kelimesi (KUCUK BUYUK FARKETMESIZIN) geçiyorsa ekrana evet yazdırın değilse
        // hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print(" cümle= ");
        String cumle= oku.nextLine();

        // eğer (cumlenın uzunlugu>10 VE cumlenin hepsi küçüğe cevirilince study içeriyorsa)


        if (cumle.length()>10 && cumle.toLowerCase().contains("study"))
            System.out.println("EVET");
        else
            System.out.println("HAYIR");







    }
}

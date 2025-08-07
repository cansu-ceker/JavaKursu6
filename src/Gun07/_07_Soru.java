package Gun07;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        // Tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad)

        Scanner oku=new Scanner(System.in);

        System.out.print(" Adınız ve Soyadınız= ");
        String adSoyad= oku.nextLine();

        // 0- boşluğun indexine kadar desem adı,
        // boşluğun indexi+1 den başlatıp sonuna kadar desem soyadını verir

        int bosluk=adSoyad.indexOf(" ");

        String ad=adSoyad.substring(0,bosluk);
        String soyad= adSoyad.substring(bosluk+1);

        System.out.println("Ad = " + ad);
        System.out.println("Soyad = " + soyad);



    }
}

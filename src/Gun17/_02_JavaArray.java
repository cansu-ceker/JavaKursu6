package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {

        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        // Bu gun hava cok guzel -> 5

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle girin");
        String cumle= oku.nextLine();

        int bosluk=0;
        for (int i = 0 ; i <cumle.length() ; i++)   // bosluk sayısını bulmak ıcın for yapıyoruz
        {
        if (cumle.charAt(i)==' ')  // 0. harf bosluk mu, 1. harf bosluk mu evetse bosluk sayısını artır
            bosluk++;

        }
        System.out.println("kelime sayısı = " + bosluk+1);  //bosluk ssayısının 1 fazlası kelıme sayısını verır

    }
}

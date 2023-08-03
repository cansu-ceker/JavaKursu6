package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {

       //kullanıcıdan adını ve soyadını ayrı ayrı okutarak
        // alıp birlikte ekrana yazdırın


      Scanner oku=new Scanner(System.in);

        System.out.print("Adınızı giriniz = ");

        String ad=oku.nextLine();

        System.out.print("Soyadınızı giriniz = ");

        String soyad=oku.nextLine();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

        System.out.println("Adınız ve Soyadınız = "+ad+soyad);







 /*

  Scanner okuyucu=new Scanner(System.in);
        System.out.print("Adınızı Girin=");

        String okunanIsim=okuyucu.next();

        Scanner okuyucu2=new Scanner(System.in); ---- burayaı tekrar tanımlamaay gerek yok cunku zaten en baskta String tanımlattın.hem ad hem sıyad String olunca tekrar tanımlamay gerek yok. ama ad ve sayı olsaydı yenıden tanımlama gerekırdı. bu kod o sebeple calısmadı. bu satırı kaldırırsan calısır.
        System.out.println("Soyadınızı Girin=");

        String okunanIsim2=okuyucu2.next();

        System.out.print("Ad Soyad = " + okunanIsim +okunanIsim2);

*/




    }
}

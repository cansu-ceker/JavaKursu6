package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {

        // Baklava dilimi :  if
        // Girilen bir sayı 10 dan büyük ise ekrana 10 büyük yazdır
        //        1-Başla     {
        //        2-sayi oku  sayi=oku.nextInt();
        //        3-sayi > 10 ise "10 dan büyük" yaz   if (sayi>10) sout..
        //        4-Dur }


        // her bir if ten sonra yapılacak iş 1 tane ise if ten sonra { koyma, koysan da sıkıntı yok
        // her bir iften sonra yapılacak iş tek sout ile yapılmıyorsa iş 1 den fazlaysa { koymak zorundasın


        Scanner oku=new Scanner(System.in);
        System.out.println(" Sayı= " );
        int sayi= oku.nextInt();


       if (sayi>10)  //normal parantez koymak zorunlu ve sakın ; koyma
           System.out.println("10dan büyük");

       //burada bak süslü parantez koymadık ama çalıştı, iften sonra 1 iş var o yüzden ister koy ister koyma




        if (sayi<10)
        {
            System.out.println("10dan küçük = ");
            System.out.println(" if kullanıldı= ");

        }   //bu süslü parantezler, iften sonra 1 den fazla iş varsa koyulması zorunlu







    }
}

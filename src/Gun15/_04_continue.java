package Gun15;

import java.util.Scanner;

public class _04_continue {
    public static void main(String[] args) {

        //kullanıcıdan 5 sayı isteyin
        //bu sayılardan 6 ile 10 arasındakiler hariç,
        // diğerlerini toplasın ekrana yazsın

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for (int i=1 ; i<=5 ; i++)
        {
            System.out.println(" sayı giriniz= ");
            int sayi= oku.nextInt();

                                                       // if (sayi<6 || sayi>10)     sayı 6 dan kucuksa VEYA 10 dan buyukse
                                                       //if (!(sayi>6 && sayi<10))         bu if de olur
                                                       //ama sorunun aynısını yazıp pas geç demek daha hemen akla gelir

                if (sayi>6 && sayi<10)  // 7-8-9 toplamaya girmez
                   continue;   //  pas geç : kendinden sonra gelen komutLARI pas geçer
                                // döngünün sonraki adımına geçer

            toplam=toplam+sayi; // yani burayı pas geçirdi continue

            /*   eger 6-7-8 ise sayi
                 pasgec
                 toplamayı  /carpmayı neyse yanı bu contınue nın  altındakı satırlarda  yazılı olan seylerı pas gecer  */

        }

        System.out.println("toplam = " + toplam);

    }



}

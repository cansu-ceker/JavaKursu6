package Gun18_Yoktuk;

import java.util.Scanner;

public class _01_Java2DArryas {  //2 dimension arrays : 2 boyutlu dizi
    public static void main(String[] args) {

        int sayi=0; // hafızada 1 tane sayı saklıyor
        int [] dizi= new int[100];   // 100 tane sayı


        int [] ders1Not =new int[50];  //50 kişilik ders1 in notlarını saklar
        int [] ders2Not =new int[50];  //50 kişilik ders2 in notlarını saklar
        int [] ders3Not =new int[50];  //50 kişilik ders3 in notlarını saklar


        // YUKARIDAKI 3 DIZININ BIRDEN AYNI ANDA TANIMLANMASI :
        int [][] tumDersNotlari= new int[3][50];  // 3 tane 50 lik sayı  tutabiliyor
      //   2boyutlu dizi oludtur=  3 tane ve 50 lık



        ders1Not[0]=80; //tek boyutlu dizinin ilk elemanı
                        // nasıl bu şekidle tanımlama yapıyorsak
                        // 0. elamanı = 80

        tumDersNotlari[0][0]=80;  //  tablodada bu şekilde yapılır bu da tablonun ilk elamanını tanımlanması kodu
                                  // 2 indexle gösterilir
                                  // 0. satırın 0. elamanı = 80

                                                           // önce satır, sonra sütun
        System.out.println("tumDersNotlari[0][0] = " + tumDersNotlari[0][0]);


        Scanner oku=new Scanner(System.in);
        tumDersNotlari[0][0]= oku.nextInt();


        // kaç boyutlu olsun ıstıyorsan o kadar [] yapmalısın.



    }
}

package Gun08;

public class _05_JavaAritmeticOperators {
    public static void main(String[] args) {

        int sayac=0;

        sayac=sayac+1;   //sayacın değerini 1 tane artırıyor :1 oldu
        sayac++;         //sayacın değerini 1 tane artırıyor :2 oldu
        ++sayac;         //sayacın değerini 1 tane artırıyor :3 oldu

        sayac=sayac-1;   //sayacın değerini 1 tane azaltıyor :2 oldu
        sayac--;         //sayacın değerini 1 tane azaltıyor :1 oldu
        --sayac;         //sayacın değerini 1 tane azaltıyor :0 oldu

        System.out.println("sayac = " + sayac);

        /* ********************************************************** */

        int toplam=0, sayi=0;

               //işlemden önce: toplam=0, sayi=0
            toplam=5+sayi;
               // işlemden sonra: toplam=5, sayi=0

        /* ********************************************************** */

         toplam=0; sayi=0;

               //işlemden önce: toplam=0, sayi=0
            toplam=5+sayi++;                     // YANİ bu soldaki komut: toplam=5+sayi;
                                                 //                        sayi++;
                                                 //                        bu iki  komutun bırlestılmıs halı oluyor yanı bunlarla aynı şey demek
              // işlemden sonra: toplam=5, sayi=1

        /* ********************************************************** */

        toplam=0; sayi=0;

                                          // ++sayi oldugu ıcın ıslemden once sayıyı artırdık ve sayi 1 oldu
               //işlemden önce: toplam=0, sayi=1
        toplam=5+ ++sayi;                        // ++sayi  + 5 de olur aynı sey
                                                 // YANİ bu soldaki komut: sayi++;
                                                 //                        toplam=5+sayi;
                                                 //                        bu iki  komut ile aynı şey demek
                                                 //  ++ sayinin solunda olunca yani +sayi şeklinde olunca işlemden once sayıyı artırmalıyız demek
               // işlemden sonra: toplam=6, sayi=1

        /* ********************************************************** */

        // ÖZET :                           ++ lar sağdaysa önce işlem sonra artış                 SOL  SAĞ
        //        ++lar soldaysa önce artış sonra işlem                                            Aİ    İA


        /* ********************************************************** */


       // int toplam=5+sayac;  // önce : sayac=0 toplam=o , sonra : toplam=5, sayac=0

        toplam=0;
        toplam=5+sayac++; // önce : sayac=0 toplam=0 , sonra toplam= 5, sayac=1

        // toplam=5+sayac;    -- önce bunu yapıp
        // sayac++;           -- sonra bunu yapacaktık
        // bu  ikisi yerine
        // toplam=5+sayac++;  --  yaptık





    }
}

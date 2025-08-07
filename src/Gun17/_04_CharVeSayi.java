package Gun17;

public class _04_CharVeSayi {
    public static void main(String[] args) {

        //        A   hava    A  bilgisayar için her şey sayı
//        A->65
//        a->97 dıyor mesela yanı bılgısayar ıcın her sey sayı
//        harflerle rakamları eslestırdıgı bı r tablo bar
//
//        karakter ve karşılık gelen sayıların yer aldığı tablo var.
//        bakıyor A->65 , 65 saklıyor.
//        bakıyor  65->A ,  A yazıyor
//
//        bu tabloya ascii denir.

        int sayi_=65;
        System.out.println("sayi_ = " + sayi_); //65 yazar

        char harf=(char) 65;
        System.out.println("harf = " + harf);  // 65 ın harf karıslıgı olan A yazar



        // ascii tablosunu yazdırmak:
        for (int i = 0 ; i <=255 ; i++)
        {
        harf=(char) i;
            System.out.println(i+".nolu harf = " + harf);
        }


/*
        ç harfinin asci kodunu bulmak ıcın
        int asciiKodu= (int)'ç';
*/




    }
}

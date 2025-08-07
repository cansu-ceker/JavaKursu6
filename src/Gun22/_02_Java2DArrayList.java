package Gun22;

import java.util.ArrayList;
import java.util.Map;

public class _02_Java2DArrayList {
    public static void main(String[] args) {

        int sayi=5;  // tek bir rakam saklayabilen bir değişken

        int [] dizi = new int[20];   // 20 adet sayı saklayabilen bir değişken
                                     // uzunluk sabit, her bir hücresinde bir sayı var

        int [][] tablo= new int[20][10];  // 20 satır 10 sutunu var, 200 sayı saklar
                                          // uzunluk sabit, her bir hücrede   bir dizi var
                                         // her bir satırda 10 sayısı olan bir dizi var

        ArrayList<Integer>liste= new ArrayList<>();  // herbir satır (hücresi)
                                                    // Integer bir sayı saklayabilecek, atıldıkça
                                                    // uzunluk değişken, Integer ın list i

        ArrayList<Integer> matNotlari=new ArrayList<>();    // tek boyut
        ArrayList<Integer> fizNotlari=new ArrayList<>();    // tek boyut
        ArrayList<Integer> kimNotlari=new ArrayList<>();    // tek boyut

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(50);
        fizNotlari.add(60);

        kimNotlari.add(50);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        // tüm bu notları kapsayan bir değişkene nasıl atarım

        // ArrayList lerin ArrayList i
        ArrayList<ArrayList<Integer>> tumNotlar=new ArrayList<>();
        tumNotlar.add(matNotlari);
        tumNotlar.add(fizNotlari);
        tumNotlar.add(kimNotlari);

        tumNotlar.get(0);  // matNotlarınızı verir
        tumNotlar.get(0).get(0);  // matNotlarının ilk  notunu verir yani ilk mat notunu verir

        System.out.println("matNotlari = " + tumNotlar.get(0));  //matNotlarını
        System.out.println("fizNotlari = " + tumNotlar.get(1));  //fizNotlari
        System.out.println("kimNotlari = " + tumNotlar.get(2));  //kimNotlari

        System.out.println("ilk mat notu = " + tumNotlar.get(0).get(0));  // ilk mat notunu yazdırma



        /* ***** satır yazdırma *******/   // yukarıdakı 3lü sout yerıne bu for döndürürüz
        for (int i = 0 ; i <tumNotlar.size() ; i++)
        {
            System.out.println("tumNotlar = " + tumNotlar.get(i));
        }




        /* ***** satır sütun yazdırma *******/   // herbır satırın her bır elemanını yazdsırma for u

        for (int i = 0 ; i <tumNotlar.size() ; i++)
        {
            for (int j = 0 ; j < tumNotlar.get(i).size() ; j++)  // < tum notların satırlarının boyutu/boyu kadar dön
            {
                System.out.println("tek tek tumNotlar = " + tumNotlar.get(i).get(j));
            }

        }





    }
}

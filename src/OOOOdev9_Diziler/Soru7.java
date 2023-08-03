package OOOOdev9_Diziler;

public class Soru7 {
    public static void main(String[] args) {

        //int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.

        int [] dizi= {12,14,21,23,10,4};
        int toplam=0;


        for (int i = 0 ; i <dizi.length ; i++)
        {
            toplam=toplam+dizi[i];

        }

        System.out.println ("toplam = "+toplam);


    }
}

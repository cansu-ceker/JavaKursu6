package OOOOdev9_Diziler;

public class Soru8 {
    public static void main(String[] args) {


        //int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //**Örneğin:**
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //Toplamlarını yazdırın.

        int [] dizi= {5,6,8,12,14,19};
        int toplam=0;


        for (int i = 0 ; i <dizi.length ; i++)
        {
           if (dizi[i]%2==0)
               toplam=toplam+dizi[i];
           else
               toplam=toplam-dizi[i];

        }

        System.out.println ("toplam = "+toplam);













    }
}

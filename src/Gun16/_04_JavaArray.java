package Gun16;

public class _04_JavaArray {
    public static void main(String[] args) {

         int [] dizi=new int[5]; //0,1,2,3,4 indexli 5 elemanlı dizi , int sayi; demek bu kod
         int [] dizi2={3,6,44,88,77};   // 5 elemanlı dizi,hem tanımlandı hem değer atandı,  int sayi=5; demek gibi atama yaptık yani
                                        // değerleri belliyse bu yolu yaparsın

        String[] cumleler=new String[5];  // 5tane cumle saklayabilen bir String dizi değişkeni
        boolean[] dizi3=new boolean[5];   //5 tane (true/false) saklayabilen bir dizi değişkeni
        double [] oranlar=new double [5]; //5 tane double saklayabilen bir dizi değişken,

        for (int i = 0 ; i<dizi.length; i++)
        {
            System.out.println("dizi = " + dizi[i]);
        }



        for (int i = 0 ; i<cumleler.length; i++)
        {
            System.out.println("cumleler = " + cumleler[i]);
        }



        for (int i = 0 ; i<dizi3.length; i++)
        {
            System.out.println("boolean dizisi = " + dizi3[i]);
        }



        for (int i = 0 ; i<oranlar.length; i++)
        {
            System.out.println("oranlar = " + oranlar[i]);
        }




    }
}

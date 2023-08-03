package OOOOdev10_2DArrays;

public class Soru2 {
    public static void main(String[] args) {
        //Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        //2D array'de olan elemanları toplayınız.
        // toplamı yazdırınız.
        //Sonuç 32 olmalıdır.

        int [][] tablo= {{5,2,1} , {10,2,3,6} , {1,2}};
        int toplam=0;


        for (int i = 0 ; i <tablo.length; i++)
        {
            for (int j = 0 ; j <tablo[i].length; j++)

                toplam=toplam+tablo[i][j];

       }

               System.out.print("Toplam= "+toplam);







    }
}

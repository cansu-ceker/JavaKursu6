package OOOOdev10_2DArrays;

import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {
        //Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        //Bütün 2'leri 6'yla değiştirin.
        //Array'i yazdırınız.

        int [][] tablo= {{2,3,2},{4,1,5},{7,2,5}};


        for (int i = 0 ; i <tablo.length; i++)
        {
            for (int j = 0 ; j <tablo[i].length; j++)
            {
                if (tablo[i][j]==2)
                    tablo[i][j]=6;


                System.out.print(tablo[i][j]+" ");

            }

            System.out.println();  // her bir satırı yazdıktan sonra bosluk bırakması ıcın yazdım

        }













    }
}

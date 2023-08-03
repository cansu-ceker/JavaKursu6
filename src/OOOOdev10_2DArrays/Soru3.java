package OOOOdev10_2DArrays;

public class Soru3 {
    public static void main(String[] args) {
        //Aşağıdaki gibi olan bir 2D String Array oluşturunuz.

//       [{"new jersey","atlanta","ohio"} ,
//        {"Pittsburgh" ,"ohio","ohio"} ,
//        {"ohio","new york", "new jersey"}]
//        Bütün ohio'ları Florida'yla değiştiriniz.
//        Array'i yazdırınız.


        String [][] tablo= {{"new jersey","atlanta","ohio"} ,
                            {"Pittsburgh" ,"ohio","ohio"},
                            {"ohio","new york", "new jersey"}} ;


        for (int i = 0 ; i <tablo.length ; i++)
        {
            for (int j = 0 ; j <tablo[i].length ; j++)
            {
                if (tablo[i][j].equals("ohio"))
                    tablo[i][j]="Florida";

                System.out.print(tablo[i][j]+" ");
            }

            System.out.println();
        }








    }
}

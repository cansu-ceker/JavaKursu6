package Gun18_Yoktuk;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[] dizi =new int[10];  //10 tane değer boş halde, default 0 çıkar
        int[] dizi1 ={2,3,45,67,8,8,99,0,44,2};   // 10 tane hem tanımlandı hem değer atandı bu şekilde
        // int dizi1 []  ={2,3,45,67,8,8,99,0,44,2};  bu şekilde [] kullanılabilir sıkıntı yok


                       // 2 satır, 3 sütun
        int [][] tablo=new int[2][3];    // 2 satır 3 sütun, hepsi default boş 0 değerine sahip
        int [][] tablo2={{2,3,44},{45,66,5}};


        int [][] tablo3={
                {2,3,44},   // 1. satır 3 elemanlı
                {45,66,5}   // 2. satı  r 3 elemanllı
        };


         for (int satir=0 ; satir<2 ; satir++) //2 satır var,0 ve 1
         {
             System.out.println(tablo2[satir][0]);  // herbir satırın 0. elemanı
             System.out.println(tablo2[satir][1]);  // herbir satırın 1. elemanı
             System.out.println(tablo2[satir][2]);  // herbir satırın 2. elemanı


         }

         // bu yukarıdakı 3 yazdırma komutu yerıne, aşağıdakini yazıp bitirebilriz

        for (int satir=0 ; satir<2 ; satir++) //satır 1 ve 2 var
        {
            for (int sutun=0 ; sutun<3 ; sutun++) {

                System.out.print(tablo2[satir][sutun] + " ");    //her bır satırın sutunlarını yazdıran for
            }

           System.out.println(); //2,3,4 u yazdıktan sonra alt satıra gecıp 45,66,5 yazsın dıye yazdık bu komutu

        }


    }
}

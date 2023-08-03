package Gun18_Yoktuk;

public class _04_Soru {
    public static void main(String[] args) {

        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz




         // bir boyutluda bir for
        // iki boyutluda iki for diye düşünebilirsin

        int [][] tablo=new int[2][3];


   //tabloyu random 100 e kadar sayılarla doldurma işlemi:
                         //satir<2
        for (int satir=0 ; satir<tablo.length ; satir++) //satır 1 ve 2 var
        {
            for (int sutun=0 ; sutun<tablo[satir].length ; sutun++)    //her bır satırın sutunlarını yazdıran for
                tablo[satir][sutun]=(int)(Math.random()*100);
        }


   // tabloyu yazdırma işlemi:

        for (int satir=0 ; satir<tablo.length ; satir++) //satır 1 ve 2 var
        {
            for (int sutun=0 ; sutun<tablo[satir].length ; sutun++)
                System.out.print(tablo[satir][sutun] + " ");
            System.out.println();  // satırın bıtırınce bır asagı kaysın dıye bunu yazdık
        }


   // teksayı mik bulma işlemi:
        int tekSayiMik=0;

        for (int satir=0 ; satir<tablo.length ; satir++) //satır 1 ve 2 var
        {
            for (int sutun=0 ; sutun<tablo[satir].length ; sutun++)

                if (tablo[satir][sutun]%2==1)
                    tekSayiMik++;
        }

        System.out.println("tekSayiMik = " + tekSayiMik);


        //tek bir for cıftının ıcınde de yapılabılırdı ama hoca anlasılır olsun dıye boyle yaptı


//        int [][] tablo=new int[2][3];
//        int tekSayiMik=0;
//
//        for (int satir=0 ; satir<tablo.length ; satir++)
//        {
//
//            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
//            {
//                tablo[satir][sutun] = (int) (Math.random() * 100);
//                System.out.print(tablo[satir][sutun] + " ");
//
//
//                if (tablo[satir][sutun] % 2 == 1)
//                    tekSayiMik++;
//
//            }
//
//        }









    }


}

package Gun28._05_Ornek;

import java.util.Scanner;

public class ElektrikHesabi {

    int toplamTuketim=0;
    double birimFiyat=20;


    public void TuketimEkle (int tuketim)
    {
      toplamTuketim=toplamTuketim+tuketim;
    }

    public void faturaYaz ()
    {
        double tuketimTL=toplamTuketim*birimFiyat;
        System.out.println("*************************************");
        System.out.println("                            Faturanız");
        System.out.println("*************************************");
        System.out.println("Toplam tüketim="+toplamTuketim);
        System.out.println("Toplam tutar="+tuketimTL);
        System.out.println("*************************************");
    }



}

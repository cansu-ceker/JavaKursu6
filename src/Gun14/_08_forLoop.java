package Gun14;

public class _08_forLoop {
    public static void main(String[] args) {

        //0 dan 100e kadar olan çift sayıların toplamını bulun
        // toplam 50 yi geçtiğinde "50 geçildi" yazsın bunu bır kez yazsın

        int toplam=0;
        boolean sinirAsildi=false;  //anahtar gbı dusun bunu basta kapalı dedık

        for (int i=0 ; i<=100 ; i=i+2 )
        {
            toplam=toplam+i;
            System.out.println("i="+i);
            System.out.println("sınır aşıldı:"+sinirAsildi);
                                                  //  sınır asıldı false ıken 50 yı gectıyse if e gır dıyoz
                                                   // anahtar kapalıyken calıs if te dedik
            if (toplam>50 && sinirAsildi==false )  // true olunca buraya gırmesın dıye anahtar kapalıysa gır dedık
            {
                System.out.println("toplam 50 yi geçti");
                sinirAsildi = true;  // dongunun ıcınde aahtarı actk kı bır daha bu donguye gırmesın cnku bu donguye kapalyken gırıyor yaptık

            }
        }

        System.out.println("toplam = " + toplam);


    }
}

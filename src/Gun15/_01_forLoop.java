package Gun15;

public class _01_forLoop {
    public static void main(String[] args) {

        //0 dan 100e kadar olan çift sayıların toplamını bulun
        // toplam 50 yi geçtiğinde "50 geçildi" yazsın ve bunu ılk asıldıgında yazsın sonra yazmasın


        int toplam=0;
        boolean sinirAsildi=false;

        for (int i=0 ; i<=100 ; i=i+2 )
        {
            toplam=toplam+i;

            if (toplam>50 && sinirAsildi==false )
            {
                System.out.println("toplam 50 yi geçti");
                sinirAsildi = true;
                break; // döngüyü kır , 50 yi gecınce mesajı yazsın ve donguden cıksın dedık bunu yazınca, kırdı, donguden sonrakı adıma gec dedık
            }


        }


        System.out.println("toplam = " + toplam);






    }
}

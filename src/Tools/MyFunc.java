package Tools;

public class MyFunc {
    public static int enBul(int s1,int s2) {
        int buyuk = 0;
        if (s1 > s2)
            buyuk = s1;
        else
            buyuk = s2;
        return buyuk;
    }

    public static int rndTamSayi(int sinir) {
       int rndSayi=(int)Math.random()*(sinir+1);

      return rndSayi;
    }

    public static int faktoryel (int sayi)
    {
        int carpim=1;
        for (int i = 1 ; i <=sayi ; i++)
            carpim=carpim*i; // 1*1   -->  1*2 -->  2*3 --> 6*4 --> 24*5 -->120
        return carpim;
    }

    public static void bekle(int sn){


        try {
            Thread.sleep(1000*sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }





}

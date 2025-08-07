package Gun36._06_Interface;


public class Kare extends Dikdortgen  {

    public int alan (int kenar)
    {
        return super.alan(kenar,kenar);  // super dedıgı yanı inherıtance ettıgım burada Dıkdortgen
    }

    public  int cevre (int kenar)
    {
        return  super.cevre(kenar,kenar);
    }

}



/*
            aynı dıkdortgendekı gıbı yapanbılırım bunu ama
            implements edınce onu kullanmak zorundayım ya o yuzden ıkı kenarı bırden gelıyor
            daha guzelı olsu tek kenarla ısı bıtıreyım dedım
             extends ettım dıkdortgenden , o zaman ne oldu dıkdortgendekı metod ualdım ve ben onu kendıme gore duzenledım tek kenar gırsın dedım
             yukarıdakı yaptıgım sekılde

public class Kare extends Dikdortgen  {

    public int alan (int kenar)
    {
        return super.alan(kenar,kenar);
    }

    public  int cevre (int kenar)
    {
        return  super.cevre(kenar,kenar);
    }

}


public class Kare implements IGeometri  {


     @Override
     public int alan(int kisakenar, int uzunkenar) {
         return kisakenar*uzunkenar;
     }

     @Override
     public int cevre(int kisakenar, int uzunkenar) {
         return 4*kisakenar;
     }
 }




 */
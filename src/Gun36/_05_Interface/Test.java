package Gun36._05_Interface;

public class Test implements IGosterir,IYazdirir{
                                   // implements edılen  IGosterir ve IYazdirir daki ortak olan metodlardan 1 tane aldı
                                   // yanı hem gosterırden yaz() metodunu
                                   //      hem yazdırırdan yaz() metodunu alıp gelmedı
                                   // BIR TANESINI ALDI GELDI cnku ıkısı de aynı.
    @Override
    public void goster() {
        System.out.println("gösterdi");
    }

    @Override
    public void yazdir(String msg) {
        System.out.println(msg+"yazdırıldı");
    }

    @Override
    public void yaz() {
        System.out.println("yazdırıldı");
    }

    @Override
    public int yazdirmaSayisiGoster() {
        int sayfaSayisi=5;  // metod calıstı
        return sayfaSayisi;
    }
}

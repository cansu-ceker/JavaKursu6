package Gun36._01_Interface;

public class HepsiBurada implements IMagaza{     // Interface classlar, o projede neler yapılması lazım yazılan yerlerdır. yapılacaklar lıstesı gıbı dusun
                                                 // class adları IAyse IFatma şeklinde başında I olarak yazılır
                                                 // sen kullanmak ıstedıgın yere implements der o interface ı cekersın.
                                                 // implements : alet edevat gbı dusunebılırsın
                                                 // A class extends B class yapıyorduk ya inheritance , kalıtımda sadece bir tane extends oluyordu ya
                                                 // A class implements Iinterface,Iinterface2... gibi çok kez implements yapabılırsın

                                                 // bir class hem inheritance yani extends, hem de implements alabilir
                                                 // A class extends B class implements Iinterface gibi

                                                 // bir interface dıger ıinterface den inheritance alabilir,yani:
                                                 // Iinterface1 extends Iinterface2 gibi
                                                 // Iinterface1 extends Iinterface2 extends Iinterface3 gibi
    @Override
    public void BilgileriAl() {

    }

    @Override
    public void KrediSkorunuKontrolEt() {

    }

    @Override
    public void KrediSecenekleriniGoster() {

    }

    @Override
    public void BelgeleriImzalat() {

    }

    @Override
    public void KrediyiKullandir() {

    }

    @Override
    public void KrediSkorunuGoster() {

    }

    @Override
    public void oncekiAlisverisleriniKontrolEt() {

    }
}

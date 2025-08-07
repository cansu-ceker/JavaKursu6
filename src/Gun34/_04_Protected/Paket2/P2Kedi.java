package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;
import sun.dc.pr.PRError;

public class P2Kedi extends P1Hayvan {

    // private int a;     gbı bır ozellık olsaydı bu classta yazılı
    // bunun consun da this.a=a; dıyebılırdık


    // super.ad=isim; yı gorduk super yazıyo ne anlıcaz, haa bu mıras alınmıs dicez ,
    // ama bu ornekte bu class ın ıcınde kendıne aıt bır propertıes olmadıgı ıcın ben this diye de yazabılrıım cons u.,
    // thıs deyınce bu sayfa demek oldugu ıcın, bu sayfada da baska bı sey yok oldugundan, kulllanılırım thıs ı

// miras aldıgım ıcın bu class aldı mırası, buradakı her seye  thıs seklınde asagıdakı gbı de yazabılırım
    public P2Kedi(String isim, String turu) {
        this.ad=isim;  // buradakı ad= isim -> buradakı dedıgı bu class, e bu class zaten miras aldı superden yanı P1Hayvandan dolayısyla thıs de super de olur
        this.cinsi=turu;  // protected
                         // defaulttan farklı olarak extend edildiğinde diğer paketlerden de erişilebilir

        // P2Mainde erişememiştik ama burada P2Kedi de eriştik cnku P2Kedi P1Hayvandan miras aldı
        // erişebildik/ulaşabiliyoruz çünkü
        // burası extend ile P1Hayvandan buraya geldıgı ıcın
        // VE
        // biz P1Hayvanda cinsi protected olarak tanımladıgımız ıcın
    }


    /* superden yanı P1Hayvandan aldık dıye belırtmek bu sekılde de yazılabılır, farketmez
    public P2Kedi(String isim, String turu) {
        super.ad=isim;   // super ad deyınce P1Hayvandakı yanı superdekı ad demek
        super.cinsi=turu;  // protected

    }
     */
}

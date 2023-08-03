package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {


// miras aldıgım ıcın bu class aldı mırası, buradakı her seye  thıs seklınde asagıdakı gbı de yazabılırım
    public P2Kedi(String ad, String cinsi) {
        this.ad=ad;  // buradakı ad,= ad, buradakı dedıgı bu class, e bu class zaten miras aldı superden yanı P1Hayvandan dolayısyla thıs de super de olur
        this.cinsi=cinsi;  // protected
                           // defaulttan farklı olarak extend edildiğinde diğer paketlerden de erişilebilir

        // P2Mainde erişememiştik ama burada P2Kedi de miras aldık P1Hayvandan buraya, ondan ulaşabiliyoruz
    }


    /* superden yanı P1Hayvandan aldık dıye belırtmek bu sekılde de yazılabılır, farketmez
    public P2Kedi(String ad, String cinsi) {
        super.ad=ad;   // super ad deyınce P1Hayvandakı yanı superdekı adı=ad demek
        super.cinsi=cinsi;  // protected

    }
     */
}

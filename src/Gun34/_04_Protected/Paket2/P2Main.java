package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {

        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="karakedi2";  //public diye ulaştık
        // yas   ulasamadık, cnku yas default olarak tanımlandı P1Hayvan da,
        // default olarak tanımlanan verıye,sadece aynı paketten ulaşılabilir
        // yasın oldugu P1Hayvan ıle bu P2Main aynı pakette degıl dıye ulasamadık







    }
}

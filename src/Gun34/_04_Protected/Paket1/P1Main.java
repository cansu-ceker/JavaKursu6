package Gun34._04_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {

        P1Hayvan p1h= new P1Hayvan();
        p1h.ad="karakedi";  // public diye ulaştık
        p1h.yas=2;          //default dıye ulastık
        p1h.cinsi="tekir";   // protected

       // p1h.renk  private diye ulaşamadık
    }
}

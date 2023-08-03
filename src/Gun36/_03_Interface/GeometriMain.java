package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {

        Cember c=new Cember();
        c.ciz();   // çember çizildi

        Dikdortgen d=new Dikdortgen();
        d.ciz();     //dikdörtgen çizildi



        // Interface lerden nesne üretilemez fakat referans tipi oluşturulabilir
        // bu bize polymorphism sağladı
        ICizdirir c2=new Cember();
        c2.ciz();   // çember çizdi
        // direkt olarak sadece Interfacedeki ismi verilmiş olanlar metodlara erişebilirsin

        cizzdir(c);   //çember çizildi
        cizzdir(d);   //dikdörtgen çizildi

    }

    public static void cizzdir(ICizdirir g)
    {
        g.ciz();
    }


}

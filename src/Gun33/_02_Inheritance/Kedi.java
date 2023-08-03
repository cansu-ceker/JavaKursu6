package Gun33._02_Inheritance;

public class Kedi extends Hayvan {

    public Kedi(String renk, String cins, int kilo) {
        super(renk, cins, kilo);
        // super : miras alınan sınıf
    }


    // kedıdeyken konustu mıyavladı
    // kopekteyken konustu havladı yapcam yanı mırası alcam ozellestırcem


    // asagıdakını yazmak ıcın sag tık, generate, override methos ve sec . burada konustu metodunu sectık tekrar yazdıurdık

    @Override
    public void konustu() {
        super.konustu();   // ses cıkardı yazdırmak ıcın bunu yazdık
        System.out.println("miyavladı");   // ortaga yanı ses cıkardıya ek olarak mıyavladı yazdırmak ıstedık dıye bunu yazdık
    }
}

package Gun33._02_Inheritance;

public class Kopek extends Hayvan{
    // extand Hayvan yazdzıktan sonra kırmızılı oluyoır altı, oku kırmızıya getır, Create constructor matching super a tıkla asagıdakını kendı yazdı ij
    //neden bu alttakını yaptık, cunku Hayvan class ın ıcınde constructor var, const u olan bır mırası alırken bunu yaomak zorundasın
    public Kopek(String renk, String cins, int kilo) {
        super(renk, cins, kilo);
    }

    @Override
    public void konustu() {
        System.out.println("havladı");
    }

    // yukarıdakı gbı ozellestırmıs olduk  sadece mıyavladı yazdı
    // eger boyle ozellestırmıs ve override yapmamsı olsaydık extand Hayvan yaptogomz ıcın oradan alacaktı buraya hıcbır sey yazmadan, ses cıkardı yazacaktı ekrana


}

package Gun35.BEN;

public class Ogrenci extends Kisiler {

    private String subesi;

    public Ogrenci(String ad, String soyAd, String gorevi, String subesi) {
        super(ad, soyAd, gorevi);
        setSubesi(subesi);}

    public String getSubesi() {return subesi;}
    public void setSubesi(String subesi) {this.subesi = subesi;}

    @Override
    public String toString() { return super.toString()+ "\nsubesi="+this.subesi;}
}

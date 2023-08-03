package Gun35._03_polymorphism_soru;

public class Ogrenci extends Kisiler{

private String subesi;

    public Ogrenci(String ad, String soyad, String gorevi,String subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return super.toString()+"şubesi="+this.subesi;
    }
}

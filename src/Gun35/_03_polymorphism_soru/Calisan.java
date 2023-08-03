package Gun35._03_polymorphism_soru;

public class Calisan extends Kisiler{

    private String departmani;

    public Calisan(String ad, String soyad, String gorevi,String departmani) {
        super(ad, soyad, gorevi);
        setDepartmani(departmani);
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    @Override
    public String toString() {
        return super.toString()+"departmanı="+this.departmani;
    }
}

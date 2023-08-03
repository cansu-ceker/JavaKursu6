package Gun34._03_Soru;

public class Ogrenci {
    private int id;
    private String isim;
    private Tipi tip;   // ılk orta yada lıaw gbı degısken tıp olunca enum yaptık ayrıtıp dıye enumclass actık



    public Ogrenci(String isim, Tipi tip,int id) {
        setIsim(isim);
        setTip(tip);
        setId(id);  //burayı degıstırdık ve privatesını yukarıda kaldırdık
    }

    @Override
    public String toString() {
        return "Ogrenci" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tip=" + tip;
    }

    public int getId() {
        return id;
    }

    final void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Tipi getTip() {
        return tip;
    }

    public void setTip(Tipi tip) {
        this.tip = tip;
    }
}

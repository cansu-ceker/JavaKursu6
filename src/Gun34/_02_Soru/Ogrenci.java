package Gun34._02_Soru;

public class Ogrenci {
    private int id;
    private String isim;
    private Tipi tip;   // ılk orta yada lıse gbı degısken tıp olunca enum yaptık ayrıtıp dıye enumclass actık
    private static int sayacID=1;


    public Ogrenci(String isim, Tipi tip) { // sağ tikten cons yaparken id yi dahıl etmedık id yi secmedık cnku id sistemden gelecek. mainde ogrencıyı tanımlarken () içine id girmeyecek biz ona sistemden id atayacagız, bırısı dırekt id tanımlamasın ogrencıye dıye () ıcıne almadık o paranetereyı
        setIsim(isim);
        setTip(tip);
        this.id=sayacID++;  // setId(sayacID++); de olurdu
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

    final void setId(int id) {this.id = id;}

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

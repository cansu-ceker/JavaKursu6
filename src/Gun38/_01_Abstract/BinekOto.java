package Gun38._01_Abstract;

public abstract class BinekOto {   //parent class,
                                   //1- public abstract class BinekOto yaotık yanı abstract ekledık
    private String marka;
    private  int uretimYili;
    private int vitesAdedi;


    abstract  int hizlanmaSuresi();   // 2-buraya Interface classtakı int hizlanma(); yı koyup bır de basına abstract yazınca
                                      // 1 ve 2 yı yapınca IBinekOto ya gerek kalmadı
                                      // ve dolayısıyla Ford class ta implements yapmaya gerek kalmadı

    public BinekOto(String marka, int uretimYili, int vitesAdedi) {
        setMarka(marka);
        setUretimYili(uretimYili);
        setVitesAdedi(vitesAdedi);

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}

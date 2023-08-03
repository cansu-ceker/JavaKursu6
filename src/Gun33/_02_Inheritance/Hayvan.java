package Gun33._02_Inheritance;

public class Hayvan {  //super, parent, base olan yer burası

    // hepsının ortak ozellıklerını bır class a yazayım sonraonları cagırayım dedık, ortaklar mırasmıs gbı cagıralım,
    //buraya yazdıklarımız oortak şeyler
    //ses cıkarma da ortak
    //


   private String renk;
   private String cins;
   private int kilo;

    public Hayvan(String renk, String cins, int kilo) {     // constr yaptık
        this.renk = renk;
        this.cins = cins;
        this.kilo = kilo;
    }



    public  void konustu()
   {
       System.out.println("ses çıkardı");
   }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }


    @Override
    public String toString() {
        return "Hayvan{" +
                "renk='" + renk + '\'' +
                ", cins='" + cins + '\'' +
                ", kilo=" + kilo +
                '}';
    }
}

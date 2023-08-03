package Gun33._02_Inheritance;

public class Ordek extends Hayvan{

    private int kanatAcikligi;
                                                  // biz ekledık kanat acıklıgını
    public Ordek(String renk, String cins, int kilo,int kanatAcikligi) {
        super(renk, cins, kilo);
        setKanatAcikligi(kanatAcikligi); // bunu da ben ekledım ve bu hep super(renk, cins, kilo); nun altına yazılmalı
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("vakvakladı");       // bunu soruda ıstemıyor ama ekledık, overrıde yaptık ozellestırmıs olduk vakvakı ekledık ozellestırmıs olduk
    }

    @Override
    public String toString() {
        return super.toString()+"kanat acıklıgı="+this.kanatAcikligi;   // bu kanatacıklıgını kullan bak ozellestırdık bız dedık
    }

    public int getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }
}

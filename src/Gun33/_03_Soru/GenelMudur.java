package Gun33._03_Soru;

public class GenelMudur extends Calisan {   // genel mudur calısanın her seyıne sahıp olmalı o yuzden extend yapıp her seyını aldık
    // şartlı miras oldugu ıcın altı cızgılı cıkıyor, oku oraya getırınce create matchıng super dıyor ona tıkla

    private  double tazminat;

    public GenelMudur(String isim, double maas, double maasKatSayisi,double tazminat) {
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);   // bundan once gettersetter yap kı set yazınca dırekt tazmınatı getırsın ij
                                // this.tazminat=tazminat; yapılırdı ama burada tazmınata - deger gırılerbılır o sebeple ben bunları set yapıyorum
    }




    // aşagıdakı getset yapmamız lazım cunku prıvate var, bunu yapmazsak ulasılamaz verıye
    @Override
    public double maasHesapla() {
        return super.maasHesapla()+this.tazminat;
    }

    @Override
    public String toString() {
        return super.toString();
    }











    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        //eger kademesı bu ıse tamznıatın yarısını alır vs dıcez ılerıde
        this.tazminat = tazminat;
    }
}

package Gun32._02_Soru;

public class Main {
    public static void main(String[] args) {


        Araba arb1=new Araba();
        arb1.setRenk("kırmızı");
        arb1.setModel(2025);
        arb1.setKapiSayisi(8);
        arb1.setMotorHacmi(1255);

        System.out.println("arb1 = " + arb1);

        Araba arb2=new Araba("siyah", 2045, 5000, 23);
        System.out.println("arb2 = " + arb2);

    }




}

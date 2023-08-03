package Gun28._04_Ornek;

public class Main {
    public static void main(String[] args) {


        Banka banka1=new Banka();
        banka1.bankaAdi="Bank of America";
        banka1.subeSayisi=5600;
        banka1.kurulusYili=1938;

        Banka banka2= new Banka("Bank of America",5600,1938);
        Banka banka3= new Banka("Bank of America",1938);


        System.out.println("banka1 = " + banka1);
        System.out.println("banka2 = " + banka2);
        System.out.println("banka3 = " + banka3);










    }
}

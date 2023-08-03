package Gun29._03_Protected.Paket1;

public class SaglikBakanligi {
    public static void main(String[] args) {

        Doctor dok1=new Doctor();
        dok1.hastaneAd="Cerrahpaşa";
        dok1.adi="Cansu";
        dok1.bolumu="Göz";

       // dok1.sicilNo private , değiştirilemez izin verilmedi private yapılarak erişimine izin verilmedi

        Doctor dok2=new Doctor("Mehmet");







    }
}

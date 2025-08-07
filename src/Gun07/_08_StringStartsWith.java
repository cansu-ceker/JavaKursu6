package Gun07;

public class _08_StringStartsWith {
    public static void main(String[] args) {

        // StartsWith  : verilen karakter(ler) ile baslıyor mu
        //sonuç true veya false yani boolean döner

        String text="HCL Teknoloji";

        boolean basliyorMu=text.startsWith("HC");
        System.out.println("basliyorMu = " + basliyorMu);

        System.out.println(" HC ile başlıyor mu= " +text.startsWith("HC") ); //true
        System.out.println(" te ile başlıyor mu= " +text.startsWith("te") ); //false
        System.out.println(" h ile başlıyor mu= " +text.startsWith("h") );   //false
        System.out.println(" T ile başlıyor mu= " +text.startsWith("T") );   //false
        System.out.println(" Te ile başlıyor mu= " +text.startsWith("Te") ); //false
        System.out.println(" H ile başlıyor mu= " +text.startsWith("H") );   //false




    }
}

package Gun07;

public class _09_StringEndsWith {
    public static void main(String[] args) {

        // EndsWith : verilen karakter(ler) ile bitiyor mu
        // sonuç true veya false yani boolean döner


        String text=" Merhaba DÜnya";

        boolean bitiyorMu=text.endsWith("z");
        System.out.println("z ile bitiyor mu = " + bitiyorMu); //false


        System.out.println(" ya ile bitiyor mu= " +text.endsWith("ya") ); //true
        System.out.println(" nya ile bitiyor mu= " +text.endsWith("nya") ); //true
        System.out.println(" a ile bitiyor mu= " +text.endsWith("a") ); //true
        System.out.println("n ile bitiyor mu = " + text.endsWith("n")); //false
        System.out.println("A ile bitiyor mu = " + text.endsWith("A")); //false
        System.out.println("ba ile bitiyor mu = " + text.endsWith("ba")); //false
        System.out.println("Dünya ile bitiyor mu = " + text.endsWith("Dünya")); //false






    }
}

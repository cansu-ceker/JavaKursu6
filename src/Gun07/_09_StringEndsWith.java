package Gun07;

public class _09_StringEndsWith {
    public static void main(String[] args) {

        // EndsWith : verilen karakter(ler) ile bitiyor mu
        // sonuç true veya false yani boolean döner


        String text=" Merhaba DÜnya";

        boolean bitiyorMu=text.endsWith("z");
        System.out.print("z ile bitiyor mu = " + bitiyorMu);


        System.out.print(" ya ile bitiyor mu= " +text.endsWith("ya") );
        System.out.print("n ile bitiyor mu = " + text.endsWith("n"));
        System.out.print("A ile bitiyor mu = " + text.endsWith("A"));
        System.out.print("Dünya ile bitiyor mu = " + text.endsWith("Dünya"));






    }
}

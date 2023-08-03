package Gun07;

public class _03_StringEquals {
    public static void main(String[] args) {

        // equals : 2 String in birbirine eşit olup olmadığını kontrol eder
        // sonuç booelan


        String s1= "Merhaba";
        String s2= "MERHABA";

        boolean esitMi = s1.equals(s2);
        System.out.println("esitMi1 = " + esitMi); // false, yani büyük küçük farkeder

        // ya da direkt yazarım

        System.out.println("esitMi2 = " + s1.equals(s2)); // false
        System.out.println("esitMi3 = " + s1.equals("Merhaba")); // true













    }
}

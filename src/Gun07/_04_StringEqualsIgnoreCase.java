package Gun07;

public class _04_StringEqualsIgnoreCase {
    public static void main(String[] args) {

        // EqualsIgnoreCase  :
        // equals gibi çalışır sadece büyük küçük harf ayrımı yapmadan çalışır

        String s1= "Merhaba";
        String s2= "MERHABA";

        System.out.println("esitMi1 = " + s1.equals(s2));  // false , küçük büyük ayrımı yapar ona dikkat eder

        System.out.println("esitMi2 = " + s1.equalsIgnoreCase(s2));  // true çıkar, küçük büyük ayrımı YAPMAZ ona dikkat etmez IGNORE








    }
}

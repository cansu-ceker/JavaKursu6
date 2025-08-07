package Gun24;

import java.util.HashMap;
import java.util.HashSet;

public class _01_JavaMap {
    public static void main(String[] args) {

        // Set -> HashSet   LinkedHashSet   TreeSet
        // Map -> HashMap   LinkedHashMap   TreeMap
        // Map -> Anahtar + Set -> Anahtarlı Set  (TEKRAR eden anahtarlar YOK,değerler tekrar edebilir ama key ler yani anahytarlar tekrar edemez 2 kişinin TCsi yani anahtarı aynı olamaz)
       //      -> ındex yok map te

        // anahtarın tipi Integer, değerin tipi String. Integer-Arraylist, set ne ıstersen atayabılrısın ya da ne bıleyım String-String vs de olur sen nasıl istersen

       // HashSet<Integer>hs=new HashSet<>(); sette boyleydı mesela

        HashMap<Integer,String>hm =new HashMap<>();

        //       A ,  D
        hm.put(1001,"Ismet Temur");
        hm.put(1002, "Yusuf Yılmaz");
        hm.put(2001, "Buğra Yıldız");
        hm.put(5001, "Elife Sözen");
        hm.put(1002, "Seda Parça");   // 2 kez  1002 yazmadı 1 kez 1002 yazdı, once eklenen 1002 yı sonra eklenen 1002 olarak degıstırıp sonrdakını ekledı yanı en sonki değerini aldı yani 1002=Seda Parça oldu ve kafasına göre sıralayıp yazdı

        System.out.println("hm = " + hm);


        System.out.println("hm.get(2001) = " + hm.get(2001));  // 2001 değerindeki bilgileri get ir bana
        System.out.println("hm.get(5001) = " + hm.get(5001));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));  // keylerde 2001 var mı TRUE
        System.out.println("hm.containsKey(5002) = " + hm.containsKey(5002));  // keylerde 5002 var mı FALSE

        System.out.println("hm.keySet() = " + hm.keySet()); // keyleri toplu verir
        System.out.println("hm.values() = " + hm.values()); // değerleri toplu verir

        hm.remove(5001); // 5001 i sildirdik
        System.out.println("hmSilindi5001 = " + hm);




    }
}

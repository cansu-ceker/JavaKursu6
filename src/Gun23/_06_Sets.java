package Gun23;

import java.util.HashSet;

public class _06_Sets {
    public static void main(String[] args) {

        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);


        // birleştirme
        HashSet<Integer>birlesikHali=new HashSet<>();  // tekrarlı olanları yazmaz, kendıne göre sıralar da verır
        birlesikHali.addAll(setA);
        birlesikHali.addAll(setB);
        System.out.println("birlesikHali = " + birlesikHali);

        // farkı
        HashSet<Integer>fark=new HashSet<>();
        fark.addAll(setA);  // boş olan fark setine setA yı ekledik
        fark.removeAll(setB);  // içinde setA olan setten yani fark setinden, setB yi çıkardık
        System.out.println("fark = " + fark);

        //kesişim, ortak elemanlar
        HashSet<Integer>ortakElemanlar=new HashSet<>();
        ortakElemanlar.addAll(setA);
        ortakElemanlar.retainAll(setB);
        System.out.println("ortakElemanlar = " + ortakElemanlar);
















    }
}

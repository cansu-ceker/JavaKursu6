package Gun23;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(67);
        hs.add(34);
        hs.add(3);
        hs.add(4);
        hs.add(1); // tekrarlıyı eklemez

        System.out.println("hs = " + hs);              // kafasına göre bir sırayla yazar
        System.out.println("hs.size() = " + hs.size());   // 6 eleman var uzunlugu bu

        hs.remove(5);   // değere göre siler yani 5 i siler cnku setlerde ındex yok

        System.out.println("5 i silerek yazar = " + hs);

        if (hs.contains(67))
            System.out.println("var");
        else
            System.out.println("yok");


        hs.clear();
        System.out.println("hepsini sildi = " + hs);



    }
}

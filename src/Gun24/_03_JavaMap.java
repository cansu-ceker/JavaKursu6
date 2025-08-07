package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_JavaMap {
    public static void main(String[] args) {

        // keyler Integer, value ler String


        Map <Integer,String> hm=new HashMap<>();    //AYNI ŞEY     HashMap<Integer,String>hm=new HashMap<>();
                                                   // soldaki,  Map lerden HashMap demek kısaca
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm);  // bu sekılde fotografını cıkarıyor onumuze
                                           // hızlı çalışmak için, kendisine göre sıralıyor




        Map<Integer,String>lhm=new LinkedHashMap<>();  // AYNI ŞEY   LinkedHashMap<Integer,String> lhm= new LinkedHashMap<>();
                                                      //soldaki, Map lerden LinkedHashMap
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm);       // eklenme sırasına göre sıralı



        Map<Integer,String>tm=new TreeMap<>();    //  AYNI ŞEY  TreeMap<Integer,String> tm=new TreeMap<>();
                                                 // soldaki, Map lerden TreeMap
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"köpek");
        tm.put(11,"kuş");
        tm.put(4,"kurt");
        System.out.println("tm = " + tm);  // herzaman sıralı, kendinden sortlu yani 2-4-9-11-30
























    }
}

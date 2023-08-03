package Gun06;

public class _07_StringLastIndexOf {
    public static void main(String[] args) {

        //   indexOf     : baştan itibaren arayıp oda numarasını döndürür
        //   lastIndexOf : sonran itibaren aramaya başlar



        String cumle="Merhaba Dünya";

        System.out.println("indexof = " + cumle.indexOf("a"));  // 4
        System.out.println("lastIndexOf = " + cumle.lastIndexOf("a")); //12
        //index her zaman tektir bir tanedir, arama yönüne göre değişmez

       /* BU ALTTAKİ ÇOK GEREKSİZ BİLMESEN DE OLUR

        System.out.println("lastIndexOf = " + cumle.lastIndexOf("a",8)); //6

        bastan saymaya baslıyor 8. karaktere gelınce gerıye dogru sayıyor ilk a nerdeyse cevap o demek

*/














    }
}

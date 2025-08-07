package Gun04;

public class _08_Ornek4 {
    public static void main(String[] args) {

         //int to String, rakamların yazıya çevrilmesi

        // ÖNEMLİİİİİİİİİİİİİİİİİİİİİİİİİİİİİİİİİİİİ


        String ad= "Cansu Çeker";
        int sinifNo=6;
        char subesi='E';
        boolean gectiMi=true;

                       //(String+int+char+boolean)
        System.out.println(ad+sinifNo+subesi+gectiMi);     // Cansu Çeker6Etrue  yazdı ekrana
        // + nın herhangi bir tarafında String varsa,
        // diğer değişken otomatik String e dönüşür

        System.out.println("merhaba"+1+2);  // merhaba12
        System.out.println(1+2+"merhaba");  //3merhaba
        //birleştirme işlemi soldan sağa dopru gider
        //1. örnekte String görünce hepsini String sanıp yazıyor ekrana
        //2. örnekte önce sayı gördüğü için topluyor

        System.out.println("merhaba"+(1+2)); //merhaba3
        //parantez öncelikli, içini yapıyor

    }
}

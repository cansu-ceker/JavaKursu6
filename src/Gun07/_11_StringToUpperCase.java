package Gun07;

public class _11_StringToUpperCase {
    public static void main(String[] args) {
        // toUpperCase : String büyük harfe çevirir

       String text="Merhaba Dünya";
        System.out.print("Orijinali = " + text);
        System.out.print("hepsi büyük yazsın = " + text.toUpperCase());

        boolean bununlaBasliyorMu=text.toUpperCase().startsWith("M");   //text in hepsini büyüğe çevirdi sonra bu M ile mi başlıyo dedi
        System.out.println("M ve m ile başlıyor mu = " + bununlaBasliyorMu);  //  M ile mi başlıyo dese de, m ile mi başlıyo dese de cevap true, cunku zaten cumleyı buyuge cevırip o cumlede aramıstı cevap hep TRUE

        // String text="Merhaba Dünya";
        // boolean ile ---- text i MERHABA DÜNYA yaptık sonra bu M ile mi başlıyo dedik



        // yazdırdık true
        //String text="merhaba Dünya"; olsaydı ve yine
        // boolean ile ---- text i MERHABA DÜNYA yaptırsak sonra bu M ile mi başlıyo desek
        // yazdırsak yine true




    }
}

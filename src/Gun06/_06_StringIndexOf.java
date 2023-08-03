package Gun06;

public class _06_StringIndexOf {
    public static void main(String[] args) {

        //verilen karakterin(lerin) indexini verir
        // 01234    : harflerin oda numarası

        //h nin oda numarası kaç : 3 yani
        // a nın oda numarası kaç: hangi a belirtilmediyse ilk a yı cevap verir, yani 4
        //ab nin indexi kaç : 4 yani  ab nin başlama yeri 4 yani
        //dü nün indexi kaç : 8 yani  ab nin başlama yeri 8 yani


        String cumle="Merhaba Dünya";

        int sira=cumle.indexOf("M");
        System.out.println("M nin indexiiiiiii = " + sira);

        // ya da direkt


        System.out.println("M nin indexi = " + cumle.indexOf("M"));  //0
        System.out.println("h nin indexi = " + cumle.indexOf("h"));  //3
        System.out.println("a nın indexi = " + cumle.indexOf("a"));  //4
        System.out.println("Dü nün indexi = " + cumle.indexOf("Dü"));    //8
        System.out.println("Boşluk karakterin indexi = " + cumle.indexOf(" "));  //7
        System.out.println("A nın indexi = " + cumle.indexOf("A"));  //-1   yok manasında -1 gönderir sistem


        System.out.println("5 nolu indexten sonra a hangi odada = " + cumle.indexOf("a",5));  //6
        System.out.println("7 nolu indexten sonra a hangi odada = " + cumle.indexOf("a",7));  //12
                          //7 nolu indexten sonra a yı ara








    }
}

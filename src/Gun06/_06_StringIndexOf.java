package Gun06;

public class _06_StringIndexOf {
    public static void main(String[] args) {

        //String.indexOf("") ---> verilen karakterin(lerin) indexini verir
        // bugün
        // 01234    : harflerin oda numarasıydı


        String cumle="Merhaba Dünya";
        //h nin oda numarası kaç : 3
        // a nın oda numarası kaç: hangi a belirtilmediyse ilk a yı cevap verir, yani 4
        //ab nin indexi kaç : 4 yani  ab nin başlama yeri 4 yani
        //dü nün indexi kaç : 8 yani  dü nin başlama yeri 8 yani




        int sira=cumle.indexOf("M");
        System.out.println("M nin indexiiiiiii = " + sira);

        // ya da direkt

        System.out.println("M nin indexi = " + cumle.indexOf("M"));  //0  // "m" şeklinde kucuk yazsaydık sonuc yok manasında -1 ckıyo yanı dolayısyla kucuk ya da buyuk olarak aradıgını belırtmek lazım, kucuk harf buyuk harf duyarlılıgı var ındexof un
        System.out.println("h nin indexi = " + cumle.indexOf("h"));  //3
        System.out.println("a nın indexi = " + cumle.indexOf("a"));  //4
        System.out.println("Dü nün indexi = "+ cumle.indexOf("Dü"));    //8
        System.out.println("Boşluk karakterin indexi = " + cumle.indexOf(" "));  //7
        System.out.println("A nın indexi = " + cumle.indexOf("A"));  //-1   yok manasında -1 gönderir sistem


        System.out.println("5 nolu indexten sonra a hangi odada = " + cumle.indexOf("a",5));  //6
                                                                                  // a yı, 5 ten sonra arayarak bul demek

        System.out.println("7 nolu indexten sonra a hangi odada = " + cumle.indexOf("a",7));  //12
                          //7 nolu indexten sonra a yı ara


    }
}

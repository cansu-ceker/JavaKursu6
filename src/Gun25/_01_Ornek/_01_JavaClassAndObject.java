package Gun25._01_Ornek;

//class-tiplerinin tanımlandığı yer yani ya ana class ın üstü y da ana class ın altı

public class _01_JavaClassAndObject {
    //metodların yazılabildiği yer yanı ya mainin üstü ya da mainin altı

    public static void main(String[] args) { // başla
        //ana programın çalıştığı yer



        Ogrenci ogr1=new Ogrenci();
        ogr1.OkulNo=1001;
        ogr1.adi="Ahmet";
        ogr1.soyadi="Yılmaz";
        ogr1.Adresi="çekmeköy / istanbul";
        ogr1.sinifi=6;

        System.out.println("ogr1 = " + ogr1.adi);
        System.out.println("ogr1.soyadi = " + ogr1.soyadi);



    } //dur

    //metodların yazılabildiği yer yanı ya mainin üstü ya da mainin altı
}


//class-tiplerinin tanımlandığı yer yani ya ana class ın üstü y da ana class ın altı

class Ogrenci{   //burada Class  yazılması Ogrencinin tip olduğunu gösterir
    int OkulNo;
    String adi;
    String soyadi;
    String Adresi;
    int sinifi;
    String telefonu="055568123665";  // sabit oldugu zaman veri sayısal olsa da toplama cıkartma vs yapılamayacagı zamnalarda String tanımlanır







        }
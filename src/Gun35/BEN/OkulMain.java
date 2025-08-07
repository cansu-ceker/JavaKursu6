package Gun35.BEN;

public class OkulMain {
    public static void main(String[] args) {

        Kisiler ogr= new Ogrenci("faruk","ceker","ogretmen","A");
        Kisiler cal= new Calisan("cansu","korkmaz","sdet","it");

        Kisiler.kimlikBelgesiYazdir(ogr);
        Kisiler.kimlikBelgesiYazdir(cal);

/*
        Ogrenci ogr= new Ogrenci("faruk","ceker","ogretmen","A");
        Calisan cal= new Calisan("cansu","korkmaz","sdet","it");

        Kisiler.kimlikBelgesiYazdir(ogr);
        Kisiler.kimlikBelgesiYazdir(cal);


     */





    }
}

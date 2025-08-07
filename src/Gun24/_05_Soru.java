package Gun24;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {

        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secenekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

//--- TreeMap,while,if


        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

          // kelime, anlamı
        Map<String, String> sozluk = new TreeMap<>();

        int secim=0;

        do {
            System.out.print(" MENÜ: \n Ekleme yapmak için 1 e basın\n Düzeltme yapmak için 2 ye basın\n Listeleme yapmak için 3 e basın\n " +
                    "Arama yapmak için 4 e basın\n Silme yapmak için 5 e basın\n Çıkış yapmak için 6 ya basın");
           secim= okuInt.nextInt();

    switch (secim){
    case 1:
        System.out.print("Kelime girin=");
        String kelime = okuStr.nextLine();
        System.out.println("Kelimenin anlamını yazın=");
        String anlam = okuStr.nextLine();
        sozluk.put(kelime, anlam);

        break;
    case 2:
        System.out.println("Düzeltmek istediğiniz kelime nedir=");
        kelime = okuStr.nextLine();
        System.out.println("Kelimenin anlamını yazın=");
        anlam = okuStr.nextLine();
        sozluk.put(kelime, anlam);

        break;

    case 3:
        System.out.println("***Sözlükteki kelimeler***");
        for ( Map.Entry<String,String> k : sozluk.entrySet())
            System.out.println(k.getKey()+" "+k.getValue());
        break;

    case 4:
        System.out.println("Aranan kelime nedir=");
        kelime=okuStr.nextLine();
        System.out.println(sozluk.get(kelime));
        break;

    case 5:
        System.out.println("Silinecek kelimeyi girin=");
        kelime=okuStr.nextLine();
        System.out.println(sozluk.get(kelime));
        sozluk.remove(kelime);
        break;

    case 6:
        System.out.println("Çıkış.");
        break;

    default:
            System.out.println("Hatlı giriş.");

}

        } while (secim<6);


    }
}





















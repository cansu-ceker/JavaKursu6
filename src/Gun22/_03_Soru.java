package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {

        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
        ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(50);
        fizNotlari.add(60);

        kimNotlari.add(50);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);


        ArrayList<ArrayList<Integer>> notlarListesi=new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

// Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 50 70 80
        // Fizik : 30 40
        // Kimya : 60 70 80 90

        ArrayList<String >dersAdlari= new ArrayList<>();
        dersAdlari.add("Matematik");
        dersAdlari.add("Fizik");
        dersAdlari.add("Kimya");

        System.out.println(dersAdlari.get(0)+ ":"+notlarListesi.get(0));;
        System.out.println(dersAdlari.get(1)+ ":"+notlarListesi.get(0));;
        System.out.println(dersAdlari.get(2)+ ":"+notlarListesi.get(0));;

        for (int i = 0 ; i <dersAdlari.size() ; i++)
        {
            System.out.print(dersAdlari.get(i)+" : ");
            for (int j = 0; j < notlarListesi.get(i).size(); j++)
            {
                System.out.print(notlarListesi.get(i).get(j)+"\t");
            }

            System.out.println();  // her derste sonra alt satıra gecsın dıye bunu koyduk
        }


// Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istediği derse ait notları bir metodda yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.println("Ders no giriniz \n 0-Mat, 1-Fiz, 2-Kim ");
        int dersNo = oku.nextInt();


         dersNotlariniYazdir (dersNo,notlarListesi);


         //TODO
        // Soru 3 :
        // Yukarıda verilen derse ait not ortalamasını ve geçen sayısını bir metodda yazdırınız.

    }

                                         //int        ArrayList... yazdık cunku onun tipini belirtmemiz lazım, nasıl dersno ya int dedik notlistesı de tablonun tablosu
    public static void dersNotlariniYazdir (int dersNo,ArrayList<ArrayList<Integer>> notlarListesi)          // void cunku gerı bır sey istemiyor
    {
        for (int i = 0 ; i <notlarListesi.size() ; i++)
        {
            System.out.println(notlarListesi.get(dersNo).get(i)+"\t");
        }



    }







}

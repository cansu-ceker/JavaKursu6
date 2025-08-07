package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class todo {
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


        //TODO
        // Soru 3 :
        // Yukarıda verilen derse ait not ortalamasını ve geçen sayısını bir metodda yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Ders no giriniz \n 0-Mat, 1-Fiz, 2-Kim ");
        int dersNo = oku.nextInt();


        dersNotlariniYazdir (dersNo,notlarListesi);
        dersOrtlamaYazdir (dersNo,notlarListesi);

    }
    public static void dersNotlariniYazdir (int dersNo,ArrayList<ArrayList<Integer>> notlarListesi)          // void cunku gerı bır sey istemiyor
    {
        for (int i = 0 ; i <notlarListesi.size() ; i++)
        {
            System.out.println(notlarListesi.get(dersNo).get(i)+"\t");
        }


        System.out.println("*************************");
    }


    public static void dersOrtlamaYazdir(int dersNo, ArrayList<ArrayList<Integer>> notlarListesi){

        double toplam=0;
        for (int i = 0; i <notlarListesi.size() ; i++) {

            for (int j = 0; j <notlarListesi.get(dersNo).size() ; j++) {

                toplam=toplam+notlarListesi.get(i).get(j);

            }
            double ort= toplam/(notlarListesi.get(dersNo).size());
            System.out.println( "ortlama: "+ ort);



        }



    }
















}

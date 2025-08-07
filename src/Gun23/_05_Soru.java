package Gun23;

import Tools.MyFunc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class _05_Soru {
    public static void main(String[] args) {

        // 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
        // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
        // diziye atınız.



//   int []dizi=new int[10];

 //     for (int i = 0 ; i <dizi.length ; i++)
//      {
//        dizi[i]= (int)(Math.random()*11);  // 10 dahil diye 11 dedik
//         System.out.println("dizi = " + dizi[i]); boyle tek tek yazdırıyor
//      }

//       System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));  // boyle dizi= [..,..,..,..) dıye yazdııryor
        //hem String hem int diziyi direkt ekrana yazdırmak için




//
//
//        TreeSet<Integer> ts=new TreeSet<>();   // sıralı olsun dıye seceyım dedık
//
//        for (int i = 0 ; i <dizi.length ; i++)
//        {
//            ts.add(dizi[i]);    // ts=[..,..,..,..]  tekrarlı olanları almadı ve random atadıgı sayıları sırayla yazdı
//        }
//        System.out.println("ts = " + ts);   //tekrarlı olanları almadı ve random atadıg sayıları sırayla yazdı


        //2.YOL, dizi yi set e atacaksan Integer diye yazmalısın
/*
        Integer []dizi=new Integer[10];

        for (int i = 0 ; i <dizi.length ; i++)
        {
            dizi[i]= (int)(Math.random()*11);  // 10 dahil diye 11 dedik
            // System.out.println("dizi = " + dizi[i]); boyle tek tek yazdırıyor
        }

        TreeSet<Integer>ts2= new TreeSet<>(Arrays.asList(dizi)); // bunu kullanmak istiyorsak int değil Integer olarak başta tanımlamak gerek
        System.out.println("ts2 = " + ts2);



*/


    }




}

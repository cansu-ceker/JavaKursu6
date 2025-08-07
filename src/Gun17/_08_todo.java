package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _08_todo {
    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazdırnız.

       // TODO : sadece ilk rakamın yerini versin
        // TODO : bulamadığında bulamadım desin.

        // ben yaptım calısıyor ama kımseye kontrol ettırmedım


        int[] dizi= new int[10];
        for (int i = 0; i <dizi.length ; i++) {
            dizi[i]=(int)(Math.random()*11);
        }

        Arrays.sort(dizi);
        System.out.println("dizi="+ Arrays.toString(dizi));

        Scanner reader=new Scanner(System.in);
        System.out.print("rakam gir:");
        int aranan= reader.nextInt();

        for (int i = 0; i <dizi.length ; i++) {
            if (dizi[i]==aranan) {
                System.out.println("index:" + i);
                break;
            }
        }
        System.out.println("aranan sayı yok");

    }
}

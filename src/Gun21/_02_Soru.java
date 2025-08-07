package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız sayılarla dolduracağınız 6 elemanlı(sayı) bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye(liste)(ArrayList) atayarak
        // yazdırınız.


        Scanner oku=new Scanner(System.in);
        int [] dizi= new int[6];

        ArrayList<Integer> teklerList = new ArrayList<>();

        for (int i = 0 ; i <dizi.length ; i++)
        {
            System.out.print(i+1+ ". sayıyı girin = ");

           dizi[i]= oku.nextInt();

          if (dizi[i]%2 !=0)  //  tek demek, hem negatif hem pozitif hem de -1, çift olmayanları donguye sok dedik
                              // 2 ye bolununce kalan 0 dan farklı ıse ekle dedık
              teklerList.add(dizi[i]);

        }


        System.out.println("teklerList = " + teklerList);

    }


}

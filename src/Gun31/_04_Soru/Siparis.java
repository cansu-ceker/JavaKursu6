package Gun31._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Siparis {
    public static void main(String[] args) {

        Scanner okuInt= new Scanner(System.in);
        Scanner okuStr= new Scanner(System.in);
        ArrayList<Integer> siparisler=new ArrayList<>();

        int secim=0;
        do {
            System.out.println("Aşağıdaki menüden istediğiniz pizzanın numarasını girin= ");
            System.out.println("MENÜ:\n 1-Small\n 2-Medium\n 3-Large\n 4-Seçilenleri göster ");
            secim=okuInt.nextInt();

            if (secim==PizzaSize.SMALL.ordinal())
               siparisler.add(PizzaSize.SMALL.ordinal());
            if (secim==PizzaSize.MEDIUM.ordinal())
                siparisler.add(PizzaSize.MEDIUM.ordinal());
            if (secim==PizzaSize.LARGE.ordinal())
                siparisler.add(PizzaSize.LARGE.ordinal());
              }while (secim<4);

        System.out.println("siparisler = " + siparisler);

    }

    public  static  void menu()
    {




    }



}

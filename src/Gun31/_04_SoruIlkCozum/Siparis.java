package Gun31._04_SoruIlkCozum;

import java.util.ArrayList;
import java.util.Scanner;

public class Siparis {
    public static void main(String[] args) {

        Scanner okuInt= new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();

        int secim=0;
        do {
            menu();
            secim=okuInt.nextInt();

            switch (secim){
                case 1: Pizza ps= new Pizza(PizzaSize.SMALL);
                      siparisler.add(ps);
                      break;
                case 2: Pizza pm= new Pizza(PizzaSize.MEDIUM);
                      siparisler.add(pm);
                      break;
                case 3: Pizza pl= new Pizza(PizzaSize.LARGE);
                      siparisler.add(pl);
                      break;
                case 4: siparisYazdir(siparisler);
            }
        }while (secim<5);

    }
                                   // sıparıslerın cınsı
    public static void siparisYazdir(  ArrayList<Pizza> siparisler){

        int s=0, m=0, l=0;

        for (Pizza p : siparisler)
        {
            switch (p.size){
                case SMALL: s++;  break;
                case MEDIUM: m++; break;
                case LARGE: l++;  break;
            }
        }
        System.out.println(s +"tane Small pizza");
        System.out.println(m +"tane Medium pizza");
        System.out.println(l +"tane Large pizza");

    }

    public  static  void menu()
    {
        System.out.println("++++++++ PIZZA MENU +++++++++ ");
        System.out.println("1 - SMALL ");
        System.out.println("2 - MEDIUM ");
        System.out.println("3 - LARGE ");
        System.out.println("4 - Işleme al- Siparişi göster ");
        System.out.println("5 - ÇIKIŞ ");
        System.out.print("Seçiminiz: ");
    }

}

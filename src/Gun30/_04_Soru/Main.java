package Gun30._04_Soru;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int gun=0; // bunları bole 0 yaomasan da olur ama boyle basta tanımlamak best practice
        int saat=0;
        int dak=0;

        Scanner oku=new Scanner(System.in);
        System.out.print("Kaç gün? ");
        gun= oku.nextInt();

        System.out.print("Kaç saat? ");
        saat= oku.nextInt();

        System.out.print("Kaç dakika? ");
        dak= oku.nextInt();

        System.out.println("toplamSaniye = " + Sabitler.hesaplama(gun,saat,dak));















    }
}

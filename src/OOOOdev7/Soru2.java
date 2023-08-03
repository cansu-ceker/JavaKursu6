package OOOOdev7;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku=new Scanner(System.in);
        System.out.print("Aralarında bir boşlukla 3 sayı girin=");
        String sayi= oku.nextLine();

        int bosluk1= sayi.indexOf(" ");
        String sayi1= sayi.substring(0,bosluk1);
        int sayi1Int=Integer.parseInt(sayi1);

        int bosluk2= sayi.lastIndexOf(" ");
        String sayi2= sayi.substring(bosluk1+1,bosluk2);
        int sayi2Int=Integer.parseInt(sayi2);

        String sayi3=sayi.substring(bosluk2+1);
        int sayi3Int=Integer.parseInt(sayi3);


        if ((sayi1Int+sayi2Int+sayi3Int)%2==0)
            System.out.println("Çift");
        else
            System.out.println("Tek");












    }
}

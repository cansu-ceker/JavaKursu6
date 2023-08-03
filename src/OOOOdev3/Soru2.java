package Odev1;

public class Soru2 {
    public static void main(String[] args) {

     // String olarak verilen 3 adet paranın toplamını bulunuz ("100", "200", 300)

        String yazipara1="100";
        String yazipara2="200";
        String yazipara3="300";

        int para1= Integer.parseInt(yazipara1);
        int para2= Integer.parseInt(yazipara2);
        int para3= Integer.parseInt(yazipara3);

        int toplam=para1+para2+para3;
        System.out.println("toplam = " + toplam);



    }
}

package Gun04;

public class _07_Ornek3 {
    public static void main(String[] args) {


        //String olarak verilen 3 notun ("83","95","56") ortalamasını bulunuz.

        String not1 = "82";  //kelimenot
        String not2 = "95";
        String not3 = "56";

        int rakamNot1 = Integer.parseInt(not1);
        int rakamNot2 = Integer.parseInt(not2);
        int rakamNot3 = Integer.parseInt(not3);

        int toplamNot = rakamNot1 + rakamNot2 + rakamNot3;

        System.out.println("toplam = " + toplamNot);


        double ort=toplamNot/(double)3;
        System.out.println("ort = " + ort);



    }
}

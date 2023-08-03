package Odev1;

public class Soru3 {
    public static void main(String[] args) {

        //String olarak verilen 3 taksit bilgisinin ortalamasını(ondalıklı olarak)
        // bulunuz.("150","185","95")

       String yazitaksit1="150";
       String yazitaksit2="185";
       String yazitaksit3="95";
       
        Double taksit1= Double.parseDouble(yazitaksit1);
        Double taksit2= Double.parseDouble(yazitaksit2);
        Double taksit3= Double.parseDouble(yazitaksit3);
        
        Double ortalama= (taksit1+taksit2+taksit3)/3;
        System.out.println("ortalama = " + ortalama);



    }
}

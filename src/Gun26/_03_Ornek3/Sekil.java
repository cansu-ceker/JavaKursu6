package Gun26._03_Ornek3;

public class Sekil {
    public static void main(String[] args) {

Rectangle r =new Rectangle();

r.length=5;
r.width=4;

r.cevre();
r.alan();

System.out.println("***********************");

int cevre=r.cevre2();
     System.out.println("cevre2 = " + cevre);
 //  System.out.println("cevre2 = " + r.cevre2());


int alan=r.alan2();
      System.out.println("alan2 = " + alan);
 //   System.out.println("alan2 = " + r.alan2());



System.out.println("***********************");

        //metod ile değer atayarak
        r.degerAta(6,5);
        r.cevre();
        r.alan();



    }


}

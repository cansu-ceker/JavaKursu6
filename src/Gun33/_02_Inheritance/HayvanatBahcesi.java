package Gun33._02_Inheritance;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi kedi1=new Kedi("siyah","tekir",3);
        kedi1.konustu();

        Kopek kopek1=new Kopek("bal","pong",1);
        kopek1.konustu();

        Yilan yilan1=new Yilan("siyah","engerek",3,3);
        yilan1.konustu();
        System.out.println("yilan1 = " + yilan1);

        Ordek ordek1=new Ordek("yeşil","gövel",3,4);
        ordek1.konustu();
        System.out.println("ordek1 = " + ordek1);










    }
}

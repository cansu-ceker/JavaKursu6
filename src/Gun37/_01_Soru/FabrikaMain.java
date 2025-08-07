package Gun37._01_Soru;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {

      TeslaCar tescar= new TeslaCar("tesla",450.0);
      ToyotaPrius toyt=new ToyotaPrius("toyota",250.0);
      CityBus bus=new CityBus("IVECO",120.0);

        ArrayList<Vehicle>arabalar=new ArrayList<>();
        arabalar.add(tescar);
        arabalar.add(toyt);
        arabalar.add(bus);



        for ( Vehicle v: arabalar)   // metodları yazdırma yontemı
            {
                System.out.println("-----------------------------------");
                System.out.println(v.getClass().getSimpleName());         // class ın adını verıyor  mesela TeslaCar
                System.out.println("-----------------------------------");
                System.out.println(v.getModel());
                System.out.println(v.getEngine());

            if ( v instanceof  TeslaCar)  // v nin nesne referasnsı TeslaCar ise demek
            {
                System.out.println(((TeslaCar) v).drive());  // (TeslaCar) v demek -> v yi TeslaCar a cevırmsız gıbı oluyor
                                                             // (TeslaCar)v. deyınce de cıkmıyor cunku ((TeslaCar)v). yapmak lazım NOKTA= NIN demek gibi düşün
                                                             // ((TeslaCar)v). deyınce cıkıyor ona ait metodlar
                                                             // (TeslaCar)v    -> arabalardan Tesla
                                                             // ((TeslaCar)v). -> arabalardan TeslaNIN
                                                             // ((TeslaCar)v).changeBattery() -> arabalardan TeslaNIN changeBattery() metodu



                System.out.println(((TeslaCar)v).changeBattery()); // cevırdıkten sonra noktaya basınca changeBattery anca cıkıyor. cevırmeden v. yapsaydık cıkmıyordu changeBattery
            }else
                if (v instanceof ToyotaPrius)
                {

                    System.out.println(((ToyotaPrius) v).drive());
                    System.out.println(((ToyotaPrius)v).changeBattery());
                    System.out.println(((ToyotaPrius)v).changeOil());
                }
                else {
                    System.out.println(((CityBus) v).drive());
                    System.out.println(((CityBus) v).changeDiesel());
                }
        }



    }
}
 // Inheritance  (extends): Classların ortak kısmınlarının yazıldığı yer
// Interface  (implements): Classlardaki ortak metodların yazıldığı yani sadece imzasının yazdılgığı yer
package Gun37._02_Soru;

import java.util.ArrayList;

public class HayvanMain {
    public static void main(String[] args) {

       Shark kopekbalik = new Shark();
       Swallow kirlangic=new Swallow();
       Cat kedi=new Cat();
       Duck ordek=new Duck();

        ArrayList<IAnimal>hayvanlar=new ArrayList<>();
        hayvanlar.add(kopekbalik);
        hayvanlar.add(kirlangic);
        hayvanlar.add(kedi);
        hayvanlar.add(ordek);

        for (IAnimal h : hayvanlar )
        {
            System.out.println("-----------------------------------");
            System.out.println(h.getClass().getSimpleName());
            System.out.println("-----------------------------------");

            if (h instanceof Shark)
            {
                System.out.println(  ((Shark) h).yuzuyor());
                System.out.println(  ((Shark)h).food());
            } else
                if (h instanceof  Swallow)
                {
                    System.out.println(  ((Swallow) h).ucuyor());
                    System.out.println(  ((Swallow) h).food());
                }else
                    if (h instanceof Cat)
                    {
                        System.out.println( ((Cat)h).food());
                    }
                    else {
                        System.out.println(((Duck) h).food());
                        System.out.println(((Duck) h).yuzuyor());
                        System.out.println(((Duck) h).ucuyor());
                    }

        }


    }
}

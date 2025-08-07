package Gun27._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {

        Utility.getString2(56);  // sınıfın ıcınden çagırıyoruz, public static olan


 Utility ut=new Utility();  // nesne olusturup cagırabılıyoruz, public olan static yok
 ut.getString(56);
//  ut :nesnenin adı


/*
        ıkısı de aynı ıslevı gorur ama cagırılmaları farklı,
        bazıların nesnelerin ozellıklerı olmadan calısmaz dıye


        static metodlar: class a, yani tipe ait
      static olmayanlar: nesneye ait () buarda ut nesne mesela
                         bu sebeple nesen adı ile cagırıılırlar

        staticse nesne yok

      */




    }
}

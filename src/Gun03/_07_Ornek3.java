package Gun03;

public class _07_Ornek3 {
    public static void main(String[] args) {

           //kişinin kilo (kg) ve boyunu(m) kendiniz veriniz
         // ekrana kilonuz : ..... ve boyunuz: ..... yazdıktan sonra
          // vucut kitle indeksini bulunuz.  kilo/ (boy*boy)


        double kilo, vki;
        kilo=80.5;
        double boy=1.65;
        vki=kilo/(boy*boy);

        System.out.println("boyunuz = " + boy+"m");
        System.out.println("kilonuz = " + kilo+"kg");
        System.out.println("vücut kitle indeksiniz = " + vki);

    }
}

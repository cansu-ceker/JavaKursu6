package Gun38._01_Abstract;

public class Ford extends BinekOto{

    public Ford(String marka, int uretimYili, int vitesAdedi)
    {
        super(marka, uretimYili, vitesAdedi);
    }

    @Override
   public int hizlanmaSuresi() {
        return 0;
    }
}

/*

1-parent class: birden fazla classın ortak yönlerini tek bir classta toplayıp, orada inheritance yapıp, tekrar yazılmasını engellemek için kullanırız.
2-Interface : yazılacak olan fmetotların listesinin olduğu ve sadece metotun imzasının verildiği / yer aldığı yapılacaklar listesidir. her implement eden class metodun içini kendine göre yaazmak zorunda




 */
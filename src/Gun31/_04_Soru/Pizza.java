package Gun31._04_Soru;

public class Pizza {
/*
    int pizzaBuyukluk; 1/2/3
    String pBuyukluk= "Small";  seklınde pızzanın buyuklugunu bbunun gbı vs yazarak bu class ta kullanabılırım basta tanımlayabılırım yanı ama
                                bu cok kod ve zorluk demek o yuzden ben enum class yaptım
                                ve pızzanın buyuklugunu netlemıs oldum sımgelerıyle etıketlerıyle smdı burda kullanmak ıcın asagıdakını yaptım
*/

    PizzaSize size;

    public Pizza(PizzaSize size)
    {
        this.size = size;
    }
}

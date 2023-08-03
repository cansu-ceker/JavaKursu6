package Gun37._02_Soru;

public class Duck implements ISailing,IFlying{
    @Override
    public String food() {
        return "ördek marul yer";
    }

    @Override
    public String ucuyor() {
        return "ördek uçuyor";
    }

    @Override
    public String yuzuyor() {
        return "ördek yüzüyor";
    }
}

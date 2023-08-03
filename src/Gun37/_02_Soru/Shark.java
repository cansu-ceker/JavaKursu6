package Gun37._02_Soru;

public class Shark implements ISailing{
    public Shark() {
    }
    @Override
    public String food() {
        return "köpekbalığı insan yer";
    }

    @Override
    public String yuzuyor() {
        return "köpekbalığı yüzüyor";
    }
}

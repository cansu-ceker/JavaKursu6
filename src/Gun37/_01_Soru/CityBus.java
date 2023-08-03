package Gun37._01_Soru;

public class CityBus extends Vehicle implements IDiesel {
    public CityBus(String model, Double engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
        return "1 depo ile 1000 km gider";
    }

    @Override
    public String changeDiesel() {
        return "en fazl 90 km hız yapabilir";
    }
}

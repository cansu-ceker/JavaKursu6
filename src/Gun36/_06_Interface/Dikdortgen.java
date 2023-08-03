package Gun36._06_Interface;

public class Dikdortgen implements IGeometri {


    @Override
    public int alan(int kisakenar, int uzunkenar) {
        return kisakenar*uzunkenar;
    }

    @Override
    public int cevre(int kisakenar, int uzunkenar) {
        return 2*(kisakenar+uzunkenar);
    }
}

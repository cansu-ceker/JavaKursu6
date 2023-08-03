package Gun38._02_Abstract;

public class Daire extends Sekil{

 private double yaricap;

 // private double pi=3.14; boyhle de yazabılırdık


    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    double alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    double cevre() {
        return 2*Math.PI*yaricap;
    }
}

package Gun36._04_Interface;

public class A4 implements IYazdirir,IGosterir {   // extends te ... , ... olarak iki yerden olmaz yazamayızboyle, yanı ıokı kısıden mıras alınmaz

    @Override
    public void gosterir() {
        System.out.println("gösterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("yazdırdı");
    }
}

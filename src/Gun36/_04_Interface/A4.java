package Gun36._04_Interface;

public class A4 implements IYazdirir,IGosterir {   // extends te ... , ... olarak iki yerden olmaz yazamayız boyle cnku tek mıras alınıyo tek interihance oldugundan tek extend olur,
                                                   // ama interface e 2 ve daha fazla implements yapılabılıyor

    @Override
    public void gosterir() {
        System.out.println("gösterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("yazdırdı");
    }
}

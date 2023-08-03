package Gun38._03_Abstract;

public class YemekDunyasi {
    public static void main(String[] args) {

Baklava b=new Baklava();
System.out.println(b.getClass().getSimpleName());
b.taste();
b.madeIn();
System.out.println();  // aralarında bosluk olussun dıye koyduk

CheeseCake ck=new CheeseCake();
System.out.println(ck.getClass().getSimpleName());
ck.taste();
ck.madeIn();
System.out.println();  // aralarında bosluk olussun dıye koyduk

GreekSalad g=new GreekSalad();
System.out.println(g.getClass().getSimpleName());
g.taste();
g.madeIn();
System.out.println();  // aralarında bosluk olussun dıye koyduk

SezarSalad s=new SezarSalad();
System.out.println(s.getClass().getSimpleName());
s.taste();
s.madeIn();


    }
}

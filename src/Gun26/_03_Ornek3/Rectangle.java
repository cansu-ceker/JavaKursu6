package Gun26._03_Ornek3;

public class Rectangle {  //alttaı metodların hepsını bu class ın ıcıne yazdık

    int width;
    int length;

    public void cevre( ) // sattik demedik, this. seklınde yaptık
    {
    int cevre= 2*(this.length+this.width);
        System.out.println("cevre = " + cevre);
    }

    public void alan( )
    {
    int alan= this.width*this.length;
        System.out.println("alan = " + alan);

    }

    public int cevre2( )  //return varsa yanı  main e gıdecek bı sey varsa, ne gdıyorsa onun cinsini yaz, pıblic in yanına int yazdık burada
    {
        int cevre= 2*(this.length+this.width);
        return cevre;

    }
    public int alan2( )
    {
        int alan= this.width*this.length;
        return alan;
    }

    public void degerAta (int a, int b )
    {
        this.width=a;
        this.length=b;
    }

}

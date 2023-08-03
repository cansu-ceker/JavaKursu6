package Gun28._02_Ornek;

public class Book {

    String name;
    int publishYear;
    String author;


    //1.Constructor
    public Book()  // bunu yapmasaydık book1 i calsıtırmazdı mainde, diğer constructorları da artık yazdıgın ıcın bunu bole bos yapman lazım, hanı const kullanmıcam ben deseydın bunu yazmaya gerek yoktu
    {

    }


    //2.Constructor
    public Book(String name,int publishYear, String author)
    {
        this.name=name;  // senın kendı adın bnım gonderdıgım adın olsun
        this.publishYear=publishYear;
        this.author=author;
    }


    //3.Constructor, bu seklı,
    public Book(String name,int publishYear)
    {
        this(name,publishYear,"");  // "" yaptık usttekı const a uymak gerektıgı ıcın

    }


    public String toString()  // bunu yazmazsak dırekt sout ıle yazdıramıyoruz
    {
        return this.name+" "+this.author+" "+this.publishYear;
    }


}

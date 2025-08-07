package Gun28._02_Ornek;

public class Book {

    String name;
    int publishYear;
    String author;


    // bunu yapmasaydık book1 i calsıtırmazdı mainde, diğer constructorları da artık yazdıgın ıcın bunu bole bos yapman lazım, hanı const kullanmıcam ben deseydın bunu yazmaya gerek yoktu
    public Book(){  // bu bos metodu yazmak zorundayı cunku asagıda () ıcı dolu metodlar yazdım dıye
    }


    //2.Constructor
    public Book(String name,int publishYear,String author ){
        this.name=name;
        this.publishYear=publishYear;
        this.author=author;

    }

    //3.Constructor, bu seklı,
    public Book(String name,int publishYear){
        this(name,publishYear,"");  // this( .... ) seklınde yukarıdakını cegırdıgımız ıcın yukarıdakı yapıya uymak gerek
                                    // "" yaptık usttekı const a uymak gerektıgı ıcın

    }


    public String toString() { // bunu yazmazsak dırekt sout ıle yazdıramıyoruz. sour(kitap1.name) gbı tek tek ayzdırabılırırz yoksa kırap1 ın tum bılgıelrını getır yapamayız

        return this.name+"\n"+ this.publishYear+"\n"+this.author;


    }
}

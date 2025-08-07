package Gun30._01_StaticVariables.BENornek2;

public class Student {
    static int id=1;
    String fullName;

    public Student(String fullName) {
        this.fullName = fullName;
        id++;   //  this.id; seklınde static yaptıklarımızı this. yapamıyoruz bu yuzden benım bu cozumum aslında cok dogru olmadıgı ıcın  sırf id++; yaptık thıs ı kullanamıyorum dıye.  o yuzden hocanın cozumu EN DOGRUSU HOCA
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                "fullName='" + fullName + '\'' +
                '}';
    }
}

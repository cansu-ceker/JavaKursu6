package Gun29.BENcevap;

public class hesap {

    private int yatan=0;
    private int cekilen=0;
    private int bakiye=0;


    public void paraYatir(int para){

       this.yatan=this.yatan+ para;
       this.bakiye=this.bakiye+para;
   }

    public void cekPara( int para2){

       this.cekilen=this.cekilen+para2;
       this.bakiye=this.bakiye-this.cekilen;

    }



    public String toString() {
        return "hesap{" +
                "yatan=" + this.yatan +
                ", cekilen=" +this.cekilen +
                ", bakiye=" + this.bakiye
                +
                '}';
    }
}

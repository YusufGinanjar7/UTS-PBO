interface Tipe{
    void genre();
}
abstract class Game implements Tipe{
    private String nama;

    public game(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
}

class Tembakan extends Game {
    private String nama;
    public Tembakan(String nama){
        this.nama = nama;
    }
    @Override
    public void genre(){
        System.out.println(nama + " game ini bertipe tembakan.");
    }
    // @Override
    // public String getType(){
    //     return nama;
    // }
}

class Balapan extends Game {
    private String nama;
    public Balapan(String nama){
        this.nama = nama;
    }
    @Override
    public void genre(){
        System.out.println(nama + " game bertipe balapan liar.");
    }
    // @Override
    // public String getType(){
    //     return nama;
    // }
}

public class Main {
    public static void main(String[] args){
        Game tembakan = new Tembakan("PUBG");
        Game balapan =  new Balapan("Need More Speed");

        tembakan.genre();
        balapan.genre();
    }
}
package pl.sda;

public class Mp3Player implements Player{
    private int price;

    public Mp3Player(int price) {
        this.price = price;
    }

    public void play(){
        System.out.println("Mp3Player");
    }

}

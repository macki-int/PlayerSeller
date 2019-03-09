package pl.sda;

public class Mp5Player implements Player{
    private int price;

    public Mp5Player(int price) {
        this.price = price;
    }

    public void play(){
        System.out.println("Mp5Player");
    }

}

package pl.sda;

public class Runner {
    public static void main(String[] args) {

//        Mp3Seller mp3Seller = new Mp3Seller(new Mp3Player(100));
//        Mp4Seller mp4Seller = new Mp4Seller(new Mp4Player(100));
//        Mp5Seller mp5Seller = new Mp5Seller(new Mp5Player(100));

        IoC  ioc = new IoC();
        PlayerSeller mp3PlayerSeller = new PlayerSeller(ioc.playerMap.get("Mp3Player"));
        PlayerSeller mp4PlayerSeller = new PlayerSeller(ioc.playerMap.get("Mp4Player"));
        PlayerSeller mp5PlayerSeller = new PlayerSeller(ioc.playerMap.get("Mp5Player"));

        mp3PlayerSeller.sell();
        mp4PlayerSeller.sell();
        mp5PlayerSeller.sell();
    }
}

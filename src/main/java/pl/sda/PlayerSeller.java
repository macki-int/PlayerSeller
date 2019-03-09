package pl.sda;

public class PlayerSeller  {
    private Player player;

    public PlayerSeller(Player player) {
        this.player = player;
    }

    public void sell(){
        player.play();
    }
}

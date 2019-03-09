package pl.sda;

import java.util.HashMap;
import java.util.Map;

public class IoC {
     Map<String, Player> playerMap;

    public IoC() {
        this.playerMap = new HashMap<String, Player>();
        playerMap.put("Mp3Player", new Mp3Player(100));
        playerMap.put("Mp4Player", new Mp4Player(200));
        playerMap.put("Mp5Player", new Mp5Player(300));
    }


}

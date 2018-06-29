package playerDB.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

import playerDB.model.Player;

public class InitialData {
    public static List<Player> getPlayers() throws IOException {
        List<Player> playerList = new ArrayList<Player>();
        ReadCSV readPlayers = new ReadCSV("PlayerStats.csv");
        try {
            while(true) {
                List<String> tuple = readPlayers.next();
                if(tuple == null){
                    break;
                }
                Iterator<Object> i = tuple.iterator();
                Player player = new Player();
                player.setId((Integer)i.next());

            }
        }
    }
}
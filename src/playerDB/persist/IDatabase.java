package playerDB.persist;

import java.util.List;

import playerDB.model.*;

public interface IDatabase {
	//Find one player by name
	public List <Player> findPlayerByName(String name);
	//Find all players of a team
	public List <Player> findPlayerByTeam(String team);
}
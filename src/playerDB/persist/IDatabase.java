package playerDB.persist;

import java.util.List;

import playerDB.model.*;

public interface IDatabase {
	public List <Player> findPlayerByName(String name);
}
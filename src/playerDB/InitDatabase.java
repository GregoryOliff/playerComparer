package playerDB;

import playerDB.persist.*;

public class InitDatabase {
	public static void init() {
		DatabaseProvider.setInstance(new DerbyDatabse());
	}
}
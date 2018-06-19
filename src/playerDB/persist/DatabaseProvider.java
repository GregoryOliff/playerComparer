package playerDB.persist;

public class DatabaseProvider {
	private static IDatabase instance;
	
	public static void setInstance(IDatabase db) {
		instance = db;
	}
	
	public static IDatabase getInstance() {
		if(instance == null) {
			throw new IllegalStateException("IDatabase instance has not been set");
		}
		return instance;
	}
	
}
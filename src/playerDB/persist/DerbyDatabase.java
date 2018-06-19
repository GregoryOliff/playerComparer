package playerDB.persist;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import playerDB.model.*;

public class DerbyDatabase implements IDatabase {
	static {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		}
		catch (Exception e) {
			throw new IllegalStateException("Could not load Derby Driver");
		}
	}
	
	private interface Transaction<resultType> {
		public ResultType execute(Connection conn) throws SQLException;
	}
	
	private static final int MAX_ATTEMPTS = 10;
	
	@Override
	public List<Player> findPlayerByName(String name){
		return executeTransaction(new Transaction<List<Player>>() {
		@Override
		public List<Player> execute(Connection conn) throws SQLException{
			PreparedStatement stmt = null;
			ResultSet resultSet = null;
		}
	}
}
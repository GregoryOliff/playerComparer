package playerDB.persist;

import java.util.*;
import java.io.*;

public class ReadCSV implements Closeable {
	private BufferedReader reader;
	
	public ReadCSV(String resourcename) throws IOException {
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("playerDB/persist/res/" + resourcename);
		if (in == null) {
			throw new IOException("Couldn't open " + resourcename);
		}
		
		this.reader = new BufferedReader(new InputStreamReader(in));
	}
	
	public List<String> next() throws IOException {
		String line = reader.readLine();
		if(line == null) {
			return null;
		}
		List<String> tuple = new ArrayList<String>();
		StringTokenizer tok = new StringTokenizer(line, ",");
		while (tok.hasMoreTokens()){
			tuple.add(tok.nextToken().trim());
		}
		return tuple;
	}
	
	public void close() throws IOException{
		reader.close();
	}
}
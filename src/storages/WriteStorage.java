package storage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteStorage {
	
	private FileWriter fw = null;
	private BufferedWriter bufferedWriter = null;
	
	public WriteStorage(File file) throws IOException {
		fw = new FileWriter(file);
		bufferedWriter = new BufferedWriter(fw);
	}
	
	public void save(String line) {
		try {
			bufferedWriter.write(line);
			bufferedWriter.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void close() throws IOException {
		bufferedWriter.close();
	}
}	

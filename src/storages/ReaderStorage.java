package storage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderStorage {

	private FileReader fr = null;
	private BufferedReader bufferedReader = null;
	private String[] line = null;

	public ReaderStorage(File file) throws FileNotFoundException {
		if (file.exists()) {
			fr = new FileReader(file);
			bufferedReader = new BufferedReader(fr);
			line = new String[1024];
		}
	}

	public void read() throws Exception {
		try {
			int i = 0;
			while ((this.line[i++] = bufferedReader.readLine()) != null) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() throws IOException {
		bufferedReader.close();
	}

	public String[] getLine() {
		return line;
	}

}

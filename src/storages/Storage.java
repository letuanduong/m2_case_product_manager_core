package storage;

import java.io.File;
import java.io.IOException;

public class Storage {
	
	private File file;
	
	public File getFile() {
		return this.file;
	}
	public void setFile(String url) throws IOException {
		this.file = new File(url);
		file.createNewFile();
	}
}

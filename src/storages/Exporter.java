package storage;

import java.io.IOException;
import java.util.List;

import product.Product;

public class Exporter implements IExporter{

	Storage storage = null;
	
	public Exporter() throws IOException {
		storage = new Storage();
		storage.setFile(URL_STRING);
	}

	@Override
	public String[] exporter() throws Exception {
		ReaderStorage rtx = new ReaderStorage(storage.getFile());
		rtx.read();
		rtx.close();
		return rtx.getLine();		
	}

	@Override
	public void importer(List<Product> list) throws IOException {
		WriteStorage wtx = new WriteStorage(storage.getFile());
		for(Product products : list) {
			wtx.save(products.toString());	
		}
		wtx.close();
	}

}

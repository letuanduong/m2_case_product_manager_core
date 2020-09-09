package storage;

import java.io.IOException;
import java.util.List;

import product.Product;

public interface IExporter {
	
	static final String URL_STRING = "E:\\OneDrive\\CodeGym\\Module2\\caseStudy\\managerProduct.txt";
	
	String[] exporter() throws IOException, Exception;
	void importer(List<Product> list) throws IOException;
}

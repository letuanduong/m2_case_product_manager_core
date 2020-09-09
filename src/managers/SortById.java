package manager;

import java.util.Comparator;

import product.Product;

public class SortById implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
		if(product1.getId() > product2.getId())
			return 1;
		else if( product1.getId() < product2.getId())
			return -1;
		else
			return 0;
	}

}

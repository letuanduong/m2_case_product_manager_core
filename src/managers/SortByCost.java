package manager;

import java.util.Comparator;

import product.Product;

public class SortByCost implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getCost() > o2.getCost())
			return 1;
		else if(o1.getCost() < o2.getCost())
			return -1;
		else
			return 0;
	}

}

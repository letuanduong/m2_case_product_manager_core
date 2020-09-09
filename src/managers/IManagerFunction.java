package manager;

import product.ProductTypes;

public interface IManagerFunction {
	void insert(Object object);
	void delete(String string);
	void delete(Integer integer);
	void sort(Integer integer);
	Object search(String string);
	Object search(Integer integer);
	Object edit(Integer integer, ProductTypes productTypes, Double double1, String string);
	Object edit(String string, ProductTypes productTypes, Integer integer, Double double1);
	
}

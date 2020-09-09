package manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import product.Product;
import product.ProductTypes;

public class ManagerProduct implements IManagerFunction, IkeyFunction {

	private List<Product> list = null;
	
	public ManagerProduct() {
		list = new ArrayList<Product>();
	}
	
	public List<Product> getList() {
		return list;
	}
	
	public void setList(List<Product> list) {
		this.list = list;
	}
	
	@Override
	public void insert(Object object) {
		list.add((Product) object);
	}

	@Override
	public void delete(String string) {
		list.removeIf((Predicate<? super Object>)n -> (((Product) n).getName() == string));
	}

	@Override
	public void delete(Integer integer) {
		list.removeIf((Predicate<? super Object>)n -> (((Product) n).getId() == integer));
	}

	@Override
	public void sort(Integer integer) {
		switch (integer) {
		case SORT_BY_ID:
			SortById sortById = new SortById();
			Collections.sort(list, sortById);
			break;
		case SORT_BY_NAME:
			SortByName sortByName = new SortByName();
			Collections.sort(list, sortByName);
			break;
		case SORT_BY_COST:
			SortByCost sortByCost = new SortByCost();
			Collections.sort(list, sortByCost);
			break;
		}
	}

	@Override
	public Object search(String string) {
		for(Object obj : list)
			if(((Product)obj).getName().equals(string))
				return obj;
		return null;
	}

	@Override
	public Object search(Integer integer) {
		for (Object product : list) {
			if(((Product) product).getId() == integer )
				return product;
		}
		return null;
	}

	@Override
	public Object edit(String string, ProductTypes productTypes, Integer integer, Double double1) {
		for (Object obj : list) {
			if(((Product) obj).getName().equals(string)) {
				((Product) obj).setCategory(productTypes);
				((Product) obj).setId(integer);
				((Product) obj).setCost(double1);
				return obj;
			}
		}
		return null;
	}

	@Override
	public Object edit(Integer integer, ProductTypes productTypes, Double double1, String string) {
		for (Object product : list) {
			if(((Product) product).getId() == integer) {
				((Product) product).setCategory(productTypes);
				((Product) product).setName(string);
				((Product)product).setCost(double1);
				return product;
			} 
		}
		return null;
	}

}

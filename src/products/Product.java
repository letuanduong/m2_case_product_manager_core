package product;

import java.io.Serializable;

public abstract class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected ProductTypes category;
	protected Integer id;
	protected Double cost;
	protected String name;
	
	public Product(ProductTypes category, Integer id, Double cost, String name) {
		this.category = category;
		this.id = id;
		this.cost = cost;
		this.name = name;
	}
	public abstract void setCost(double cost);
	public abstract void setId(int id);
	public abstract void setName(String name);
	public abstract void setCategory(ProductTypes category);
	public abstract double getCost();
	public abstract int getId();
	public abstract String getName();
	public abstract ProductTypes getCategory();
}

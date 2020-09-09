package product;

public class iPhone extends Product {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public iPhone(ProductTypes category, Integer id, Double cost, String name) {
		super(category, id, cost, name);
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void setCategory(ProductTypes category) {
		this.category = category;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public ProductTypes getCategory() {
		return this.category;
	}
	
	@Override
	public String toString() {
		return "category: " +category +";" + " id: " + id +";" + " cost: " + cost + ";" + " name: " + name + ";";
	}

}

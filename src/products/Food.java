package product;

public class Food extends Product{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Food(ProductTypes category, int id, double cost, String name) {
		super(category, id, cost, name);
	}
	
	@Override
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void setCategory(ProductTypes category) {
		this.category = category;
	}

	@Override
	public ProductTypes getCategory() {
		return this.category;
	}
	@Override
	public double getCost() {
		return this.cost;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getName() {
		return this.name;
	}
		
	@Override
	public String toString() {
		return "category: " +category +";" + " id: " + id +";" + " cost: " + cost + ";" + " name: " + name + ";";
	}


	
}

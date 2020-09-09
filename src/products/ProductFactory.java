package product;

import java.util.Scanner;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;


public class ProductFactory implements IProductFactory{

	private ProductTypes category;
	private int id;
	private double cost;
	private String name;
	
	Scanner scanner = new Scanner(System.in);
	private void enterValue() {
    	System.out.printf("Enter ID: ");
		this.id = scanner.nextInt();
		System.out.printf("Enter cost: ");
		this.cost  = scanner.nextDouble();
		System.out.printf("Enter name: ");
		this.name = scanner.next();
	}
	
	@SuppressWarnings("static-access")
	@Override
	public Product creatProduct(ProductTypes productTypes) {
		switch (productTypes) {
        case BOOK:
	        enterValue();
	        this.category = productTypes.BOOK;
	        return new Book(this.category, this.id, this.cost, this.name);
        case CANDY:
	        enterValue();
	        this.category = productTypes.CANDY;
	        return new Candy(this.category, this.id, this.cost, this.name);
        case FOOD:
	        enterValue();
	        this.category = productTypes.FOOD;
	        return new Food(this.category, this.id, this.cost, this.name);
        case Samsung:
	        enterValue();
	        this.category = productTypes.Samsung;
	        return new Food(this.category, this.id, this.cost, this.name);
        case iPhone:
	        enterValue();
	        this.category = productTypes.iPhone;
	        return new Food(this.category, this.id, this.cost, this.name);
        default:
            throw new NotImplementedException();
        }
	}
}

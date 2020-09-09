package manager;

import java.util.Scanner;

import product.ProductFactory;
import product.ProductTypes;

public class ManagerFacade implements IManagerFacade{

	private ManagerProduct manager = null;
	static Scanner scanner = new Scanner(System.in);
	private ProductFactory productFactory = null;
	
	public ManagerFacade() {
		manager = new ManagerProduct();
		productFactory = new ProductFactory();
	}
	
	@Override
	public void action(Integer value) {
		switch (value) {
		case INSERT_PRODUCT: {
			System.out.println("Insert Product" +"\n"
					+ "1. Candy" + "\n" 
					+ "2. Book" + "\n"
					+ "3. Food" + "\n"
					+ "4. Samsung" + "\n"
					+ "5. iPhone" + "\n");
			switch (scanner.nextInt()) {
				case 1:
					manager.insert(productFactory.creatProduct(ProductTypes.CANDY));
					break;
				case 2:
					manager.insert(productFactory.creatProduct(ProductTypes.BOOK));
					break;
				case 3:
					manager.insert(productFactory.creatProduct(ProductTypes.FOOD));
					break;
				case 4:
					manager.insert(productFactory.creatProduct(ProductTypes.Samsung));
					break;
				case 5:
					manager.insert(productFactory.creatProduct(ProductTypes.iPhone));
					break;
			}
			System.out.println("Insert Product success!!!");
			break;
		}
		case DELETE_BY_ID:
			System.out.println("Enter Id");
			manager.delete(scanner.nextInt());
			System.out.println("Delete by ID succes!!!");
			break;
		case DELETE_BY_NAME: 
			System.out.println("Enter Name");
			manager.delete(scanner.next());
			System.out.println("Delete by name succes!!!");
			break;
		case EDIT_BY_ID: 
			System.out.println("Enter Id product to edit");
			int id = scanner.nextInt();
			System.out.println("Product you want to edit: ");
			System.out.println(manager.search(id).toString());
			System.out.println("Enter category Product: \n"
					+ "1. Candy" + "\n" 
					+ "2. Book" + "\n"
					+ "3. Food" + "\n"
					+ "4. Samsung" + "\n"
					+ "5. iPhone" + "\n");
			int category = scanner.nextInt();
			ProductTypes productTypes = null;
			switch (category) {
			case 1:
				productTypes = ProductTypes.CANDY;
				break;
			case 2:
				productTypes = ProductTypes.BOOK;
				break;
			case 3:
				productTypes = ProductTypes.FOOD;
				break;
			case 4:
				productTypes = ProductTypes.Samsung;
				break;
			case 5:
				productTypes = ProductTypes.iPhone;
				break;
			}
			System.out.println("Enter Cost Product: ");
			double cost = scanner.nextDouble();
			
			System.out.println("Enter Name Product");
			String name = scanner.next();
			
			manager.edit(id, productTypes, cost, name);
			System.out.println("Edit by ID succes!!!");
			break;
		case EDIT_BY_NAME: 
			System.out.println("Enter Name product to edit");
			String name1 = scanner.next();
			System.out.println("Product you want to edit: ");
			System.out.println(manager.search(name1).toString());
			System.out.println("Enter category Product: \n"
					+ "1. Candy" + "\n" 
					+ "2. Book" + "\n"
					+ "3. Food" + "\n"
					+ "4. Samsung" + "\n"
					+ "5. iPhone" + "\n");
			int category1 = scanner.nextInt();
			ProductTypes productTypes1 = null;
			switch (category1) {
			case 1:
				productTypes1 = ProductTypes.CANDY;
				break;
			case 2:
				productTypes1 = ProductTypes.BOOK;
				break;
			case 3:
				productTypes1 = ProductTypes.FOOD;
				break;
			case 4:
				productTypes1 = ProductTypes.Samsung;
				break;
			case 5:
				productTypes1 = ProductTypes.iPhone;
				break;
			}
			System.out.println("Enter id Product: ");
			int id1 = scanner.nextInt();
			
			System.out.println("Enter cost Product");
			Double cost1 = scanner.nextDouble();
			
			manager.edit(name1, productTypes1, id1, cost1);
			System.out.println("Edit by name succes!!!");
			break;
		case SORT_BY_ID:
			manager.sort(SORT_BY_ID);
			System.out.println("Sort by Id succes!!!");
			break;
		case SORT_BY_COST: 
			manager.sort(SORT_BY_COST);
			System.out.println("Sort by cost succes!!!");
			break;
		case SORT_BY_NAME: 
			manager.sort(SORT_BY_NAME);
			System.out.println("Sort by name succes!!!");
			break;
		case SEARCH_BY_ID: 
			System.out.println("Enter Id");
			System.out.println(manager.search(scanner.nextInt()).toString());
			System.out.println("Search by ID succes!!!");
			break;
		case SEARCH_BY_NAME: 
			System.out.println("Enter Name");
			System.out.println(manager.search(scanner.next()).toString());
			System.out.println("Search by name succes!!!");
			break;
		case DISLAY_PRODUCT:
			System.out.println("List all Product in my stocke: ");
			dislay();
			break;
		case EXIT_PROGRAM: 
			System.out.println("Save and Exit Program");
			break;
		default:
			System.out.println("non funtion your manager");
		}
	}

	@Override
	public void dislay() {
		for (Object object : manager.getList()) {
			System.out.println(object.toString());
		}
	}
	public ManagerProduct getManager() {
		return manager;
	}
}

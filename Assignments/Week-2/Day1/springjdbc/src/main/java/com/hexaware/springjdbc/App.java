package com.hexaware.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc.config.AppConfig;
import com.hexaware.springjdbc.model.Product;
import com.hexaware.springjdbc.service.ProductServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    // Define scanner as a class variable
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductServiceImpl service = context.getBean(ProductServiceImpl.class);
        boolean flag = true;

        while (flag) {
            System.out.println("****WELCOME ***");
            System.out.println("1. INSERT");
            System.out.println("2. UPDATE");
            System.out.println("3. DELETE");
            System.out.println("4. SELECT BY ID");
            System.out.println("5. SELECT ALL");
            System.out.println("6. EXIT");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Product product = readData();
                    boolean booleanIsInserted = service.createProduct(product);
                    if (booleanIsInserted) {
                        System.out.println("Record inserted");
                    } else {
                        System.out.println("Record is not Inserted.");
                    }
                    break;
                case 2:
                    // Add your update logic here
                	Product product1 = readData();
                    boolean booleanIsUpdated = service.updateProduct(product1);
                    if (booleanIsUpdated) {
                        System.out.println("Record Updated");
                    } else {
                        System.out.println("Record is not Updated.");
                    }
                	
                    break;
                case 3:
                    // Add your delete logic here
                	System.out.println("Enter Product Id");

    				int pid = scanner.nextInt();

    				boolean isDeleted = service.deleteProductByID(pid);

    				if (isDeleted) {
    					System.out.println("Record Deleted successfully...");
    				} else {

    					System.err.println("Delete fail");
    				}
                    break;
                case 4:
                    // Add your select by ID logic here
                	System.out.println("Enter Product Id");

    				int pid1 = scanner.nextInt();

    				Product productFound = service.selectProductByID(pid1);

    				if (productFound != null) {
    					System.out.println(productFound);
    				} else {

    					
    							// throw  new ProductNotFoundExp();
    					System.err.println("Product Not Found");
    				}
                	
                    break;
                case 5:
                    // Add your select all logic here
                	List<Product>  list =		service.selectAllProducts();
					
					for (Product prod : list) {
						
							System.out.println(prod);
						
					}
                    break;
                case 6:
                    flag = false;
                    System.out.println("Thank You, Visit again!");
                    break;
                default:
                    break;
            }
        }
    }

    public static Product readData() {
        Product product = new Product();
        System.out.println("Enter ProductID:");
        product.setProductID(scanner.nextInt());
        System.out.println("Enter ProductName:");
        product.setProductName(scanner.next());
        System.out.println("Enter Price:");
        product.setPrice(scanner.nextDouble());
        return product;
    }
}

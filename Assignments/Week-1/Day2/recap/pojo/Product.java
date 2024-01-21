package pojo;

import java.util.Objects;

public class Product{
	private int ProductID;
	private String ProductName;
	private double ProductPrice;
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}
	public Product(int productID, String productName, double productPrice) {
		super();
		ProductID = productID;
		ProductName = productName;
		ProductPrice = productPrice;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [ProductID=" + ProductID + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ProductID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return ProductID == other.ProductID;
	}

	

}

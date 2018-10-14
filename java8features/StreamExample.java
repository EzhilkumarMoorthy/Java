package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product
{
	int productId 		= 0;
	String productName  = "";
	int productPrice    = 0;
	
	Product(int productId,String productName,int productPrice)
	{
		this.productId		= productId;
		this.productName 	= productName;
		this.productPrice 	= productPrice;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public String toString()
	{
		return "productId["+productId+"] productName["+productName+"] productPrice["+productPrice+"]";
	}
	
}
/*
 * 1. Stream doesn't store the elements. It simply conveys the data(Collection,Array, I/O channel,etc..) through a pipe line to perform operations such as filter,count,collect,etc.. 
 * 2. It performs lazy evaluation, will perform operation only when it required
 * 3. Which is used to filter,count,collect,print and convert one data structure to another (list -> set,map)
 * 4. Operation performed on stream doesn't modify the source instead it creates a new stream
 * 5. The elements in a stream are visited only once during life cycle of a stream as like an Iterator. We need to revisit the same elements to generate the stream again . 
 * 
 * */
public class StreamExample {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"aaa",100));
		productList.add(new Product(2,"bbb",200));
		productList.add(new Product(3,"ccc",300));
		productList.add(new Product(4,"ddd",400));
		productList.add(new Product(5,"eee",500));
		
		Stream<Product> filteredList = productList.stream().filter( a -> a.productPrice > 200);
		Stream<Product> filteredListCnt = productList.stream().filter( a -> a.productPrice > 200); // Look at point5  
		
		boolean allMatchList = productList.stream().allMatch( a -> a.productPrice > 50); //Returns true if all the product price is greater 50
		boolean anyMatchList = productList.stream().anyMatch( a -> a.productPrice > 50); //Returns true if any of the product price is greater 50
		System.out.println("allMatchList["+allMatchList+"] anyMatchList["+anyMatchList+"]");
				
		filteredList.forEach( a -> {System.out.println(a);});
		System.out.println(filteredListCnt.count());

	}

}

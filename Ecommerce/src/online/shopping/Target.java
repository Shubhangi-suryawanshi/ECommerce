package online.shopping;

import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		sc.nextInt();
		System.out.println("Enter first name");
		sc.next();
		System.out.println("Enter last name");
		sc.next();
		System.out.println("Enter Address");
		sc.next();
		System.out.println("Enter contact no");
		sc.nextInt();
		Customer c=new Customer();
		c.showdata();
		
		
		Product p=new Product();
		p.getproduct();
		Item i=new Item();
		i.getItemId();
		i.getItemName();
		i.getPrice();
				
		
		ShoppingCart sp=new ShoppingCart();
		sp.addcard();
		sp.removecart();
		sp.getcart();
		sp.confirm();
		
		Order o=new Order();
		o.updateOrder();
		o.cancelOder();
		o.placeOrder();
		
		sc.close();
		

	}

}

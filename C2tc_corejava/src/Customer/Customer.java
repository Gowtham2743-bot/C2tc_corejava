package Customer;

public class Customer {
	
	private int customerId;
	private String customerName;
	
	
	public Customer(int customerId,String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		
		
	}
	
	public Customer() {
		
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void displayCustomer() {
		
		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + customerName);

	}
	
	public static void main (String[] args) {
		
		Customer customer1 = new Customer(101, "Indian");
		customer1.displayCustomer();
		
		Customer customer2 = new Customer();
		customer2.setCustomerId(102);
		customer2.setCustomerName("Indresh");
		customer2.displayCustomer();
	}

}

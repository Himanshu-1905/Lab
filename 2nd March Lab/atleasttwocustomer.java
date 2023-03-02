
public class atleasttwocustomer {
public static void main(String[] args) { // main class
	//creating instance of the encapsulated class  
	customer c = new customer(); //object
	
	c.setAccountNumber(7435845344L);
	c.setAccountName("Himanshu");
	c.setAccountBalane(50000);
	c.setWithdrawAmount(2000);
	
	System.out.println("First Account Number is: "+c.getAccountNumber());
	System.out.println("Account Name is: "+c.getAccountName());
	System.out.println("Account Balane is: "+c.getAccountBalane());
	System.out.println("Withdraw Amount is: "+c.getWithdrawAmount());
	
	c.setAccountNumber1(8635845344L);
	c.setAccountName1("Jatin");
	c.setAccountBalane1(100000);
	c.setWithdrawAmount1(4000);
	
	System.out.println("Second Account Number is: "+c.getAccountNumber1());
	System.out.println("Account Name is: "+c.getAccountName1());
	System.out.println("Account Balane is: "+c.getAccountBalane1());
	System.out.println("Withdraw Amount is: "+c.getWithdrawAmount1());
}
}

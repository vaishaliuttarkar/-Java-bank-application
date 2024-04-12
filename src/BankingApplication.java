import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount("Vaishali Uttarkar" , "VSG889999");
		b.show();

	}

}

class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
  BankAccount(String cname, String cId) //Constructor to print welcome the customer initially with their name and id.
  {
	  customerName = cname;
	  customerId = cId;
  }
	
	void deposit(int amount) 
	{
		if(amount != 0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
    }
	
	void withDraw(int amount) 
	{
		if(amount != 0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
    }
	
	void getpreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited: " +previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("With-Draw: " +Math.abs(previousTransaction)); //Math.abs will give u the specific result in numbers.
		}
		else
		{
			System.out.println("No Transactions");
		}
	}
	
	void show()
	{
		char option = '\0';
		Scanner s =  new Scanner(System.in);
		System.out.println("Welcome " +customerName);
		System.out.println("Your ID is: " +customerId);
		System.out.println("\n");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposite");
		System.out.println("3. Withdraw");
		System.out.println("4. Previous Transaction");
		System.out.println("5. Exit");
		
		do
		{
			System.out.println("*********************************************************************************");
			System.out.println("Enter Your Option: ");
			System.out.println("*********************************************************************************");
			option = s.next().charAt(0);
			System.out.println("\n");
			
			  switch(option)
			  {
			  case '1':
			      System.out.println("Your Balance is: " +balance);
			      System.out.println("\n");
			      break;
			  
			  case '2':
				  System.out.println("Enter the amount to deposit: ");
				  int amount = s.nextInt();
				  deposit(amount);
				  System.out.println("\n");
				  break;
				  
			  case '3':
				  System.out.println("Enter an amount to Withdraw: ");
				  int amountw = s.nextInt();
				  withDraw(amountw);
				  System.out.println("\n");
				  break;
				  
			  case '4':
				  getpreviousTransaction();
				  System.out.println("\n");
				  break;
				  
			  case '5':
				  System.out.println("**********************************************************************");
				  break;
			
			  default:
				  System.out.println("Invalid option! Please try again");
				  break;
			  }
		}
		while(option != '5');
		{
			System.out.println("Thank you for using our services.");
		}
	}
	
}
import java.util.Scanner;
class Account
{
	String customerName;
	int accNum;
	String accType;
	double balance;
	Account(String customerName, int accNum, String accType, double balance){
		this.customerName=customerName;
		this.accNum=accNum;
		this.accType=accType;
		this.balance=balance;
	}
	void deposit(double amount){
		if(amount>0){
			balance += amount;
			System.out.println("Succesfully deposited :"+amount);
		}
		else{
			System.out.println("Invalid Amount !");
		}
	}
	void displayDetails(){
		System.out.println("Name : "+customerName);
		System.out.println("Account Number : "+accNum);
		System.out.println("Account Type : "+accType);
		System.out.println("Account Balance : "+balance);
	}
}
class Savacc extends Account
{
	private static final double interest=0.04;
	Savacc(String customerName, int accNum, double balance){
		super(customerName, accNum, "Savings", balance);
		System.out.println("Cheque Book Facility not available");

	}
	void computeInterest(){
		double interest_amount=balance*interest;
		deposit(interest_amount);
		System.out.println("Interest Deposited is "+interest_amount);
	}
	void withdraw(double amount){
		if(amount>0 && amount<=balance){
			balance -= amount;
			System.out.println("Successfully withdrew : "+amount);
			System.out.println("Updated balance : "+balance);
		}else{
			System.out.println("Insufficient Funds or Invalid entry !");
		}
	}
}
class Curacc extends Account
{
	private static final double minimum_balance=500.0;
	private static final double penalty=50.0;
	Curacc(String customerName, int accNum, double balance){
		super(customerName, accNum, "Current", balance);
		System.out.println("Cheque Book Facility available");
	}
	void checkMinimumBalance(){
		if(balance<minimum_balance){
			balance -= penalty;
			System.out.println("Your account balance is less than minimum balance : "+minimum_balance);
			System.out.println("Penalty levied : "+penalty);
		}
	}
	void withdraw(double amount){
		if(amount>0 && amount<=balance){
			balance -= amount;
			System.out.println("Successfully withdrew : "+amount);
			checkMinimumBalance();
		}else{
			System.out.println("Insufficient Funds or Invalid entry !");
		}
	}
}
public class Bank{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the customer name :");
		String name=s.next();
		System.out.println("Enter the Account Number :");
		int accNum=s.nextInt();
		System.out.println("Enter the Account Balance :");
		double balance=s.nextDouble();
		System.out.println("Select the Account type \n1.Savings \n2.Current");
		int opt=s.nextInt();
		boolean exit=false;
		if(opt==1){
			Savacc sav=new Savacc(name, accNum, balance);
			while(!exit){
				System.out.println("-------MENU-------");
				System.out.println("1.Deposit \n2.Withraw \n3.Compute Interest \n4.Display Details \n5.Exit");
				int choice=s.nextInt();
				switch(choice){
					case 1:
						System.out.println("Enter the deposit amount");
						double amount=s.nextDouble();
						sav.deposit(amount);
						break;
					case 2:
						System.out.println("Enter the withdrawal amount");
						double w_amount=s.nextDouble();
						sav.withdraw(w_amount);
						break;
					case 3:
						sav.computeInterest();
						break;
					case 4:
						sav.displayDetails();
						break;
					case 5:
						exit=true;
				}
			}
		}
		else if (opt==2){
			Curacc cur=new Curacc(name, accNum, balance);
			while(!exit){
				System.out.println("-------MENU-------");
				System.out.println("1.Deposit \n2.Withraw \n3.Compute Interest \n4.Display Details \n5.Exit");
				int choice=s.nextInt();
				switch(choice){
					case 1:
						System.out.println("Enter the deposit amount");
						double amount=s.nextDouble();
						cur.deposit(amount);
						break;
					case 2:
						System.out.println("Enter the withdrawal amount");
						double w_amount=s.nextDouble();
						cur.withdraw(w_amount);
						break;
					case 3:
						System.out.println("Cannot Compute Interest for Current Account");
						break;
					case 4:
						cur.displayDetails();
						break;
					case 5:
						exit=true;
				}
			}
		}
		System.out.println("Kushal Naidu N \n 24BECS408");
	}
}
			

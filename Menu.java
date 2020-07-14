/*
 * Madison Price
 * 7/13/2020
 * Menu.java
 *
 */



package account;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

	public class Menu extends Account {
		Scanner menuInput = new Scanner(System.in);
		
		DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		
		
		public void getLogin() throws IOException {
			int x = 1;
			
			do {
				try {
					
					data.put(1234, 4321);
					data.put(5678, 1890);
					
					System.out.println("Welcome to the ATM!");
					
					System.out.println("Enter your Customer Number:");
					setCustomerNumber(menuInput.nextInt());
					
					System.out.println("Enter your Pin Number");
					setPinNumber(menuInput.nextInt());
				} catch (Exception e) {
					
					System.out.println("\n" + "Invalid Character(s). Only numbers" + "\n");
					x = 2;
				
				}
				
				for (Entry<Integer , Integer> entry : data.entrySet()) {
					if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()){
						getAccountType();
						
					}else {
					System.out.println("\n" + "Wrong Customer or Pin Number" + "\n");
					}
				}
					
					
				
				}while (x == 1);
			
			}
			public void getChecking() {
				System.out.println("Checking Account:");
				System.out.println("Type 1 - View Balance");
				System.out.println("Type 2 - Withdraw Funds");
				System.out.println("Type 3 - Deposit funds");
				System.out.println("Type 4 - Exit");
				System.out.print("Choose");
				// create selection variable
				int selection = menuInput.nextInt();
				
				
				/*
				 * Switch statement to create 
				 * Different options for inputs 1 through 4
				 * Calls on functions from Account.java
				 */
				switch(selection) {
				
				case 1:
					System.out.println("Checking Account Balance:" + moneyFormat.format(getCheckingBalance()));
					getAccountType();
					break;
					
				case 2:
					getCheckingWithdrawInput();
					getAccountType();
					break;
				
				case 3:
					getCheckingDepositInput();
					getAccountType();
					break;
				case 4:
					System.out.println("Thanks For Using This ATM Bye!");
					break;
				default:
					System.out.println("\n" + "Invalid Choice" + "\n");
					getAccountType();
					
					
					
				
				}
				
				

			}
			
		
		
			//Ask user which account they want to access


		public void getAccountType() {
			System.out.println("Select the Account you want access to");
			System.out.println("Type 1 - Checking Account");
			System.out.println("Type 2 - Saving Account");
			System.out.println("Type 3 - Exit");
			System.out.print("Choose");
			
			 int selection = menuInput.nextInt();
			
			switch(selection) {
			
			case 1:
				getChecking();
				break;
				
			case 2:
				getSaving();
				break;
			case 3:
				System.out.println("Thanks For Using This ATM Bye!");
				break;
			default:
				System.out.println("\n" + "Invalid Choice" + "\n");
				getAccountType();
			}
			
		}
		// getting savings account as requested by user

		public void getSaving() {
		System.out.println("Checking Account:");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choose");
		
		int selection = menuInput.nextInt();
		
		switch(selection) {
		// getting checking as account requested by user
		case 1:
			System.out.println("Checking Account Balance:" + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thanks For Using This ATM Bye!");
			break;
		default:
			System.out.println("\n" + "Invalid Choice" + "\n");
			getAccountType();
			
			
			
		
		}
			
		}
		
	}
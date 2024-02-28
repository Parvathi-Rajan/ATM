import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		System.out.println("Select your option\n ");
		System.out.println("1- Savings\n2- Current\n3- FD");
		
		Scanner num = new Scanner(System.in);
		int option = num.nextInt();
		
		
		//main switch
		
		switch (option) {
		
		//case1
		
		case 1:
			System.out.println("Select your option\n");
			System.out.println("1- Withdraw\n2-Statement\n3-Balance");
			Scanner num1 = new Scanner(System.in);
			int option1 = num1.nextInt();
			
			//Switch-Savings

			switch (option1) {
			case 1:
				System.out.println("Collect your CASH");
				break;
			case 2:
				System.out.println("Statement will be sent to your E-Mail");
				return;
			case 3:
				System.out.println("Balance amount: 10000 USD");
				break;
				
				//Case2 

			}
		case 2:
			System.out.println("Select your option");
			System.out.println("1-withdraw\n2-Statement\n3-Balance");
			Scanner num2 = new Scanner(System.in);
			int option2 = num2.nextInt();
			
			// Switch-Current
			
			switch (option2) {
			case 1:
				System.out.println("Collect your CASH");
				break;
			case 2:
				System.out.println("Statement will be sent to your E-Mail");
				break;
			case 3:
				System.out.println("Balance amount: 100000 USD");
				break;
				
				//case3- FD
			}

		case 3:
			System.out.println(" FD Amount: 1000000 USD ");
			break;

		}

	}

}

import java.util.Scanner;  
public class ATMInterface {

	public static void main(String[] args) {
		
		  int balance = 0, withdraw, deposit;  
		          
		      Scanner sc = new Scanner(System.in);  
		          
		        while(true)  
		        {  
		            System.out.println("ATM\n");  
		            System.out.println("Choose 1 for Withdraw\n");  
		            System.out.println("Choose 2 for Deposit\n");  
		            System.out.println("Choose 3 for Check Balance\n");  
		            System.out.println("Choose 4 for EXIT\n");  
		            System.out.print("Choose the operation you want to perform:");  
		              
		            int choice = sc.nextInt();  
		            switch(choice)  
		            {  
		case 1:  
		        System.out.print("Please enter money to be withdrawn:");  
		                      
		         withdraw = sc.nextInt();  
		                      
		        if(balance >= withdraw)  
		        {  
		            balance = balance - withdraw;  
		            System.out.println("Please collect your money");  
		        }  
		        else  
		        {  
		            System.out.println("Insufficient Balance");  
		        }  
		        System.out.println("");  
		        break;  
		   
		 case 2:  
		                      
		        System.out.print("Please enter money to be deposited:");  
		                      
		        deposit = sc.nextInt();  
		        balance = balance + deposit;  
		        System.out.println("Your Money has been successfully depsited");  
		        System.out.println("");  
		        break;  
		   
		case 3:  
		        System.out.println("Your Balance : "+balance);  
		        System.out.println("");  
		        break;  
		   
		 case 4:  
		       
		        System.out.println("Thank You!");
		        System.exit(0);
		 
		            }  
		        }  
		    }  
		
	}
import java.util.Scanner;  
//These code are for the bank account class 
public class Account{

    private int account_number;
    private double balance;
    private String customer_name;
    private String email;
    private int phone_number;
    private int ssn;

    public Account(){
        account_number=123456789;
        balance=50.0;
        customer_name="Rex";
        email="yuanx5@gmail.com";
        phone_number=818263213;
        ssn=123456789;
    }
    public Account(int account_number,double balance,String customer_name,String email,int phone_number,int ssn){
        this.account_number=account_number;
        this.balance=balance;
        this.customer_name=customer_name;
        this.email=email;
        this.phone_number=phone_number;
        this.ssn=ssn;
    }
    Scanner scanner = new Scanner(System.in);
    public void deposit(double amount){
        balance+=amount;
        System.out.println("You have deposited $"+Double.toString(amount));
    }
    //This function withdraw a certain amount of balance for the user if the user has sufficient funding, otherwise it will keep prompoting the user to enter a valid amount 
    public void withdraw(double amount){
        while(amount>balance){
            System.out.println("You do not have enough balance");
            System.out.println("Please enter a valid number");
            double amount1=scanner.nextDouble();
            amount=amount1;
        }
        balance-=amount;
        System.out.println("You have withdrawn $"+Double.toString(amount));

    }
    //This function prints the info of account user 
    public void printinfo(){
        System.out.println("The user's account name is "+customer_name);
        System.out.println("The user's balance is "+balance);
        System.out.println("The user's email is "+email);
        System.out.println("The user's account_number is "+account_number);
        System.out.println("The user's phone_number is "+phone_number);

    }
    //This function prints out the balance of the user
    public void showbalance(){
        System.out.println(balance);
    }
    //It repeats the steps for user until he/she decides to exit 
    public String repeat(){
        System.out.println("Please enter one of the following commands: withdraw, deposit, info or exit " );
        String command=scanner.next();
        return command;
    }
    
    //This is the function that decides what actions need to be done depending on the user's command
    public void whichcommand(String command, Account account ){
        while (!command.equals("exit")){
            if (command.equals("withdraw"))
            {
                System.out.println("Please enter the amount that you want to withdraw");
                Double amonunt=scanner.nextDouble();
                account.withdraw(amonunt);

                command=account.repeat();
                
            }
            else if (command.equals("deposit"))
            {
                System.out.println("Please enter the amount that you want to deposit");
                Double amonunt=scanner.nextDouble();
                account.deposit(amonunt);
                command=account.repeat();
                
            }
            else if (command.equals("info"))
            {   
                System.out.println("Here are your info");
                account.printinfo();
                command=account.repeat();

            }
            else{
                System.out.println("Please enter a valid commmand");
                command=account.repeat();
            }
        }
        System.out.println("You have exited the program ");
        


    }
    
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public Scanner getScanner() {
		return scanner;
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
};


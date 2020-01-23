public class Investments_account extends Account{

    //This is the class of investment account 
    public Investments_account(){
        super();
    }

    public Investments_account(int account_number,double balance,String customer_name,String email,int phone_number,int ssn){
        super.setAccount_number(account_number);
        super.setCustomer_name(customer_name);
        super.setEmail(email);
        super.setPhone_number(phone_number);
        super.setSsn(ssn);
        while(balance<5000){
            System.out.println("You can not create an under with less than 5000 dollars ");
            System.out.println("Please enter a valid amount for balance");
            double amount1=scanner.nextDouble();
            balance=amount1;
        }
        super.setBalance(balance);

    }
    public void withdraw(double amount){
        while(amount>super.getBalance() || amount>1000 ){
            System.out.println("You do not have enough balance or you have withdrawn more than 1000  dollars ");
            System.out.println("Please enter a valid number");
            double amount1=scanner.nextDouble();
            amount=amount1;
        }
        super.setBalance(super.getBalance()-amount) ;
        System.out.println("You have withdrawn $"+Double.toString(amount));

    }
    public void deposit(double amount){
        while(amount+super.getBalance()>1000000 ){
            System.out.println("There is a limitation on the maximum balance--$1000000 you can store in this account");
            System.out.println("Please enter a valid number");
            double amount1=scanner.nextDouble();
            amount=amount1;
        }
        super.setBalance(super.getBalance()+amount) ;
        System.out.println("You have deposited $"+Double.toString(amount));
    }
}
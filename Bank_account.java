import java.util.Scanner;  
//These code are for the bank account class 
public class Bank_account{
    int account_number=123456789;
    double balance=50.0;
    String customer_name="Rex";
    String email="yuanx5@gmail.com";
    int phone_number=818263213;
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
    //It repeats the steps for user until he/she decides to exit 
    public String repeat(){
        System.out.println("Please enter one of the following commands: withdraw, deposit, get info or exit " );
        String command=scanner.next();
        return command;
    }
    //This is the function that decides what actions need to be done depending on the user's command
    public void whichcommand(String command, Bank_account account ){
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
            else if (command.equals("get info"))
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
    public static void main (String[] args){
        //The class uses the whichcommand method to guide the user to select a certain command and then decides what to do with the command
        Bank_account rex_account=new Bank_account();
        System.out.println("please enter one of the following commands: withdraw, deposit, get info or exit " );
        Scanner scanner2 = new Scanner(System.in);
        String command =scanner2.next();
        rex_account.whichcommand(command, rex_account);

    }
};


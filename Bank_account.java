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
    }
    public void withdrawal(double amount){
        if (amount>balance){
            System.out.println("Sorry, your account lacks of funding");
        }
        else{
            balance-=amount;
        }

    }
    public void printinfo(){
        System.out.println("The user's account name is "+customer_name);
        System.out.println("The user's balance is "+balance);
        System.out.println("The user's email is "+email);
        System.out.println("The user's account_number is "+account_number);
        System.out.println("The user's phone_number is "+phone_number);

    }
    public void whichcommand(String command, Bank_account account ){
        switch (command){
            case "withdrawal":
            {
                System.out.println("Please enter the amount that you want to withdraw");
                Double amonunt=scanner.nextDouble();
                account.withdrawal(amonunt);
                break;
            }
            case  "deposit":
            {
                System.out.println("Please enter the amount that you want to deposit");
                Double amonunt=scanner.nextDouble();
                account.deposit(amonunt);
                break;
            }
            case "print user info":
            {   
                System.out.println("Here are your info");
                account.printinfo();
                break;

            }
            case "exit":
            {
                System.out.println("You have exited");
                break;
            }
            default:
            {
                System.out.println("Sorry, you did not enter a valid command, googbye");
                break;
            }

        }
    }
    public static void main (String[] args){
        Bank_account rex_account=new Bank_account();
        System.out.println("please enter one of the following commands: withdrawal, deposit, print user info or exit " );
        Scanner scanner2 = new Scanner(System.in);
        String command =scanner2.next();
        rex_account.whichcommand(command, rex_account);

    }
};


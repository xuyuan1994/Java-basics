import java.util.Scanner;  
//These code are for the bank account class 
public class Bank_account{
    int account_number=123456789;
    double balance=50.0;
    String customer_name="Rex";
    String email="yuanx5@gmail.com";
    int phone_number=818263213;
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdrawal(double amount){
        if (amount>balance){
            System.out.println("Sorry, your lack of funding");
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
    public void whichcommands(String command ){
        switch (command){
            case "withdrawal":
            {

            }
        }
    }
    public static void main (String[] args){
        Bank_account rex_account=new Bank_account();
        rex_account.printinfo();
        rex_account.withdrawal(100);
        rex_account.withdrawal(40);
        rex_account.deposit(100);
        System.out.println("after some deposits and withdrawals");
        rex_account.printinfo();

    }
};


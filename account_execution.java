import java.util.Scanner;  

public class account_execution {
    public static void main (String[] args){
        //This class test all 4 accounts
        Investments_account checking=new Investments_account(23131,40,"Rex","email",111111111,1231231);
        System.out.println("please enter one of the following commands: withdraw, deposit, info or exit " );
        Scanner scanner1 = new Scanner(System.in);
        String command =scanner1.next();
        checking.whichcommand(command, checking);
}
}
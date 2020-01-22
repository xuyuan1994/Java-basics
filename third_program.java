import java.util.Scanner;  
public class third_program{
    public static void main (String[] args){
        //This section is to get the sum between a starting and end number entered by the user
        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter a starting number");
        int start = myObj.nextInt();
        System.out.println("please enter a ending number");
        int end = myObj.nextInt();
        int sum=0;
        int sum1=0;
        for (int i=start+1;i<end;i++){
            sum+=i;
            System.out.println(i);
        }
        System.out.println("The sum is "+Integer.toString(sum));
        //This part is for getting odd, even number and sum between 6 to 15
        for (int i=6;i<=15;i++){
            sum1+=i;
            if (i%2==1){
                System.out.println("This is an odd number"+Integer.toString(i));
            }
            else {
                System.out.println("This is an odd number"+Integer.toString(i));
            }
        
        }
        System.out.println("The sum is "+Integer.toString(sum1));

}}
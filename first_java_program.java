
import java.util.Scanner;  
//This class is for variable declaration and some simple calculations
public class first_java_program{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the next number");
        Double weight = scanner.nextDouble();
        double weight_in_kg=weight*0.453592;
        System.out.println(Double.toString(weight)+" pound is equal to "+Double.toString(weight_in_kg)+" kg");
    }
}


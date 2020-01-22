
import java.util.Scanner;  

public class second_java{
    //This part of code is about basic structure of a class
    public static void main (String[] args){
        double first_num=20;
        double second_num=80;
        double sum_of_two_num=(first_num+second_num)*3;
        System.out.println("the result is " +Double.toString(sum_of_two_num));
        double remainder=sum_of_two_num%40;
        if (remainder>20){
            System.out.println("Total is over the limit");
        }
        else{
            System.out.println("Total is within the limit");
        }
        int test1=1;
        switch(test1){
            case 0:
                System.out.println(test1);
                break;
            case 1: 
                System.out.println(test1);
        }
        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter a vacabulary");
        char first_letter = Character.toUpperCase(myObj.next().charAt(0));
        switch (first_letter){
            case 'A':
                System.out.println("apple");
                break;
            case 'B':
                System.out.println("banana");
                break;
            case 'C':
                System.out.println("Cherries");
                break;
            case 'D':
                System.out.println("Dragon Fruit");
                break;
            case 'E':
                System.out.println("ElderBerry");
                break;
            default:
                System.out.println("Not in the basket");
                break;
            
        }
    }
}


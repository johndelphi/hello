
/*
john muema michael 
proffesor:jennifer marquez
cosc-2436 2801 
***Write a java program that outputs the following code when given the following input. You can use Scanner or GUI, your choice. 

Sample Input in Italics.  Sample Output in Bold. 

Hello, what is your name?   Jennifer

Nice to meet you, what is your weekly salary?   400

Thank you Jennifer, we will increase your weekly salary by 50 dollars. Your new weekly salary is: $450.00. ***
*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        //Ask the users name on console
        System.out.println("Hello,what is your name?");
        // create a scanner object
       Scanner input = new Scanner(System.in);
       // assign memory for name and get it from scanner
       String name = input.nextLine();
       // ask the person how much they make in a week *used string concatination
       System.out.println("Nice to meet you "+name+"! what is your weekly salary?");
       double Pay =input.nextDouble();
       System.out.println("Thank you "+name+", we will increase your salary by 50$.");
       double totalPay=(Pay+50);
       System.out.print("Your new Weekly Salary "+ totalPay);
  
       
    }
}

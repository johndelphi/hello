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

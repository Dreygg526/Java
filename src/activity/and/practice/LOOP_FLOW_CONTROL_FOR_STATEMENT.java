
package activity.and.practice;
import java.util.Scanner;
public class LOOP_FLOW_CONTROL_FOR_STATEMENT {
    public static void main(String[] args){
        
     //ROAN ANDREI D. USON
     //BSCPE 2-1
     //ACTIVITY IN LOOP FLOW CONTROL PART 1
     
     Scanner keyboard = new Scanner(System.in);
     int num1;
     int num2;
     System.out.println("Enter the first number : ");
     num1 = keyboard.nextInt();
     System.out.println("Enter the second number : ");
     num2 = keyboard.nextInt();
     System.out.println("Printing these two number, 10 times: ");
     
             
     for(int var = 0; var < 10; var++)// yung "var" ay bait lang yan para mag loop yung loob ng for statement
     {
        
        System.out.print(num1 + "     ");
        System.out.print(num2);
        System.out.println();
        
        
         
     }
    }
    
}

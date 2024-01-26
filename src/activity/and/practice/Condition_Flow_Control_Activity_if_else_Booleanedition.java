
package activity.and.practice;

import java.util.Scanner;
public class Condition_Flow_Control_Activity_if_else_Booleanedition {
     public static void main(String[] args){
         
         //ROAN ANDREI D. USON
         //BSCPE 2-1
         //Condition flow control activity 1 part 2
         
         
         Scanner keyboard = new Scanner(System.in);
         int value1;
         int value2;
         
         System.out.println("Enter the first value :");
         value1 = keyboard.nextInt();
        
         System.out.println("Enter the second value :");
         value2 = keyboard.nextInt();
         
         if(value1 > value2)
         {
           System.out.println(value1 + " is greater than " + value2);
         }
         else if (value1 < value2)
         {
           System.out.println(value1+ " is less than " + value2);
         }
         
         else if (value1 == value2)
         {
           System.out.println(value1 + " is equivalent to " + value2);
         }
         else
         {
             System.out.println("Please input numbers only. ");
         }
     }
}

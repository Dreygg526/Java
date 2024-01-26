
package activity.and.practice;
import java.util.Scanner;
public class Condition_Flow_Control_Activity_If_else_simple {
     public static void main(String[] args)
     {
         //ROAN ANDREI D. USON
         //BSCPE 2-1
         //Condition flow control activity 1 part 1
         System.out.println("");
         System.out.println("Enter the letter: ");
         Scanner keyboard = new Scanner(System.in);
         String vowel1;
         
         vowel1 = keyboard.nextLine();
         if(vowel1.toLowerCase().equals("a")||vowel1.toLowerCase().equals("e")||vowel1.toLowerCase().equals("i")||vowel1.toLowerCase().equals("o")||vowel1.toLowerCase().equals("u"))
         {
          System.out.println(vowel1 + " is vowel");   
         }
         else
         {
          System.out.println(vowel1 + " is not a vowel");
         }
     }    
    
}

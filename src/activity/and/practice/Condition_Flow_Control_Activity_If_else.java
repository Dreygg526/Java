
package activity.and.practice;
import java.util.Scanner;
public class Condition_Flow_Control_Activity_If_else {

    //ROAN ANDREI D. USON
    //BSCPE 2-1
    //Condition flow control activity 1 part 1
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       
        String output;
        System.out.println("Vowel Detector");
        System.out.println("");
        System.out.println("");
       System.out.println("Enter the vowel : ");
       output = keyboard.nextLine();
       
       if(output.toLowerCase().equals("a")||output.toLowerCase().equals("e")||output.toLowerCase().equals("i")||output.toLowerCase().equals("o")||output.toLowerCase().equals("u"))
       {
          System.out.print(output + " is a vowel.");
           
       }
       else if(Character.isDigit(output.charAt(0)))
       //The Character.isDigit and charAt is use for the numbers in which this case, to identify if the user input a number.
       {
           System.out.println(output + "  is a number.");
       }
       else if (output.length() == 1)
 // the meaning of lenght is it identify how many letters, numbers, etc of the given task, this case to avoid conflict of [a-zA-Z]
  //(continuation) I give the value for length which is 1, so if the user type only 1 letter and it is not vowel, it will execute.    
           
       {
           System.out.println(output + " is not a vowel.");
       }
       else if (output.matches("[a-zA-Z]+"))
// the meaning of matches is that whatever the user type even a sentence, as long as the input will go through to the condition 
//(continuation)which is([a-zA-z]+, it will execute.
// you need to add "+" in the end of your condition ([a-zA-Z]"+").    
       {
           System.out.println(output + " is compose of alphabets, not vowel.");
       }
       
       else
       {
        System.out.println("");
       }
           
        
    }
    
}

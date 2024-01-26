
package activity.and.practice;
import java.util.Scanner;
public class Condition_Flow_Control_Activity_if_else_NESTED {
     
    
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char vowel_1 = 'a';
        char vowel_2 = 'e';
        char vowel_3 = 'i';
        char vowel_4 = 'o';
        char vowel_5 = 'u';
        String output_hehe;
        System.out.println("Vowel detector");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter the vowel :");
        output_hehe = keyboard.nextLine();
        
        if(output_hehe.toLowerCase().equals ("a"))
        {
            System.out.println(vowel_1+ " is a vowel");
        }
        else if(output_hehe.toLowerCase().equals ("e"))
        {
            System.out.println(vowel_2+ " is a vowel");
        }
        else if(output_hehe.toLowerCase().equals ("i"))
        {
            System.out.println(vowel_3+ " is a vowel");
        }
        else if(output_hehe.toLowerCase().equals ("o"))
        {
            System.out.println(vowel_4+ " is a vowel");
        }
        else if(output_hehe.toLowerCase().equals ("u"))
        {
            System.out.println(vowel_5+ " is a vowel");
        }
        else if(Character.isDigit(output_hehe.charAt(0)))
        //The Character.isDigit and charAt is use for the numbers in which this case, to identify if the user input a number.    
        {
            System.out.println(output_hehe + " is a number, not a vowel");
        }
        else if(output_hehe.length()==1)
      // the meaning of lenght is it identify how many letters, numbers, etc of the given task, this case to avoid conflict of [a-zA-Z]
      //(continuation) I give the value for length which is 1, so if the user type only 1 letter and it is not vowel, it will execute.    
        {
            System.out.println(output_hehe + "  is not a vowel");
        }
        else if(output_hehe.matches("[a-zA-Z]+"))
         // the meaning of matches is that whatever the user type even a sentence, as long as the input will go through to the condition 
       //(continuation)which is([a-zA-z]+, it will execute.
       // you need to add "+" in the end of your condition ([a-zA-Z]"+").        
        {
          System.out.println("is compose of an Alphabet, not a vowel");
        }
        
        else
        {
            System.out.println("");
        }
     }
    
}

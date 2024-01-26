
package activity.and.practice;

import java.util.Scanner;
public class LOOP_FLOW_CONTROL_MULTIPLICATION_TABLE {
    public static void main(String[] args){
        
   Scanner keyboard = new Scanner(System.in);
   
     //ROAN ANDREI D. USON
     //BSCPE 2-1
     //ACTIVITY 2 IN LOOP FLOW CONTROL FACTORIAL PART 2

   
   int times = 11;
   int var = 1;
   int multiply;
   int total;
   
    System.out.println("MULTIPLICATION TABLE");
    System.out.println("What multiplication table do you want? ");
    System.out.println("");
    multiply = keyboard.nextInt();
    
    while(var < times)
    {
      total = multiply * var;   
      System.out.println(var + " x " + multiply + " = " + total);
       var++;
      
        
    }
       
    }
    
    
    
    
    
}

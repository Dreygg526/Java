
package activity.and.practice;

import java.util.Scanner;
public class LOOP_FLOW_CONTROL_FACTORIAL {
    public static void main(String[] args){
        
     //ROAN ANDREI D. USON
     //BSCPE 2-1
     //ACTIVITY 1 IN LOOP FLOW CONTROL FACTORIAL PART 1
     
     
     //FACTORIAL FORMULA!!!!!!! FIXED!!!!
     Scanner keyboard = new Scanner (System.in);
     
     int times;
     int var = 1;
     int total = 1;
     
     
     
     System.out.println("Enter a number: ");   
     times = keyboard.nextInt();
     System.out.println();
     
     while(var <= times)
     {
        total = total*var;
         var++;
       
     }         
      System.out.print("The factorial number is equal to "+ total);
     
    }
    
}

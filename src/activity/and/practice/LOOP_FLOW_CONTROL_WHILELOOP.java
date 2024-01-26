
package activity.and.practice;

import java.util.Scanner;
public class LOOP_FLOW_CONTROL_WHILELOOP {
     public static void main(String[] args){
         
     //ROAN ANDREI D. USON
     //BSCPE 2-1
     //ACTIVITY IN LOOP FLOW CONTROL PART 2
     
    Scanner keyboard = new Scanner (System.in);
       int grade;
       int var = 1;
       int entergrade;
       int average = 0;
       
      System.out.println("How many grades do you want ? ");
      grade = keyboard.nextInt();
      

      
      while(var < grade)
      {
          System.out.print(var + " Enter your grade : ");
          entergrade = keyboard.nextInt();
          System.out.println("");
          average = average + entergrade;
          var++;
          
// may "var++;" dahil stoppage sya ng loop, kada loop nadadagdagan ang "var" kaya kapag kapantay na sya ng  value ng grade
//*(continuation), it will lead to false meaning hihinto ang loop          
      }
         System.out.println(average/grade);
      
        
      
      
         
     }
    
}


package activity.and.practice;

import java.util.Scanner;
public class Condition_Flow_Control_House_edition{
    public static void main(String[] args)
    {
        
    //ROAN ANDREI D. USON
    //BSCPE 2-1
    //Condition flow control activity 2
        
        
        Scanner keyboard = new Scanner(System.in);
        String house;
        String garage;
        
        System.out.println(" Enter the type of house you want to purchase");
        System.out.println(" ");
        System.out.println("1. Single Family");
        System.out.println("2. Townhouse");
        System.out.println("3. Condominium");
        System.out.println("");
        
        
        house = keyboard.nextLine();
        System.out.println("");
        System.out.println("");
        if(house.toLowerCase().equals("single family")|| (house.equals("1"))|| (house.toLowerCase().equals("single")))
        { 
            System.out.println(" Enter the type of garage you want");
            System.out.println(" ");
            System.out.println("A. Doesn't matter");
            System.out.println("B. Interior");
            System.out.println("C. Exterior");
            System.out.println("");
      
            
            garage = keyboard.nextLine();
            System.out.println("");
            System.out.println("");
            if(garage.toLowerCase().equals("a")|| (garage.toLowerCase().equals("doesn't matter"))||(garage.toLowerCase().equals("doesnt matter"))||(garage.toLowerCase().equals("does not matter"))||(garage.toLowerCase().equals("1")))
            {
               System.out.println("Your choice for the house is SINGLE FAMILY and your choice for garage is DOESN'T MATTER" );
               System.out.println("");
               System.out.println("Kindly, please proceed to the registar to pay.");
            }
            else if(garage.toLowerCase().equals("b")|| (garage.toLowerCase().equals("interior"))||(garage.toLowerCase().equals("inter"))||(garage.toLowerCase().equals("2")))
            {
               System.out.println("Your choice for the house is SINGLE FAMILY and your choice for garage is INTERIOR " );
               System.out.println("");
               System.out.println("Kindly, please proceed to the registar to pay.");
            }
            else if(garage.toLowerCase().equals("c")|| (garage.toLowerCase().equals("exterior"))||(garage.toLowerCase().equals("exter"))||(garage.toLowerCase().equals("3")))
            {
               System.out.println("Your choice for the house is SINGLE FAMILY and your choice for garage is EXTERIOR " );
               System.out.println("");
               System.out.println("Kindly, please proceed to the registar to pay.");
            }
            else
            {
                System.err.println("Shutting down...Please insert the right word.");
            }
                
             
            
        }
        else if(house.toLowerCase().equals("townhouse")||(house.toLowerCase().equals("2"))||(house.toLowerCase().equals("town")))
                
        {
            System.out.println(" Enter the type of garage you want");
            System.out.println(" ");
            System.out.println("A. Doesn't matter");
            System.out.println("B. Interior");
            System.out.println("C. Exterior");
            System.out.println("");
      
            
            garage = keyboard.nextLine();
            System.out.println("");
            System.out.println("");
            
             if(garage.toLowerCase().equals("a")|| (garage.toLowerCase().equals("doesn't matter"))||(garage.toLowerCase().equals("doesnt matter"))||(garage.toLowerCase().equals("does not matter"))||(garage.toLowerCase().equals("1")))
            {
               System.out.println("Your choice for the house is TOWNHOUSE and your choice for garage is DOESN'T MATTER" );
               System.out.println("");
               System.out.println("Kindly, please proceed to the registar to pay.");
            }
            else if(garage.toLowerCase().equals("b")|| (garage.toLowerCase().equals("interior"))||(garage.toLowerCase().equals("inter"))||(garage.toLowerCase().equals("2")))
            {
               System.out.println("Your choice for the house is TOWNHOUSE and your choice for garage is INTERIOR " );
               System.out.println("");
               System.out.println("Kindly, please proceed to the registar to pay.");
            }
            else if(garage.toLowerCase().equals("c")|| (garage.toLowerCase().equals("exterior"))||(garage.toLowerCase().equals("exter"))||(garage.toLowerCase().equals("3")))
            {
               System.out.println("Your choice for the house is TOWNHOUSE and your choice for garage is EXTERIOR " );
               System.out.println("");
               System.out.println("Kindly, please proceed to the registar to pay.");
            }
            else
            {
                System.err.println("Shutting down...Please insert the right word.");
            }
        }
        else if(house.toLowerCase().equals("condominium")|| (house.equals("3"))|| (house.toLowerCase().equals("condo")))
        {
              System.out.println(" Enter the type of garage you want");
            System.out.println(" ");
            System.out.println("A. Doesn't matter");
            System.out.println("B. Interior");
            System.out.println("C. Exterior");
            System.out.println("");
      
            
            garage = keyboard.nextLine();
            System.out.println("");
            System.out.println("");
            
             if(garage.toLowerCase().equals("a")|| (garage.toLowerCase().equals("doesn't matter"))||(garage.toLowerCase().equals("doesnt matter"))||(garage.toLowerCase().equals("does not matter"))||(garage.toLowerCase().equals("1")))
            {
               System.out.println("Your choice for the house is CONDOMINIUM and your choice for garage is DOESN'T MATTER" );
               System.out.println("");
               System.out.println("Kindly, please proceed to the registar to pay.");
            }
            else if(garage.toLowerCase().equals("b")|| (garage.toLowerCase().equals("interior"))||(garage.toLowerCase().equals("inter"))||(garage.toLowerCase().equals("2")))
            {
               System.out.println("Your choice for the house is CONDOMINIUM and your choice for garage is INTERIOR " );
               System.out.println("");
               System.out.println("Kindly, please proceed to the registar to pay.");
            }
            else if(garage.toLowerCase().equals("c")|| (garage.toLowerCase().equals("exterior"))||(garage.toLowerCase().equals("exter"))||(garage.toLowerCase().equals("3")))
            {
               System.out.println("Your choice for the house is CONDOMINIUM and your choice for garage is EXTERIOR " );
               System.out.println("");
               System.out.println("Kindly, please proceed to the registar to pay.");
            }
            else
            {
                System.err.println("Shutting down...Please insert the right word.");
            }
        }
        else
        {
            System.err.println("Shutting down...Please insert the right word.");
        }
        
        
        
    }
    
}

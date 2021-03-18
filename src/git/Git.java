/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Athlon
 */
public class Git {
    Scanner sc= new Scanner (System.in);
    
    //Welcomes User
   public static void sayWelcome (){
       System.out.println("Welcome, User");
   }
   //Date of visit
    public void Date(){
           Calendar obj = Calendar.getInstance();
      Date date = obj.getTime();
      System.out.println("Current Date and time of your visit today is: "+date);
       }
   //Greets by name
   public void sayName(){
       System.out.println("Please enter your name: ");
       String name = sc.next();
       System.out.println("Hello, "+ name);
   }
        // Getting the Address
    public void address(){
	    System.out.println("Please enter your Address: ");
        String Address = sc.next();
        System.out.println("Address: "+ Address);
   }
        //Getting the contact number
    public void contactNumber(){
	    System.out.println("Please enter your Contact Number: ");
        int number = sc.nextInt();
        System.out.println("Contact Number: "+ number);
   }
      //Take out or Dine in choice
            public void Dine (){
       int choice = 0;
       System.out.println("Would you like to take out or dine in?");
       System.out.println("Press 1 for TAKE OUT. Press 2 for DINE IN");
       choice = sc.nextInt();
       switch (choice){
           case 1:
               System.out.println("You've chosen to take out");
               break;
           case 2:
               System.out.println("You've chosen to dine in");break;
           
      }
            }
           // Menu Choices
    public void menu(){
	    System.out.println("This is the menu: \n1. Fried Chicken  \n2. Pork Sisig  \n3. French Fries  \n4. Hotdog  \n5. Chicken Inasal");
	    System.out.println("Press 1 to select Fried Chicken\nPress 2 to select Pork Sisig \nPress 3 to select French Fries \nPress 4 to select Hotdog \nPress 5 to select Chicken Inasal");
        int order=sc.nextInt();
    
        if(order==1){
             System.out.println("You ordered Fried Chicken");
        }
        else if(order==2){
             System.out.println("You ordered Pork Sisig");
        }
	    else if(order==3){
             System.out.println("You ordered French Fries");
        }
	    else if(order==4){
             System.out.println("You ordered Hotdog");
        }
	    else if(order==5){
             System.out.println("You ordered Chicken inasal");
        }
        }

        // Drinks Choices
    public void drinks(){
	    System.out.println("This is the menu for drinks:  \n1. Iced Tea  \n2. Sprite  \n3. Coke  \n4. Mountain Dew  \n5. Water");
	    System.out.println("Press 1 to select Iced Tea\nPress 2 to select Sprite \nPress 3 to select Coke \nPress 4 to select Mountain Dew \nPress 5 to select Water");
        int drink=sc.nextInt();
        
        if(drink==1){
             System.out.println("You ordered Iced Tea for Drinks");
        }
        else if(drink==2){
             System.out.println("You ordered Sprite for Drinks");
        }
	    else if(drink==3){
             System.out.println("You ordered Coke for Drinks");
	}
	    else if(drink==4){
             System.out.println("You ordered Mountain Dew for Drinks");
	}
	    else if(drink==5){
             System.out.println("You ordered Water for Drinks");
	    }
        }
     
            
    }
       
   


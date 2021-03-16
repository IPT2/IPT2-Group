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
       
   }


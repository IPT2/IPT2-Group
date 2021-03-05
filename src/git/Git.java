/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.util.Scanner;

/**
 *
 * @author Athlon
 */
public class Git {
    Scanner sc= new Scanner (System.in);

    
   public static void sayWelcome (){
       System.out.println("Welcome, User");
   }
   public void sayName(){
       System.out.println("Enter your name: ");
       String name = sc.next();
       System.out.println("Hello, "+ name);
   }
       public void sayEaten(){
           int eaten;
           System.out.println("Have you eaten yet?");
           System.out.println("1.yes\n2.No");
           eaten =sc.nextInt();
           if (eaten==1);
           System.out.println("That's cool");
           if (eaten==2);
           System.out.println("Please eat your meal");
       }
          public void sayMood (){
       int choice = 0;
       System.out.println("How are you feeling today? ");
       System.out.println("1.sad\n2.happy\n3.angry");
       choice = sc.nextInt();
       switch (choice){
           case 1:
               System.out.println("Hope you feel better soon");
               break;
           case 2:
               System.out.println("That's great, hope you spread more happiness with your friends!");break;
           case 3:
               System.out.println("Don't let anger take over you!");break;
           
       }
          }
       
   }


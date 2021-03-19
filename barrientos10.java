package barrientos_cristina;

import java.util.Scanner;

/**
 *
 * @author Cristina
 */
public class Barrientos_Cristina {

    
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String choice;
      
          System.out.println("Hi, I'm Cristina this is my temperature converter.....");
          System.out.println("[A] Celcius to Fahrenhiet");
          System.out.println("[B] Fahrenhiet to Celcius");
          System.out.println("[C] Celcius to Kelvin");
          System.out.println("[D] Fahrenhiet to Kelvin");
          System.out.print("ENTER CHOICE: ");
          choice = scan.nextLine();
          choice = choice.toUpperCase();
          if (choice.equals("A")){
              System.out.print("Enter Temperature in Celcius: ");
              int cel = scan.nextInt();
              System.out.println(celciusToFahrenhiet(cel));
              
          }
          if (choice.equals("B")){
              System.out.print("Enter Temperature in Fahrenhiet: ");
              int fah = scan.nextInt();
              System.out.println(fahrenhietToCelcius(fah));
          }
          if (choice.equals("C")){
              System.out.print("Enter Temperature in Celcius: ");
              int cel = scan.nextInt();
              System.out.println(celciusToKelvin(cel));
          }
          if (choice.equals("D")){
              System.out.print("Enter Temperature in Fahrenhiet: ");
              int fah = scan.nextInt();
              System.out.println(fahrenhietToKelvin(fah));
          }
          
    }
    public static float celciusToFahrenhiet(int celcius){
        float fahrenhiet = (float) ((celcius * 1.8000) + 32.00);
        return fahrenhiet;
    }
    public static float fahrenhietToCelcius(int fahrenhiet){
        float celcius = (float) (fahrenhiet - 32) * 5/9;
        return celcius;
    }
    public static float celciusToKelvin(int celcius){
        float kelvin = (float) (celcius + 273.15);
        return kelvin;
    }
    public static float fahrenhietToKelvin(int fahrenhiet){
        float kelvin = (float) ((fahrenhiet + 459.67) * 5/9);
        return kelvin;
    }
    
}
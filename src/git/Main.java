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
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        Git intro = new Git ();
        int name;
        intro.sayWelcome();
        
        intro.sayName();
        intro.sayEaten();
        intro.sayMood();

    }
}

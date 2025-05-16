/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tla004;
import java.util.*;

/**
 *
 * @author Student's Account
 */
public class TLA004 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        Stack<String> actStack = new Stack<>();

        while (true) {
            System.out.print("Enter an action (type 'undo' to undo, 'exit' to stop): ");
            String action = scan.nextLine().trim();

            if (action.equalsIgnoreCase("exit")) {
                System.out.println("You exited the program");
                break;
               
            } else if (action.equalsIgnoreCase("undo")) {
                if (!actStack.isEmpty()) {
                    String lastAction = actStack.pop();
                    System.out.println("You undid \"" + lastAction + "\"");
                } else {
                    System.out.println("Nothing to undo.");
                }
            } else {
                actStack.push(action);
                System.out.println("You " + action );
            }
        }
    }
}



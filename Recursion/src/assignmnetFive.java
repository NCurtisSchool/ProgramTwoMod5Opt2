/*
Name: Nathan Curtis
Date: 11/3/2024
Class: Computer Programming II 24FD-CSC372-1
Teacher: Luis Gonzalez
Assignment Name: Implementing Abstract Classes using Shapes
GitHub: https://github.com/NCurtisSchool/ProgramTwoMod5Opt2.git
*/

import java.util.Scanner;

public class assignmnetFive {    
    public static void main(String[] args) throws Exception {
        // Create scanner
        Scanner userInput = new Scanner(System.in);

        // Create class, set amount of inputs/recursion amount to 5
        findSum mySum = new findSum(5);
        
        // Start finding the sum. 
        mySum.numberSum(0, userInput);
        
        // Close Scanner
        userInput.close();

        // Print out sum of numbers
        System.out.println(mySum.toString());
    }
}

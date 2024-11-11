import java.util.Scanner;

public class findSum {
    // Attributes
    protected int recursionAmount;
    protected int givenSum = 0;
    
    // Constructor
    public findSum(int recursionAmount) {
        this.recursionAmount = recursionAmount;
    }

    // Method
    public void numberSum(int recursionAttempts, Scanner userInput) {
        
        if(recursionAttempts == recursionAmount){
            
        } else {
            System.out.println("Enter a number: ");
            givenSum = givenSum + userInput.nextInt();
            numberSum(recursionAttempts + 1, userInput);
        }
    }

    // toString
    @Override
    public String toString() {
        return "The sum of the numbers is " + givenSum;
    }
}

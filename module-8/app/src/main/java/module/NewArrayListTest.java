/*
Amanda New
02/09/2025
CSD402-A311
M8: Largest ArrayListTest

 * This source file was generated by the Gradle 'init' task
 
Package for organization within code file
*/
package module;

//import ArrayList and Scanner
import java.util.ArrayList;
import java.util.Scanner ;

//Class
public class NewArrayListTest {

    //Method to return largest integer or 0 if empty
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        
        //variable to hold max value
        int max = list.get(0);

        //find the largest integer and return
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        
        return max;
    
    }
    //main method to scan through list and print out user input/results
    public static void main(String[] args) {
        //create scanner for user input
        Scanner scanner = new Scanner(System.in);

        //create ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers:\nPress 0 to stop!");

        //allow user input until 0 is entered, then break
        while(true) {
            int userInput = scanner.nextInt();

            //add user input to list
            numbers.add(userInput);

            if (userInput == 0) {
                break;
            }
        }

        //close scanner
        scanner.close();

        //call and print largest integer from user input 
        Integer largestNumber = max(numbers);

        System.out.println("The largest integer you enetered is: " + largestNumber);

    }
    
}

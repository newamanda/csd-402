/*
Amanda New 
01/19/2025
CSD402-A311
M2: Rock, Paper, Scissors


 * This source file was generated by the Gradle 'init' task
 
 Package for organization within code file
 */
package module;

/*Class */
public class rockPaperScissors {

    /*Main method */
    public static void main(String[] args) {
        /*Scanner to read input */
        java.util.Scanner input = new java.util.Scanner(System.in);

        /*setting compChoice and user as int values */
        int compChoice;
        int user;

        /*Introduction to the game and prompting for input from user */
        System.out.println("Game on! Select Rock (1), Paper (2), or Scissors (3): ");

        /*Allow scanner to pass through next line and Math function to
         * run random numbers 0-2; add 1 to get 1-3 
         * 1: Rock
         * 2: Paper
         * 3: Scissors
         */
        user = input.nextInt();
        compChoice=(int)(Math.random()*3)+1;
        
        /*Show results; what user chose and what number the computer generated */
        System.out.println("I Chose: " + resultChoice(compChoice));
        System.out.println("Your pick: " + resultChoice(user));

        /* Results of the games played based on outcome
         Tied Outcome */
        if (user == compChoice) {
            System.out.println("All tied up! Let's Play Again!");
        }

        /*Give options for winning scenarios to print winning result
         * user = rock vs comp = scissors
         * user = paper vs comp = rock
         * user = scissors vs comp = paper
         */
        else if (
            (user == 1 && compChoice == 3) ||
            (user == 2 && compChoice == 1) ||
            (user == 3 && compChoice == 2)) 
            
            {

                System.out.println("Winner Winner Chicken Dinner!");
            }  
            /* all other results end in loss, print those results */
            else {
                System.out.println("Better luck next time!");

            }
            /*close scanner */
            input.close();

        }
        
        

/* create strings to represent number input by user
 * to correlate them to rock, paper, and scissors; 
 * defining the variables
 * 1 = Rock
 * 2 = Paper 
 * 3 = Scissors
 */
public static String resultChoice(int choice) {
    switch (choice) {
        case 1:
            return "Rock";
        case 2:
            return "Paper";
        case 3:
            return "Scissors";
        default: return "";
        }
    }
    
    
}
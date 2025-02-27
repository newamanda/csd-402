/*
Amanda New
02/16/2025
CSD402-A311
M9: Program 2

 * This source file was generated by the Gradle 'init' task
 
Package for organization within code file
*/
package module;

import java.io.*;
import java.util.Random;

public class NewData {

    public static void main(String[] args) {

        //randomly write 10 numbers to file
        File file = new File("data.file");
        Random random = new Random();

        //will create if it doesn't exist, append file if it does
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100); 
                writer.write(randomNumber + " ");
            }
            //show message to let user know numbers have been written successfully
            writer.newLine();
            System.out.println("Numbers have been randomly written to file");
            
            //give user error message for writing
        } catch (IOException e) {
            System.out.println("Cannot write to file - Error: " + e.getMessage());
        }

        //display data from file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println ("Data from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            //give user error message for reading
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

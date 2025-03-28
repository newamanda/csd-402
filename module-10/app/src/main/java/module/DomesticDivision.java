/*
Amanda New
02/23/2025
CSD402-A311
M10: DomesticDivision

 * This source file was generated by the Gradle 'init' task

 Package for organization within code file
*/
package module;

public class DomesticDivision extends Division {

    private String state;

    //constructor
    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }
    
    //display domestic information
    public void display () {
        System.out.println("Domestic Division: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
        System.out.println();

    }

    //state getter
    public String getState() {
        return state;
    }
}

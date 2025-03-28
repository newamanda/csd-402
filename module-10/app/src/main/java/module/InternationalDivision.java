/*
Amanda New
02/23/2025
CSD402-A311
M10: InternationalDivision

 * This source file was generated by the Gradle 'init' task

 Package for organization within code file
*/

package module;

public class InternationalDivision extends Division {

    private String country;
    private String language;

    //contructor
    public InternationalDivision(String divisionName, String accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;

    }
    
    //display international information
    public void display() {
        System.out.println("International Division: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }

    //getters
    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }
}


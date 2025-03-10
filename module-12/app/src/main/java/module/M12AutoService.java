/**Amanda New
 * CSD402-A311
 * 03/09/25
 * Module 12: Auto Service Program
 */
package module;

//class
public class M12AutoService {

    //service charge constant
    public static double serviceCharge = 100.00;

    //method with no parameters
    public static double yearlyService() {
        return serviceCharge;
    }

    //method with one parameter
    public static double yearlyService(double oilChange) {
        return serviceCharge + oilChange;
    }

    //method with two parameters
    public static double yearlyService(double oilChange, double tires) {
        return serviceCharge + oilChange + tires;
    }

    //method with three parameters (including a coupon)
    public static double yearlyService(double oilChange, double tires, double coupon) {
        return serviceCharge + oilChange + tires - coupon;
    }

    //main method
    public static void main(String[] args) {
        
        //two tests: no parameters
        System.out.printf("Basic Service Cost (No additional services): $%.2f%n", + yearlyService());
        System.out.printf("Basic Service Cost (No additional charges - second test) $%.2f%n", + yearlyService());
        
        //empty line for formatting
        System.out.println("");

        //two tests: one parameter
        System.out.printf("Basic Service + Oil Change Total Cost: $%.2f%n", + yearlyService(60.00));
        System.out.printf("Basic Service + Oil Change Total Cost - second test: $%.2f%n", + yearlyService(50.00));

        System.out.println("");

        //two tests: two parameters
        System.out.printf("Basic Service with Oil Change + Tire Rotation Total Cost: $%.2f%n", + yearlyService(60.00, 15.00));
        System.out.printf("Basic Service with Oil Change + Tire Rotation Total Cost - second test: $%.2f%n", + yearlyService(50.00, 10.00));

        System.out.println("");

        //two tests: three parameters (one with coupon)
        System.out.printf("Basic Service with Oil Change + Tire Rotation (Coupon Applied): $%.2f%n", + yearlyService(60.00, 15.00, 10.00));;
        System.out.printf("Basic Service with Oil Change + Tire Rotation (Coupon Applied - second test): $%.2f%n", + yearlyService(50.00, 10.00, 5.00));
    }
}

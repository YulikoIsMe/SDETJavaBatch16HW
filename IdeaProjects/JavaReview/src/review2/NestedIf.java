package review2;

public class NestedIf {
    public static void main(String[] args) {
        /*Declare 2 variables for DL and a car
        if you have DL then I will chack if you have a car

         */
        boolean driverLicense=true;
        boolean car=true;
        if (driverLicense) {
            System.out.println("Let's check if you have a car");
            if (car){
                System.out.println("You can drive to work");
            }
        } else{
            System.out.println("You should get a DL");
        }
    }
}

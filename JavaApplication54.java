package javaapplication54;

public class JavaApplication54 {
    public static void main(String[] args) {
        Package regularPackage = new Package("Mohamed", "17 Street", "Istanbul",
                "Istanbul", "233", "Fatma", "23 Street", "Kayseri",
                "Kayseri", "334", 10.0, 2.0);

        Package twoDayPackage = new TwoDayPackage(23.0, "Mohamed", "17 Street",
                "Istanbul", "Istanbul", "233", "Fatma", "23 Street",
                "Kayseri", "Kayseri", "334", 23.0, 7.0);

        Package overnightPackage = new OvernightPackage(12.0, "Ahmed", "23 Street",
                "Kayseri", "Kayseri", "334", "Ali", "17 Street",
                "Istanbul", "Istanbul", "233", 50.0, 3.0);

        System.out.println("Regular Package:");
        System.out.println(regularPackage);
        System.out.println("Total cost: " + regularPackage.calculateCost());

        System.out.println("\nTwo-Day Package:");
        System.out.println(twoDayPackage);
        System.out.println("Total cost: " + twoDayPackage.calculateCost());

        System.out.println("\nOvernight Package:");
        System.out.println(overnightPackage);
        System.out.println("Total cost: " + overnightPackage.calculateCost());
    }
}

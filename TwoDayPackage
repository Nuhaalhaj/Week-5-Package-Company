package javaapplication54;

public class TwoDayPackage extends Package {
    private double flatfee;

    public TwoDayPackage(double flatfee, String sender, String senderAddress,
            String senderCity, String senderState, String senderZipCode,
            String recipient, String recipientAddress, String recipientCity,
            String recipientState, String recipientZipCode, double weight, double cost) {
        super(sender, senderAddress, senderCity, senderState, senderZipCode,
                recipient, recipientAddress, recipientCity, recipientState,
                recipientZipCode, weight, cost);
        if (flatfee < 0) {
            throw new IllegalArgumentException("Flat fee cannot be negative.");
        }
        this.flatfee = flatfee;
    }

    public double getFlatfee() {
        return flatfee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatfee;
    }
}

package javaapplication54;

public class OvernightPackage extends Package {
    private double feeperounce;

    public OvernightPackage(double feeperounce, String sender, String senderAddress,
            String senderCity, String senderState, String senderZipCode,
            String recipient, String recipientAddress, String recipientCity,
            String recipientState, String recipientZipCode, double weight, double cost) {
        super(sender, senderAddress, senderCity, senderState, senderZipCode,
                recipient, recipientAddress, recipientCity, recipientState,
                recipientZipCode, weight, cost);
        if (feeperounce < 0) {
            throw new IllegalArgumentException("Additional fee cannot be negative.");
        }
        this.feeperounce = feeperounce;
    }

    public double getFeeperounce() {
        return feeperounce;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + getWeight() * feeperounce;
    }
}

package javaapplication54;

public class Package {
    private String sender;
    private String senderAddress;
    private String senderCity;
    private String senderState;
    private String senderZipCode;
    private String recipient;
    private String recipientAddress;
    private String recipientCity;
    private String recipientState;
    private String recipientZipCode;
    private double weight;
    private double cost;

    public Package(String sender, String senderAddress, String senderCity,
            String senderState, String senderZipCode, String recipient,
            String recipientAddress, String recipientCity, String recipientState,
            String recipientZipCode, double weight, double cost) {
        if (weight <= 0 || cost <= 0) {
            throw new IllegalArgumentException("Weight and cost must be positive.");
        }
        this.sender = sender;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZipCode = senderZipCode;
        this.recipient = recipient;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZipCode = recipientZipCode;
        this.weight = weight;
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public double calculateCost() {
        return weight * cost;
    }

    @Override
    public String toString() {
        return "Sender: " + sender + ", " + senderAddress + ", " + senderCity
                + ", " + senderState + " " + senderZipCode
                + "\nRecipient: " + recipient + ", " + recipientAddress + ", "
                + recipientCity + ", " + recipientState + " " + recipientZipCode
                + "\nWeight: " + weight + " oz, Cost per ounce: " + cost;
    }
}

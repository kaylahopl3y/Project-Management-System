public class Customer {

    // Attributes
    String customerName;
    String telNumber;
    String emailAddress;
    String streetAddress;

    // Methods
    public Customer(String customerName, String telNumber, String emailAddress, String streetAddress) {
        this.customerName = customerName;
        this.telNumber = telNumber;
        this.emailAddress = emailAddress;
        this.streetAddress = streetAddress;
    }

    // Operators
    public String getCustomerName(){return customerName;}
    public String getCustomerTelNumber(){ return telNumber;}
    public String getCustomerEmailAddress(){return emailAddress;}
    public String getCustomerStreetAddress(){ return streetAddress;}

    // Printing
    public String toString() {
        String output = "Customer's name: " + customerName;
        output += "\nCustomer's telephone number: " + telNumber;
        output += "\nCustomer's email address: " + emailAddress;
        output += "\nCustomer's physical address: " + streetAddress;

        return output;
    }

}

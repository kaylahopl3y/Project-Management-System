public class Contractor {

    // Attributes
    String contractorName;
    String telNumber;
    String emailAddress;
    String streetAddress;

    // Methods
    public Contractor(String contractorName, String telNumber, String emailAddress, String streetAddress) {
        this.contractorName = contractorName;
        this.telNumber = telNumber;
        this.emailAddress = emailAddress;
        this.streetAddress = streetAddress;
    }

    // Operators
    public String getContractorName(){return contractorName;}
    public String getContractorTelNumber(){ return telNumber;}
    public String getContractorStreetAddress(){ return streetAddress;}

    // Printing
    public String toString() {
        String output = "Contractor's name: " + contractorName;
        output += "\nContractor's telephone number: " + telNumber;
        output += "\nContractor's email address: " + emailAddress;
        output += "\nContractor's physical address: " + streetAddress;

        return output;
    }

}

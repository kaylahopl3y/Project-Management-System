public class Architect {

    // Attributes
    String architectName;
    String telNumber;
    String emailAddress;
    String streetAddress;

    // Methods
    public Architect(String architectName, String telNumber, String emailAddress, String streetAddress) {
        this.architectName = architectName;
        this.telNumber = telNumber;
        this.emailAddress = emailAddress;
        this.streetAddress = streetAddress;
    }

    // Operators
    public String getArchitectName(){return architectName;}
    public String getArchitectTelNumber(){ return telNumber;}
    public String getArchitectStreetAddress(){ return streetAddress;}

    // Printing
    public String toString() {
        String output = "Architect's name: " + architectName;
        output += "\nArchitect's telephone number: " + telNumber;
        output += "\nArchitect's email address: " + emailAddress;
        output += "\nArchitect's physical address: " + streetAddress;

        return output;
    }

}
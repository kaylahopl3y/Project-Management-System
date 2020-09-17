public class Project {

    // Attributes
    int projectNumber;
    String projectName;
    String buildingType;
    String buildingAddress;
    int erfNumber;
    float totalFee;
    float amountPaid;
    String deadlineDate;

    // Methods
    public Project(int projectNumber, String projectName, String buildingType, String buildingAddress,
                   int erfNumber, float totalFee, float amountPaid, String deadlineDate) {
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.buildingAddress = buildingAddress;
        this.erfNumber = erfNumber;
        this.totalFee = totalFee;
        this.amountPaid = amountPaid;
        this.deadlineDate = deadlineDate;
    }

    // Operators
    public int getProjectNumber(){return projectNumber;}
    public String getProjectName(){ return projectName;}
    public int getErfNumber(){return erfNumber;}
    public String getDeadlineDate(){return deadlineDate;}
    public float getAmountPaid(){return amountPaid;}


    // Printing
    public String toString() {
        String output = "Project number: " + projectNumber;
        output += "\nProject name: " + projectName;
        output += "\nBuilding type: " + buildingType;
        output += "\nBuilding address: " + buildingAddress;
        output += "\nERF number: " + erfNumber;
        output += "\nTotal project fee: " + totalFee;
        output += "\nTotal amount of fee paid to date: " + amountPaid;
        output += "\nDeadline of project: " + deadlineDate;

        return output;
    }

}

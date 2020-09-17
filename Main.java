import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a menu that lets the user add a project, architect, contractor or customer
        // The edit menu to change due dates etc can only be used when the information is saved to a file
        // ( I haven't learnt files yet so leaving it as is)
        System.out.print("Please enter a selection: " +
                "\n 1 - Add a new project" +
                "\n 2 - Create an architect profile" +
                "\n 3 - Create a contractor profile" +
                "\n 4 - Create a customer profile" +
                "\n 5 - Edit or Display existing : ");

        int select = sc.nextInt();

        // Creating a project and filling in all the attributes using user input
        if (select == 1) {
            System.out.print("Enter the project number: ");
            int projectNumber = sc.nextInt();

            System.out.print("Enter the project name: ");
            String projectName = sc.next();

            System.out.print("Enter the building type: ");
            String buildingType = sc.next();

            System.out.print("Enter the building's address: ");
            String buildingAddress = sc.next();

            System.out.print("Enter the ERF number: ");
            int erfNumber = sc.nextInt();

            System.out.print("Enter the project number: ");
            float totalFee = sc.nextFloat();

            System.out.print("Enter the amount paid to date: ");
            float amountPaid = sc.nextFloat();

            System.out.print("Enter the project due date: ");
            String deadlineDate = sc.next();

            Project project = new Project (projectNumber, projectName, buildingType, buildingAddress, erfNumber,
                    totalFee, amountPaid, deadlineDate);

            System.out.print(project);
        }

        // Repeating for creating an architect
        if (select == 2) {
            System.out.print("Enter the architect's name: ");
            String architectName = sc.next();

            System.out.print("Enter the architect's telephone number: ");
            String telNumber = sc.next();

            System.out.print("Enter the architect's email address: ");
            String emailAddress = sc.next();

            System.out.print("Enter the architect's physical address: ");
            String streetAddress = sc.next();

            Architect architect = new Architect (architectName, telNumber, emailAddress, streetAddress);

            System.out.print(architect);
        }

        // repeating for creating a contractor
        if (select == 3){
            System.out.print("Enter the contractor's name: ");
            String contractorName = sc.next();

            System.out.print("Enter the contractor's telephone number: ");
            String telNumber = sc.next();

            System.out.print("Enter the contractor's email address: ");
            String emailAddress = sc.next();

            System.out.print("Enter the contractor's physical address: ");
            String streetAddress = sc.next();

            Contractor contractor = new Contractor (contractorName, telNumber, emailAddress, streetAddress);

            System.out.print(contractor);
        }

        // repeating for creating a customer
        if (select == 4) {
            System.out.print("Enter the customer's name: ");
            String customerName = sc.next();

            System.out.print("Enter the customer's telephone number: ");
            String telNumber = sc.next();

            System.out.print("Enter the customer's email address: ");
            String emailAddress = sc.next();

            System.out.print("Enter the customer's physical address: ");
            String streetAddress = sc.next();

            Customer customer = new Customer(customerName, telNumber, emailAddress, streetAddress);

            System.out.print(customer);
        }

        // Start of edit menu which will be used at a later stage
        if(select == 5){

            System.out.print("Please enter a selection: " +
                    "\n a - Edit a project" +
                    "\n b - Edit architect's details" +
                    "\n c - Edit contractor's details" +
                    "\n d - Edit customer's details");

            String choice = sc.next();

            //if (choice == "a"){ will be able to do all this once info is saved somewhere

        }

        }

    }

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();
        
        Scanner scnr = new Scanner(System.in); // scanner class object
        char options;
        
        do // loop until user exits application
        {
            displayMenu();
            options = scnr.next().charAt(0);
            if (options == '1') { // intakeNewDog method is called
                intakeNewDog(scnr);
            }
            
            else if (options == '2') { // intakeNewMonkey method is called
                intakeNewMonkey(scnr);
            }
            
            else if (options == '3') { // reserveAnimal method is called
                reserveAnimal(scnr);
            }
            
            else if (options == '4') { // printAnimals method is called to print the dog list
                printAnimals(options);
            }
            
            else if (options == '5') { // printAnimals method is called to print the monkey list
                printAnimals(options);
            }
            
            else if (options == '6') { // printAnimals method is called to print all available animals
                printAnimals(options);
            }
            
            else if (options == 'q') { // exit message prints and application stops running
                System.out.print("You have exited the application.");
                break;
            }
            
            else { // in the event of an invalid input, tells user and prompts for a new input
                System.out.print("You have entered an invalid input. Please enter a valid input.");
            }
        }
        while (options != 'q');
    }

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.1

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("John", "male", "1", "1.2", "01-01-2023", "Thailand", "out of service", false, "United States", "Squirrel Monkey", "14.8", "15.6", "17.2");
        Monkey monkey2 = new Monkey("Mike", "female", "2", "1.3", "02-02-2023", "Guatemala", "service", true, "United States", "Capuchin", "19", "21.2", "18.5");
        Monkey monkey3 = new Monkey("Emi", "female", "3", "2.4", "03-03-2013", "Peru", "service", true, "Colombia", "Tamarin", "15.2", "11", "12.2");
        
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scnr) {
        System.out.println("What is the dog's name?");
        String name = scnr.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("Dog breed?");
        String breed = scnr.nextLine();
        System.out.println("Dog gender?");
        String gender = scnr.nextLine();
        System.out.println("Dog age?");
        String age = scnr.nextLine();
        System.out.println("Dog weight?");
        String weight = scnr.nextLine();
        System.out.println("Dog acquisition date?");
        String acquisitionDate = scnr.nextLine();
        System.out.println("Dog acquisition country?");
        String acquisitionCountry = scnr.nextLine();
        System.out.println("Dog training status?");
        String trainingStatus = scnr.nextLine();
        System.out.println("Is Dog reserved?");
        boolean reserved = scnr.nextBoolean();
        scnr.nextLine();
        System.out.println("Which country is the dog in service?");
        String inServiceCountry = scnr.nextLine();
        
        Dog dog4 = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(dog4);
        System.out.println("Dog has been added to Dog List.");

        // Add the code to instantiate a new dog and add it to the appropriate list
    }
    	public static void intakeNewMonkey(Scanner scnr) {
    		System.out.println("Monkey's name?");
    		String name = scnr.nextLine();
    		for (Monkey monkey: monkeyList) {
    			if (monkey.getName().equalsIgnoreCase(name)) {
    				System.out.println("\n\nMonkey is already in system\n\n");
    				return;
    			}
    		}
    		System.out.println("Monkey gender?"); // the following is to add a new monkey to the system
    	    String gender = scnr.nextLine();
    	    System.out.println("Monkey age?");
    	    String age = scnr.nextLine();
    	    System.out.println("Monkey weight?");
    	    String weight = scnr.next();
    	    System.out.println("Monkey acquisition date?");
    	    String acquisitionDate = scnr.nextLine();
    	    System.out.println("Monkey acquisition country?");
    	    String acquisitionCountry = scnr.nextLine();
    	    System.out.println("Monkey training status?");
    	    String trainingStatus = scnr.nextLine();
    	    System.out.println("Monkey reserved?");
    	    boolean reserved = scnr.nextBoolean();
    	    System.out.println("Which country is the monkey in service?");
    	    String inServiceCountry = scnr.nextLine();
    	    System.out.println("Monkey species?");
    	    String species = scnr.nextLine();
    	    System.out.println("Monkey tail length?");
    	    String tailLength = scnr.nextLine();
    	    System.out.println("Monkey height?");
    	    String height = scnr.nextLine();
    	    System.out.println("Monkey body length?");
    	    String bodyLength = scnr.nextLine();
    	    
    	    Monkey monkey4 = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, species, tailLength, height, bodyLength);
    	    monkeyList.add(monkey4);
    	    System.out.println("Monkey added to Monkey List.");
    	    }

        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scnr) {
            System.out.println("The method reserveAnimal needs to be implemented");
            scnr.nextLine();
            System.out.println("Enter animal type: ");
            String animalType = scnr.nextLine();
            if (animalType.equalsIgnoreCase("Monkey")) {
                System.out.println("Enter the monkey's acquisition country: ");
                String country = scnr.nextLine();
                for (Monkey obj: monkeyList) {
                    if (obj.getAcquisitionLocation().equalsIgnoreCase(country)) {
                        obj.setReserved(true);
                        System.out.println("This monkey is now reserved.");
                        return;
                    }
                }
                System.out.println("The monkey entered is not in the list.");
            }
            else if (animalType.equalsIgnoreCase("Dog")) { // how to reserve a dog
                System.out.println("Enter the dog's acquisition country: ");
                String country = scnr.nextLine();
                for (Dog obj: dogList) {
                    if (obj.getAcquisitionLocation().equalsIgnoreCase(country)) {
                        obj.setReserved(true);
                        System.out.println("This dog is now reserved.");
                        return;
                    }
                }
                System.out.println("The dog entered is not in the list.");
            }
            else {
                System.out.println("Animal type not found.");
            }
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(char options) {
        	if (options == '4') {
                System.out.println(dogList);
            }
            else if (options == '5') {
                System.out.println(monkeyList);
            }
            else if (options == '6') {
                for (int i = 0; i < dogList.size(); i++) {
                    if (dogList.get(i).getTrainingStatus().equals("in service") && dogList.get(i).getReserved()==false) {
                        System.out.println(dogList.get(i));
                    }
                }
                for (int i = 0; i < monkeyList.size(); i++) {
                    if (monkeyList.get(i).getTrainingStatus().equals("in service") && monkeyList.get(i).getReserved()==false) {
                        System.out.println(monkeyList.get(i));
                    }
               }
          }
     }
}

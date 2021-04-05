import java.util.Scanner;

public class AirportSecurityApp {
	static AirportSecurityProgram app = new AirportSecurityProgram();
	static Scanner s = new Scanner(System.in);
	
	private static void displayMenu(){
        System.out.println("-----------------MENU------------------");
        System.out.println("1. Add a new passenger");
        System.out.println("2. Check whether there is any passenger next");
        System.out.println("3. Show the information of the next passenger"); 
        System.out.println("4. Display the list of all passenger");
        System.out.println("5. Exit program");
        System.out.print("Press the number matched execute the function: ");
    }
	
	public static void addPassenger() {
		System.out.println("Input passenger information");
		System.out.print("ID: ");
		int id = s.nextInt();
		System.out.print("First name: ");
		String firstName = s.nextLine();
		s.nextLine();
		System.out.print("Last name: ");
		String lastName = s.nextLine();
		System.out.print("Type of passenger: ");
		String type = s.nextLine();
		app.add(new Person(id, firstName, lastName, type));
		//I DON'T KNOW HOW TO FIX THIS PART BUT IT SHOWS "Resource leak: 's' is never closed."
	}
	
	public static void printAllPassengers() {
		for(Person p : app.getAllPassenger())
			p.toString();
	}
	
	public void executeFunction(int choose) {
		switch(choose) {
			case 1: 
				addPassenger();
				break;
			case 2: 
				app.hasNextPerson();
				break;
			case 3:
				app.nextPerson();
				break;
			case 4: 
				printAllPassengers();
				break;
			case 5:
				System.out.println("Exited!");
				break;
			default: 
				System.out.print("You import the wrong number, please pick another number:");
                break;
		}
	}
	
	public void run() {
		while(true) {
			displayMenu();
			executeFunction(s.nextInt());
			if (s.nextInt()==5)
				break;
		}
	}
	
	public static void main(String[] args) {
        new AirportSecurityApp().run();   
        //Hello I make my changes 
        
    }
}


public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private String type;
	
	public Person(int id, String firstName, String lastName, String type) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
	}
	
	public String toString() {
		return String.format("Passenger ID: %d, Name: %s %s, Passenger Type: %d", id, firstName, lastName, type);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
 }

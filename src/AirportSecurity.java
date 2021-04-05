import java.util.LinkedList;

public interface AirportSecurity {
	public LinkedList<Person> getAllPassenger();
	// return the list of all the passengers
	
	public void add(Person p);
	// add a new person to the line
	// VIP and STAFF: add to the front
	// ECONOMY: add to the end
	
	public boolean hasNextPerson();
	// returns whether any passengers are waiting in the queue
	
	public Person nextPerson();
	// return the record of the next person in the queue
}

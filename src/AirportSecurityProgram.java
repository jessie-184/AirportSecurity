import java.util.*;

public class AirportSecurityProgram implements AirportSecurity{
	private LinkedList<Person> priorityPassengers;
	private LinkedList<Person> economyPassengers;
	
	public AirportSecurityProgram() {
		priorityPassengers = new LinkedList<Person>();
		economyPassengers = new LinkedList<Person>();
	}
	
	@Override
	public LinkedList<Person> getAllPassenger() {
		LinkedList<Person> list = new LinkedList<Person>();
		for(Person p1 : priorityPassengers)
			list.add(p1);
		for(Person p2 : economyPassengers)
			list.add(p2);
		return list;
	}
	
	@Override
	public void add(Person p) {
		if(p.getType().equals("ECONOMY")) {
			economyPassengers.add(p);
		} else {
			priorityPassengers.add(p);
		}	
	}
	
	@Override
	public boolean hasNextPerson() {
		return (economyPassengers.size()>0 || priorityPassengers.size()>0);
	}
	
	@Override
	public Person nextPerson() {
		if(priorityPassengers.size()>0)
			return priorityPassengers.poll();
		if(economyPassengers.size()>0)
			return economyPassengers.poll();
		throw new NoSuchElementException();
	}

}

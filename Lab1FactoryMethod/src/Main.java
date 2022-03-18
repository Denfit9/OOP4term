import java.util.HashMap;

import AirlinePackage.*;
import PlanePackage.AirplaneType;


public class Main {

	public static void main(String[] args) {		
		AirlineBuilder builder = new AirlineBuilder();
		HashMap<AirplaneType, Integer> ownedPlanes = new HashMap<>();
		ownedPlanes.put(AirplaneType.LOWCOST, 7);
		ownedPlanes.put(AirplaneType.REGULAR_FLIGHT,2);
		Airline cheapAirline =  builder.createAirline(ownedPlanes);
		ownedPlanes.clear();
		
		ownedPlanes.put(AirplaneType.MILITARYCIVIL, 3);
		ownedPlanes.put(AirplaneType.MILITARYCARGO, 2);
		Airline militaryAirline =  builder.createAirline(ownedPlanes);
		System.out.println("Cheap airline company can carry " + cheapAirline.getPeopleNum() + " people");
		System.out.println("Military airline company can carry " + militaryAirline.getPeopleNum() + " people");

	}

}

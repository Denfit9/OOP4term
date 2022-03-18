package AirlinePackage;
import java.util.ArrayList;
import java.util.HashMap;

import AirPlaneFactoryPackage.*;
import PlanePackage.*;

public class AirlineBuilder {
	public Airline createAirline (HashMap<AirplaneType,Integer> airlineDict ) 
	{
		
		ArrayList<AbstractPlane> planes = new ArrayList<AbstractPlane>();
		ArrayList<HashMap.Entry> entries = new ArrayList<>(airlineDict.entrySet());
		for (HashMap.Entry entry : entries) {
           for (int i =1; i<=(int) entry.getValue(); i++) {
        	   planes.add(AirPlaneFactory.createAbstractPlane((AirplaneType) entry.getKey()));
           }
        }
		Airline airline = new Airline (planes);
		return airline;
	}
}

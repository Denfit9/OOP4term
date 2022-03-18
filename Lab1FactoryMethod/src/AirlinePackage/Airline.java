package AirlinePackage;

import java.util.ArrayList;

import PlanePackage.*;

public class Airline
{
	public Airline(ArrayList<AbstractPlane> planes) {
		this.planes = planes;
	}
	
	ArrayList<AbstractPlane> planes;
	

public int getPeopleNum() {
	int sum = 0;
	for (AbstractPlane plane : planes) 
	{
		sum+= plane.getPeopleNum();
	}
	return sum;
}

}

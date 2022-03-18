package PlanePackage;


public abstract class AbstractPlane {
		
	int peopleOnBoard;
	public abstract int getPeopleNum(); 
	

}

abstract class CivilAircraft extends AbstractPlane {}

abstract class CargoAirctaft extends AbstractPlane{}


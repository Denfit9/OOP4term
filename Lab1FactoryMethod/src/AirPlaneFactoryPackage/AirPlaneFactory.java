package AirPlaneFactoryPackage;
import PlanePackage.*;

public class AirPlaneFactory 
{
public static AbstractPlane createAbstractPlane (AirplaneType type) 
{
	AbstractPlane plane = null;
	
	switch(type) 
	{
	case REGULAR_FLIGHT:
		plane = new RegularFlight();
		break;
	case LOWCOST:
		plane = new Lowcost();
		break;
	case MILITARYCARGO:
		plane = new MilitaryCargo();
		break;
	case MILITARYCIVIL:
		plane = new MilitaryCivil();
		break;
		
	}
	return plane;
}
}


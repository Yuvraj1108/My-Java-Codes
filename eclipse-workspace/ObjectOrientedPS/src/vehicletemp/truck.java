package vehicletemp;

import Vehicle.Vehicle;

public class truck extends Vehicle{
	
	int maxcap;
	public void print()
	{
		super.print();
		System.out.println(maxcap);
	}
}

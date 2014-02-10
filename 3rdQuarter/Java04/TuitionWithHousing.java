/* Chris Glock
 * 1/18/06
 * TuitionWithHousing */

import java.util.*;
public class TuitionWithHousing extends Tuition

{

	private byte occupants;

	//******************************
	// Constructors
	//******************************
	TuitionWithHousing()                    //no arguments
	{
		super(0,"","","","","",0,0,0,0,""); //calls the class Tuition with no arguments
		occupants =0;
	}

	TuitionWithHousing(int studentNumber, String studentFirstName, String studentLastName, String studentAddress, String studentCity, String studentState, int month, int day, int year, double numberOfHours, String strNumber, byte occupants)
	{
		super(studentNumber, studentFirstName, studentLastName, studentAddress, studentCity, studentState, month, day, year, numberOfHours, strNumber);
		this.occupants = occupants;
	}
	//*******************************************************
	// Methods for validating, setting, and getting occupants
	//*******************************************************

	public boolean areOccupantsValid(byte occupants)
	{
		if(occupants<2||occupants>4)
			return true;
		else
			return false;
	}

	public void setOccupants(byte occupants)
	{
		this.occupants = occupants;
	}

	public byte getOccupants()
	{
		return occupants;
	}
	//******************************************
	// Tuition calculation including housing fee
	//******************************************
	public double calcTuition()
	{
		double tuition = 0;
		double housingFee;

		//calculate tuition
		tuition = numberOfHours * costPerHour + activitiesFee + graduationFee;

		//determine housing fee
		if(occupants == 2)
			housingFee = 974;
		else if(occupants == 3)
			housingFee = 848;
		else
			housingFee = 769;

		//add housing to tuition
		tuition = housingFee + tuition;
		return tuition;
	}
}
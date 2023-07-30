package com.Anjali.device;

public class Doctor {
	
	public Nurse nurse= new Nurse();
	
	public void study()
	
	{
		if(nurse!=null) {
			this.nurse.careTaker();
		System.out.println("Invoking Doctor study");
	}
		else
		{
			System.out.println("Invoking Doctor study is Invalid");	
		}
	}
    public void guide()
    {
    	if(nurse!=null)
    	{
    		
    	this.nurse.treatment();
    	System.out.println("Invoking Doctor guide");
    	}
    	else
    	{
    		System.out.println("Invoking Doctor guide is Invalid");
    }


}
}

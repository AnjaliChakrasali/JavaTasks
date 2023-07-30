package com.Anjali.device;

public class Hospital {
	public Patient patient=new Patient();
	public Nurse nurse=new Nurse();
	
	public Doctor doctor =new Doctor();
	public void floor()
	
	{
		if(doctor!=null)
		{
			this.doctor.study();
		  System.out.println("Invoking Main Study");
	    }
	  else
	  {
		System.out.println("Invoking Main Study is Invalid");
	  }
	
	}
	public void staff()
	{
		if(doctor!=null)
		{
			this.doctor.guide();
			System.out.println("Invoking Main Guide");
		}
		else{
			System.out.println("Invoking Main Guide is Invalid");
			}
  	}



}

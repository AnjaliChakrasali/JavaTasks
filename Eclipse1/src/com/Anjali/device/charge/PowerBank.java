package com.Anjali.device.charge;

public class PowerBank {
	public Battery battery=new Battery();

	public void charging() {
		System.out.println("invoking charging in powerBank");
		if(battery!=null)
		{
	      this.battery.capacity();
		}
		else {
			System.out.println("ESP");
		}
		
	}
	 public void display() {
		 System.out.println("invoking display in powerBank");
		 if(battery!=null)
		 {
		 this.battery.voltage();
		 }
		 else {
			 System.out.println("ESP");
		 }
}

}

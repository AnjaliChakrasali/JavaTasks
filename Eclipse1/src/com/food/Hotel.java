package com.food;

public class Hotel {
	
		public Cook cook=new Cook();
		public void foodpreparing() {
			System.out.println("foodpreaparing in hotel");
			if(cook!=null)
			{
			 	this.cook.prepare();
			}
		}
			public void coffeemaker() {
				System.out.println("coffermaker is present in hotel");
				if(cook!=null)
				{
					this.cook.clean();
				}
				
			}

}

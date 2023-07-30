package Anjali.web;

public class Shop {
	public Salesman salesman=new Salesman();
	public void products()
	{
		System.out.println("products can buy in shop");
		  if(salesman!=null)
		 {
			 this.salesman.selling();
		 }
	 }
	public void payment() {
		System.out.println("payments can done");
		if(salesman!=null) {
			this.salesman.marketing();
		}
	}


}

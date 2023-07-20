class Wood{
	String timberType;//Oak
	int thickness;//2inches
	int length;//6feet
	double price;//5000rs
	double loadCapacity;//1000kg
	
	Wood()
	{
	
		System.out.println("Invoking no args in wood");
		this.timberType=timberType;
		this.thickness=thickness;
		this.length=length;
		this.price=price;
		this.loadCapacity=loadCapacity;
		
	}
	Wood(String timberType)
	{   
		System.out.println("Invoking Timber type in wood");
		this.timberType=timberType;
	}
	Wood(String timberType,int thickness)
	{
		this(timberType);
		System.out.println("Invoking timber type, thickness in wood");
		this.thickness=thickness;
		
		
	}
	Wood(String timberType,int thickness,int length)
	{
		this(timberType,thickness);
		System.out.println("Invoking timber type, thickness,length in wood");
		this.length=length;
		
	}
	Wood(String timberType,int thickness,int length,double price)
	{
		this(timberType,thickness,length);
		System.out.println("Invoking timber type, thickness,length,price in wood");
		this.price=price;
		
	}
	Wood(String timberType,int thickness,int length,double price,double loadCapacity)
	{
		this(timberType,thickness,length,price);
		System.out.println("Invoking timber type, thickness,length,price and load capacity in wood");
		this.loadCapacity=loadCapacity;
		
		
	}
	
	
}
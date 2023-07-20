class Park{
	String name;//Manjunathanagara park
	String address;//Rajajinagar bengalur
	int gate;//2
	int section;//4
	int parkingSlot;//3
	double ratings;//4.3
	long query;//8046329003L
	int noOfChairs;//15
	String cafe;//false
	
	
	Park()
	{
	
		System.out.println("Invoking no args in Park");
		this.name=name;
		this.address=address;
		this.gate=gate;
		this.section=section;
		this.parkingSlot=parkingSlot;
		this.ratings=ratings;
		this.query=query;
		this.noOfChairs=noOfChairs;
		this.cafe=cafe;
		
		
	}
	Park(String name)
	{   
		System.out.println("Invoking name  in Park");
		this.name=name;
	}
	Park(String name,String address)
	{
		this(name);
		System.out.println("Invoking name, address in Park");
		this.address=address;
		
		
	}
	Park(String name,String address,int gate)
	{
		this(name,address);
		System.out.println("Invoking name, address,gate in Park");
		this.gate=gate;
		
	}
	Park(String name,String address,int gate,int section)
	{
		this(name,address,gate);
		System.out.println("Invoking name, address,gate,section in Park");
		this.section=section;
		
	}
	Park(String name,String address,int gate,int section,int parkingSlot)
	{
		this(name,address,gate,section);
		System.out.println("Invoking name , address,section and parkingSlot in Park");
		this.parkingSlot=parkingSlot;
		
		
	}
	Park(String name,String address,int gate,int section,int parkingSlot,double ratings)
	{
		this(name,address,gate,section,parkingSlot);
		System.out.println("Invoking name , address,gate,section,parkingSlot and ratings in Park");
		this.ratings=ratings;
		
		
	}
	Park(String name,String address,int gate,int section,int parkingSlot,double ratings,long query)
	{
		this(name,address,gate,section,parkingSlot,ratings);
		System.out.println("Invoking name ,address,gate,section,parkingSlot,ratings and query in Park");
		this.query=query;
		
		
	}
	Park(String name,String address,int gate,int section,int parkingSlot,double ratings,long query,int noOfChairs)
	{
		this(name,address,gate,section,parkingSlot,ratings,query);
		System.out.println("Invoking name ,address,gate,section,parkingSlot,ratings and query in Park");
		this.noOfChairs=noOfChairs;
		
		
	}
	Park(String name,String address,int gate,int section,int parkingSlot,double ratings,long query,int noOfChairs,String cafe)
	{
		this(name,address,gate,section,parkingSlot,ratings,query,noOfChairs);
		System.out.println("Invoking name ,address,gate,section,parkingSlot,ratings and query in Park");
		this.cafe=cafe;
		
		
	}
	
	
}
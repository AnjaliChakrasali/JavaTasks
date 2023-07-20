class Mall{
	String name;//GT World mall
	String address;//magadi road bengalur
	int floor;//4
	int section;//6
	int parkingSlot;//3
	double ratings;//4.3
	long query;//8046329003L
	
	Mall()
	{
	
		System.out.println("Invoking no args in Mall");
		this.name=name;
		this.address=address;
		this.floor=floor;
		this.section=section;
		this.parkingSlot=parkingSlot;
		this.ratings=ratings;
		this.query=query;
		
		
	}
	Mall(String name)
	{   
		System.out.println("Invoking name  in Mall");
		this.name=name;
	}
	Mall(String name,String address)
	{
		this(name);
		System.out.println("Invoking name, address in Mall");
		this.address=address;
		
		
	}
	Mall(String name,String address,int floor)
	{
		this(name,address);
		System.out.println("Invoking name, address,floor in Mall");
		this.floor=floor;
		
	}
	Mall(String name,String address,int floor,int section)
	{
		this(name,address,floor);
		System.out.println("Invoking name, address,floor,section in Mall");
		this.section=section;
		
	}
	Mall(String name,String address,int floor,int section,int parkingSlot)
	{
		this(name,address,floor,section);
		System.out.println("Invoking name , address,section and parkingSlot in Mall");
		this.parkingSlot=parkingSlot;
		
		
	}
	Mall(String name,String address,int floor,int section,int parkingSlot,double ratings)
	{
		this(name,address,floor,section,parkingSlot);
		System.out.println("Invoking name , address,floor,section,parkingSlot and ratings in Mall");
		this.ratings=ratings;
		
		
	}
	Mall(String name,String address,int floor,int section,int parkingSlot,double ratings,long query)
	{
		this(name,address,floor,section,parkingSlot,ratings);
		System.out.println("Invoking name ,address,floor,section,parkingSlot,ratings and query in Mall");
		this.query=query;
		
		
	}
	
	
}
class Butcher{
	
	String name;
	int avgInDay;
	int experience;
	
	Butcher()
	{
		System.out.println("invoking no-arg const of  Butcher");
		
	}
	Butcher(String name,int avgInDay)
	{
		
		this.name=name;
		this.avgInDay=avgInDay;
		System.out.println("invocking string, int const of Butcher ");
	}
	Butcher(String name,int avgInDay,int experience)
	{
		
		
		this(name,avgInDay);
		this.experience=experience;
		System.out.println("invocking string, int,int const of Butcher ");
	}
}
class ParkRunner{
	public static void main(String[] args)
	{
		System.out.println("invoking main in Parkrunner");
	
		Park park=new Park("Manjunathanagara park","Rajajinagar bengalur",2,4,3,4.3d,8046329003L,15,"Yes");
		System.out.println(park.name);
	    System.out.println(park.address);
	    System.out.println(park.gate);
	    System.out.println(park.section);
	    System.out.println(park.parkingSlot);
		System.out.println(park.ratings);
		System.out.println(park.query);
		System.out.println(park.noOfChairs);
		System.out.println(park.cafe);
	}
}
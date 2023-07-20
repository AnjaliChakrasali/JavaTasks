class MallRunner{
	public static void main(String[] args)
	{
		System.out.println("invoking main in Mallrunner");
	
		Mall mall=new Mall("GT World mall","magadi road bengalur",4,6,3,4.3d,8046329003L);
		System.out.println(mall.name);
	    System.out.println(mall.address);
	    System.out.println(mall.floor);
	    System.out.println(mall.section);
	    System.out.println(mall.parkingSlot);
		System.out.println(mall.ratings);
		System.out.println(mall.query);
	}
}
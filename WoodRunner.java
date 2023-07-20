class WoodRunner{
	public static void main(String[] args)
	{
		System.out.println("invoking main in Woodrunner");
	
		Wood wood5=new Wood("Oak",2,6,5000.00,1000.00);
		System.out.println(wood5.timberType);
	    System.out.println(wood5.thickness);
	    System.out.println(wood5.length);
	    System.out.println(wood5.price);
	    System.out.println(wood5.loadCapacity);
	}
}
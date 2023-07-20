class ButcherRunner
{
  public static void main(String[] args)
	{
		System.out.println("invocking main in ButcherRunner");
		
		
		Butcher butcher=new Butcher("Bhasha",10,20);
		System.out.println(butcher.name);
	    System.out.println(butcher.avgInDay);
	    System.out.println(butcher.experience);
	}

}
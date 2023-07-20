class Carrom{
	String brand;
	String color;
	String material;
	int size;
	double price;
	
	Carrom()
	{
		System.out.println("invokin no args in constructor");
		this.brand=brand;
		this.color=color;
		this.material=material;
		this.size=size;
		this.price=price;
	}
	Carrom(String brand)
	{
		System.out.println("invokin brand in Carrom");
		this.brand=brand;
		this.color=color;
		this.material=material;
		this.size=size;
		this.price=price;
		System.out.println("Brand of tha Carrom is : "+brand);
		
	}
	Carrom(String brand,String color)
	{
		System.out.println("invokin brand and color in Carrom");
		this.brand=brand;
		this.color=color;
		this.material=material;
		this.size=size;
		this.price=price;
		System.out.println("Brand of tha Carrom is : "+brand);
		System.out.println("Color of tha Carrom is : "+color);
		
	}
	Carrom(String brand,String color,String material)
	{
		System.out.println("invokin brand, color and material in Carrom");
		this.brand=brand;
		this.color=color;
		this.material=material;
		this.size=size;
		this.price=price;
		System.out.println("Brand of tha Carrom is : "+brand);
		System.out.println("Color of tha Carrom is : "+color);
		System.out.println("Material of tha Carrom is : "+material);
	}
	Carrom(String brand,String color,String material,int size)
	{
		System.out.println("invokin brand, color, material and size in Carrom");
		this.brand=brand;
		this.color=color;
		this.material=material;
		this.size=size;
		this.price=price;
		System.out.println("Brand of tha Carrom is : "+brand);
		System.out.println("Color of tha Carrom is : "+color);
		System.out.println("Material of tha Carrom is : "+material);
		System.out.println("size of tha Carrom is : "+size);
	}
	Carrom(String brand,String color,String material,int size,double price)
	{
		System.out.println("invokin brand, color,material,size and price in Carrom");
		this.brand=brand;
		this.color=color;
		this.material=material;
		this.size=size;
		this.price=price;
		System.out.println("Brand of tha Carrom is : "+brand);
		System.out.println("Color of tha Carrom is : "+color);
		System.out.println("Material of tha Carrom is : "+material);
		System.out.println("size of tha Carrom is : "+size);
		System.out.println("price of tha Carrom is : "+price);
	}
	
}
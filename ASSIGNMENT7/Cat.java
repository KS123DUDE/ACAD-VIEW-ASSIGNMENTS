abstract class Animals
{
	protected String color, breed, name;
	
	abstract void eat();
	void speak()
	{
		System.out.println("\n I am a Animal.");
		System.out.println("Name : " + name);
		System.out.println("Color : " + color);
		System.out.println("Breed : " + breed);
	}
}
class Cat extends Animals
{
	Cat(String color, String breed, String name)
	{
		this.color = color;
		this.breed = breed;
		this.name = name;
	}
	
	void eat()
	{
		System.out.println("\n Cat eat fishes. ");
	}
}
class A2
{
	public static void main(String[] args)
	{
		Cat c = new Cat("White","Persian Cat","Tom");
		c.eat();
		c.speak();
		System.out.println();
	}
}
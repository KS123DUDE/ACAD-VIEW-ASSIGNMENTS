interface Animals
{
	void speak();
	void eat();
}

class Dog implements Animals
{
	public void speak()
	{
		System.out.println("I am a DOG");
	}
	public void eat()
	{
		System.out.println("Dog eat food ");
	}
}
class Cat implements Animals
{
	public void speak()
	{
		System.out.println("I am a CAT");
	}
	public void eat()
	{
		System.out.println(" Cat eat food ");
	}
}
class A1
{
	public static void main(String[] args)
	{
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.speak();
		d.eat();

		c.speak();
		c.eat();
		
		}
}
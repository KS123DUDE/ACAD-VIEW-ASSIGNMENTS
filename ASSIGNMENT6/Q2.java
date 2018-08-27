
abstract class animals 
{
	String breed,name;
	abstract void eat();
	void speak() 
	{
		System.out.println("Barking");
	}
}
class dog extends animals
{
	dog(String breed,String name)
	{
	this.breed=breed;
	this.name=name;
	}
	void myDog() 
	{
		System.out.println("Name is: "+name);
		System.out.println("Breed is: "+breed);
	}

	void eat()
	{
		System.out.println("I eat meat.");
			}

}
 class Main 
 {

	public static void main(String[] args) 
	{
     animals a=new dog("Pitbull","Tommy");
	dog d=new dog("Pitbull","Tommy");
     d.myDog();
    a.eat();
	a.speak();
	}

}
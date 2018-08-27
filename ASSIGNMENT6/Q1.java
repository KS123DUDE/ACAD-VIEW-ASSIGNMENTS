 interface Animals 
{
    void speak();
    void eat();
}
    class Main
    {

    public static void main(String[] args) 
    {
      Dog a=new Dog();
      a.speak();
      a.eat();
      cat b=new cat();
      b.speak();
      b.eat();
	}
 }

 class Dog implements Animals
 {
	public void speak() 
	{
		System.out.println(" I bark bau bau.");
	}
	public void eat() 
	{
		System.out.println(" I eat bones.");
	}
 }
 class cat implements Animals
 {
		public void speak() 
		{
			System.out.println(" I meow meow.");
		}
		public void eat() 
		{
			System.out.println(" I eat fishes.");
		}
	 }
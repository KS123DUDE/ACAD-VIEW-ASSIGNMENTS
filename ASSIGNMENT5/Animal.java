 class Animal 
 {
   String breed;
   String color;

   void Speak()
   {
       System.out.println("Growl !!");
   }


   public static void main(String args[])
   {
       Animal a1=new Animal();
       Dog a2=new Dog();
       Cat a3=new Cat();

       a1.Speak();
       a2.Speak();
       a3.Speak();
   }

}
  class Dog extends Animal
     {
       String breed;
        String color;
        void Speak()
        {
          System.out.println("Bark Bau Bau !!");
                 }
              }

                 class Cat extends Animal
                 {
                 String breed;
                 String color;

                 void Speak()
                 {
                     System.out.println("Meow  Meow Meow!!");
                 }
              }
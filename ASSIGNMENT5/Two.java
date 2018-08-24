abstract class Vehicle
 {
	public abstract void start();
	public void stop()
	{
		System.out.println("Stopping Vehicle ");
	}
}
class TwoWheeler extends Vehicle
{
	public void start() 
	{
		System.out.println("Starting Two Wheeler");
	}
}
class FourWheeler extends Vehicle
{
	public void start() 
	{
		System.out.println("Starting Four Wheeler");
	}
}
 class Vehicle1
{
	public static void main(String[] args) {
		Vehicle my2Wheeler = new TwoWheeler();
		Vehicle my4Wheeler = new FourWheeler();
		my2Wheeler.start();
		my2Wheeler.stop();
		my4Wheeler.start();
		my4Wheeler.stop();
	}
}
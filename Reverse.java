import java.util.Scanner;
 class Reverse 
 {
	public static void main(String[] args) 
	{
		int Number, Remainder, Reverse = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Please Enter any Number you want to Reverse : ");
		Number = sc.nextInt();
		
		while(Number > 0) 
		{
			Remainder = Number %10;
			Reverse = Reverse * 10 + Remainder;
			Number = Number /10;
		}
		System.out.format("\n Reverse of entered number is = %d\n", Reverse);
	}
}
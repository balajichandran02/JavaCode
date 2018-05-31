/* Implementation of fish model in addition to the parrot class*/

class Fish
{
	void walk()
	{
		System.out.println("Fishes don't swim");
		System.out.println("Fishes don't walk");
		System.out.println("Fishes can swim");

	}
	void swalk()
	{
		System.out.println("Sharks are large and grey");
		System.out.println("Sharks eat other fish");

	}
	void cwalk()
	{
		System.out.println("Clownfish are small and colorful");
		System.out.println("Clownfish make jokes");
	}
	void sound()
	{
		
	}
}

class Dolphin
{
	String a="dddd";
	Dolphin()
	{
	}	
	 void sound()
	{
		System.out.println("Sound:"+a);
	}
}
/* Implementation of Fish model without inheritance*/

public class Solution3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Fish fish=new Fish();
  Fish shark=new Fish();
  Fish clownship=new Fish();
  fish.walk();
  shark.swalk();
  clownship.cwalk();
  Fish Dolphin=new Fish();
  Dolphin.sound();
	}

}

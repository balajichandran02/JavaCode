
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
}

class Dolphin
{
	
	Dolphin()
	{
	}	
	 void sound(String a)
	{
		System.out.println("Sound:"+a);
	}
}
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
  Fish Dolphin=new Fish("dfdds");
  Dolphin.sound();
	}

}

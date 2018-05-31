 
/* Implementation of multiple inheritance using Interface*/

interface Ani{
	void callSound();
	
	
}
class Bir implements Ani
{
	void fly()
	{
		System.out.println("Birds can fly");
	}
	public void callSound()
	{
		System.out.println("These birds can sound");
	}
	void sing()
	{
		System.out.println("These birds can sing");
	}
	void swim()
	{
		System.out.println("These birds can swim");
	}
	
}
class NBird extends Bir implements Ani
{
	void fly()
	{
		System.out.println("Birds dont fly");
	}
	void sing()
	{
		System.out.println("These birds wont sing");
	}
	void swim()
	{
		System.out.println("These can swim");
	}
	public void callSound()
	{
		System.out.println("These birds cannot sounds");
	}
}
 



public class Solution5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Bir bird=new Bir();
  NBird rooster=new NBird(); 
  bird.fly();
  bird.swim();
  rooster.fly();
  rooster.swim();
  NBird dolphin=new NBird();
  dolphin.fly();
  dolphin.callSound();
  dolphin.swim();
  dolphin.sing();
  
		
	}

}

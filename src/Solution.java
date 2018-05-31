
/*Code By Balaji Chandran for Singtel Assessment*/
class Animal
{
	void walk()
	{
		System.out.println("I am walking");
	}
}

class Bird extends Animal
{
	String sound;
	Bird()
	{		
	}
	Bird(String sound)
	{
		this.sound=sound;
	}
	void fly()
	{
		System.out.println("I am flying");
	}
/* Implementing sing() method*/	
	void sing()
	{
		System.out.println("I am singing");
	}
	void sound()
	{
		System.out.println("Sound:"+sound);
	}
}
/* Implementation of rooster model without inheritance*/
class rooster
{	String sound1;
	rooster()
	{	}	
	void sound()
	{
		System.out.println("Sound:"+sound1);
	}
}
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Bird bird=new Bird();
    bird.walk();
    bird.fly();
    bird.sing();
    /* Implementing two birds class with methods*/    
    Bird duck=new Bird("quack,quack");
    duck.sound();
    Bird chicken=new Bird("cluck,cluck");    
    chicken.sound();
    /* Implementing rooster model*/
    Bird rooster=new Bird("Cock-a-doodle-doo");
    rooster.sound();
	}

}


/* Implementing parrot() method using interface*/
interface Sound{
	
	public void method1();
	public void method2();
	public void method3();
}
/* Implementing Parrot class with sound() method*/

class Parrot implements Sound
{
	
	Parrot()
	{		
	}
	public void method1()
	{
		System.out.println("woof woof");
	}
	public void method2()
	{
		System.out.println("Meow");
	}
	public void method3()
	{
		System.out.println("Cock-a-doodle-doo");
	}
}
/* Implementing three different behaviour for single class*/

public class Solution2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parrot dog=new Parrot();
		dog.method1();
		Parrot cat=new Parrot();
		cat.method2();
		Parrot rooster=new Parrot();
		rooster.method3();
		
		
	}

}

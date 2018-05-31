/* Implementation of Butterfly model using interface*/

interface Animals{
	void callSound();
	
}
 class Butterfly implements Animals
{
	@Override
	public void callSound()
	{
		System.out.println("A butterfly can fly");
		System.out.println("A butterfly cannot make sound");
	}
	
}
 class Caterpillar implements Animals
{
	@Override
	public void callSound()
	{
		System.out.println("A caterpillar cannot fly");
		System.out.println("A caterpillar can walk");
	}
	
}


public class Solution4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				for(Animals animals1:new Animals[]{new Butterfly(),new Caterpillar()} )
		{
			animals1.callSound();
			
		}
		
	}

}

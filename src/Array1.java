import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To pick random number we use random function 
		
		Random r=new Random();
		int a[]=new int[20];                //int[20]=It denotes no.of elements
		for(int i=0;i<20;i++)
		{
			a[i]=r.nextInt(100);
			
			
			
			System.out.println(a[i]);
			
			}
		}
}


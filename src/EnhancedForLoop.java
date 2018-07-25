import java.util.Random;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random r=new Random();
		int a[]=new int[15];
		
		
		for(int i=0;i<15;i++)
		{
			a[i]=r.nextInt(50);		
		}
			
		for(int i:a)
		{
			
		System.out.println(i);
		}
	}
}
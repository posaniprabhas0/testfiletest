
public class BreakStatement {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
/*for(int i=1;i<=4;i++)
{
	for(int j=1;j<=4;j++)
	{
		
		System.out.print(" 01 ");
}
	System.out.println("");
	*/
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)//if j depends on i 
		{
			
			System.out.print(" 01 ");
	}
		System.out.println("");
		
	
	}
}

}
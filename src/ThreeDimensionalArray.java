
public class ThreeDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int a[]=new int[4];           It is 1-D array.we use one forloop for 1-D Array
		//int b[][]=new int[4][4];       It is 2-D array.we use two forloop for 2-D Array
		int c[][][]=new int[4][4][4];      //It is 3-D array.we use three forloop for 3-D Array
		
		/*for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					c[i][j][k]=i+j+k;
			System.out.println("" +c[i][j][k]);
			*/
		
		//solving 3-dimensional using enhanced forloop
		//for 1-D we dont need to use[]
		//for 2-D we  need to use[]
		//for 3-D we  need to use [][]
		for(int i[][]:c)    
		{
			for(int j[]:i)
			{
				for (int k:j)
				{
					//c[i][j][k]=i+j+k;
					System.out.println("" +k);
					
				}
					}
		}
		}
	}


public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {23,45,678,977};
int b[]= {123,435,6768,};
int c[]= {223,455,};
// int d[][]=new int [2][3];              it indicates 3 rows and 4 columns



int d[][]= {{23,45,678,977},   {123,435,6768,9787},       {223,455,6778,97887} };
		   
                            /*for(int i=0;i<4;i++)
                              System.out.println(b[i]);
                            */

        //to print all elements using forloop(this method is used only if we have equal columns)
            /*for(int i=0;i<3;i++)
            {
	        for(int j=0;j<4;j++)
	        {
		    System.out.print(d[i][j]+ " ");
		
	        }
	        System.out.println(" ");
            }
            */	


//to print all elements using Enhanced forloop
for(int i[]:d)
{
	for(int j:i)
		
	System.out.print(j+" ");


	}
System.out.println(" ");
	}
}

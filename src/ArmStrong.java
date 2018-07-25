
public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=153,j,k=0;
int m=i;
while(i>0)
{
	j=i%10;
	i=i/10;
	k=k+j*j*j;
}
if(k==m)
	System.out.println("print Armstrong");

//1 5 3=1*1*1+5*5*5+3*3*3=153(if triple multiples  of numbers is equal to final number)
else
	System.out.println("Not Armstrong");
			
}
	}



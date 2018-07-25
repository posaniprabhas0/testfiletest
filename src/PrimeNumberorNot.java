import java.util.Scanner;

public class PrimeNumberorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean prime=true;
		System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();

for(int i=2;i<num;i++)
{
	if(num%i==0)
	{
		prime=false;
	
	
		System.out.println("prime number");
	}
	
else	
		System.out.println("not prime number");

}
}
}
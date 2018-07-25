import java.util.Scanner;

public class fibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=1,c=1;
//Scanner sc=new Scanner(System.in);

//System.out.println("print any number");
//int n=sc.nextInt();

while(a<=100)
	{
	a=b+c;
	System.out.print(a);
	
	b=c;
	c=a;
	System.out.println();
	}


	}

}

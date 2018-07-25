import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
/*Scanner sc=new Scanner(System.in);		
java.lang.String s1;
java.lang.String s2;
 
 System.out.println("Enter two strings");
 s1=sc.nextLine();
 s2=sc.nextLine();
 java.lang.String s3=s1.concat(s2);                                //we can also use s3=s1+s2
 System.out.println("sum of strings is "+ s3);
*/
		
		
		  Scanner sc=new Scanner(System.in);
		java.lang.String s1;
		java.lang.String s2;
		  System.out.println("Enter two strings");
		  s1=sc.nextLine();
		  s2=sc.nextLine();
		  
		  int a=s1.length();
		  int b=s2.length();
		   java.lang.String s3=s1+s2;
		   
		   int c=s3.length();
		   
		   System.out.println("the length of string s1 "  +  a);
		   System.out.println("the length of string s2 "  +  b);
		   System.out.println("the length of string s3 "  +   c);
		   
		   
		   
		s1=s1.toUpperCase();     //To  convert to upper case
		System.out.println("the upper case letters are " + s1);
		
	}

}

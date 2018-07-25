
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=123,r,s=0;
int t=i;
while(i>0)
{
    r=i%10;
	i=i/10;
	s=s*10+r;
}
if(t==s)

	System.out.println("palindrome");//if same number we get after reversing it is palindrome like 12121
else
	System.out.println("not palindrome");
}
	}

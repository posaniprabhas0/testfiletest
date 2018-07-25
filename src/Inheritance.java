
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Sub obj=new Sub();
obj.num1=31;
obj.num2=5;
obj.sum();
System.out.println(obj.result);
obj.substart();
System.out.println(obj.result);	
	}
}
		
		
		
class Add 
{
int num1,num2,result;
public void sum()
{
 result=num1+num2;
}
}


class Sub extends Add         //Inheritance is nothing but extending one class to another class.it is single level.
{                             //if we add one more class then it is multi level inheritance
	public void substart()
	{
		result=num1-num2;
	}
}

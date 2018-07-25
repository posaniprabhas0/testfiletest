
public class AbstractClass {

	public static void main(String[] args) {
		
	
		prabhas obj = new prabhas();
		
		obj.internet();
	
	}
}

		
		
abstract class XYZ                 
{
	public void phone()
	{
	System.out.println("iphone 7s");
	}
	public abstract void call();
	public abstract void message();
	public abstract void internet();
	}

class prabhas extends XYZ{
	
public void call()
{
	System.out.println("prabhas call");
	}
public void message()
{
	System.out.println("prabhas message");
	}
public void internet()
{
	System.out.println("prabhas internet");
	}
}

	
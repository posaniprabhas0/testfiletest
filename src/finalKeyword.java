
public class finalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		/*final int i=5;
		 i++;
        System.out.println(i);          //it is used for final variable.once it is final we cannot change it by adding i++
        */
		
B obj=new B();
obj..add();
	}
}

	class A
	{
		final public void add()                                   
		{
			System.out.println("hello to everybody");
		}
	}
class B extends A                                    //once the class  is final  we cannot extract it to other class(if final class A we cannot extract to class B)
{
	public void add()                                //once the method is final  we cannot extract it to other class
	
	{
		System.out.println("hi everyone");
	}
}
	


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj=new B();
obj.show();
obj.sh();
		
	}
}
		
interface pinku                                       //interface vikky
{                                                       //  { 
	public void show();                                  //   public void show();
                                                         //    }
}
	

class B implements pinku                           //if we create one more inteface we can implement it in class at a time[class B implements pinku,vikky]
{
	public void show()
	{
		System.out.println("hello world");
	}
	public void sh()
	{
		System.out.println("hi");
	}
}
	

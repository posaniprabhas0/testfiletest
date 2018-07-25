
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

BC obj=new BC();                          
obj.sub();
	}

}
 interface a
 {
	  public default void sub()
	  
	 {
	 System.out.println("a");
 }
 }
 interface b
 {
	  public default void sub()
	
	 {
		 System.out.println("b");
	 }
 }
  class AB
  
  {
	  public void sub()
	  {
		System.out.println("AB");  
	  }
  }
  class BC extends AB implements a                              //if we call class with class and interface the output we get is only class.Because it is given high priority
  { 
	  public  void sub()
	  {
		  //System.out.println("BC");
	  }
  

}

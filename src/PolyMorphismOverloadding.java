
public class PolyMorphismOverloadding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Pinku obj=new Pinku();
       obj.add(5);
	   }
        }   	
		
		
    class Pinku                                  //	It is polymorphism method overloading
    { 
	public void add()
	{
		System.out.println("hello world");
	}
	public void add(int i)
	{
		System.out.println("hi to everyone");
	}
    }
	

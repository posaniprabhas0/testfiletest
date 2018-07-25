
public class PolyMorphismOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
xyz obj=new xyz();   // we can written this as new xyz().add();.[ where new xyz() is anonmoyous object]
obj.add();
	}

	}
		
		
		
		
    class Abcd                                  //It is method over riding
     {
	public void add()
	{
	System.out.println("pinku");
	
	}
    }

     class xyz extends Abcd
    {
	public void add()
	{
		System.out.println("vikky");
	}
}
	

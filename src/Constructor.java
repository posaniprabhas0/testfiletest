
public class Constructor {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Abc obj=new Abc(5,6.5);
	}
	  }

      class Abc
       {
          public Abc()                               //if we dont give anything in new Abc() it will take "abcddfrghj"
       {
     	System.out.println("abcddfrghj");
     	}
        public Abc(int i)                             //if we give int value in new Abc() it will take "a to z"
      	{                                             //if we dont have  public Abc(int i) it will take double output"
      	System.out.println("a to z" );
      	}
		
        public Abc(int i,double d)                    //if we  give int and double in new Abc() it will take "pinku"
       {                                              
        System.out.println("pinku" );
       }
       }


		
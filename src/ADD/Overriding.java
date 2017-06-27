package ADD;

class A
{
		void cal(double x)
		{
		            System.out.println("square value="+(x*x));
		}
}
class B extends A
{
		void cal(double x)
		{
		            System.out.println("square root="+Math.sqrt(x));
		}
}
public class Overriding
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//based on the object created JVM decides which method to invoke
		
		A a=new A();
        a.cal(15);
        
        B b=new B();
        b.cal(49);

	}

}

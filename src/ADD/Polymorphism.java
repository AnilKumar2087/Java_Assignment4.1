package ADD;
class Sum
{
		void add(int a, int b)
		{
		            System.out.println("Sum of two="+(a+b));
		}

		void add(int a, int b,int c)
		{
		            System.out.println("Sum of three="+(a+b+c));
		}
}
public class Polymorphism
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Sum s=new Sum();
        
        s.add(10,15);//method in sum class with two parameters is invoked
        s.add(10,20,30);//method in sum class with three parameters is invoked

	}

}

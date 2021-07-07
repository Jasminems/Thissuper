/*A Java program to call constructor using this()*/
class A
{
	A()
	{
		System.out.println("Hello");
	}
	A(int x)
	{
		this();				//calling constructor A()using *this*
		System.out.println(x);
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		A a=new A(10);
	}
}

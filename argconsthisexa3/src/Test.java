/*A Java program to call argument constructor using this()*/
class A
{
	A()
	{
		this(5);
		System.out.println("Hello");
	}
	A(int x)
	{
		System.out.println(x);
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		A a=new A();
	}
}

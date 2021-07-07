/*A Java program to call constructor of the parent class using super()*/
class A
{
	A()
	{
		System.out.println("Class A is created");
	}
}
class B extends A
{
	B()
	{
		super();
		System.out.println("Class B is created");
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		B b=new B();

	}

}

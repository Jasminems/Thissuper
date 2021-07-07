/*A Java program use of super() and this()*/
//super()
class Parent
{
	Parent()
    {
        System.out.println("Parent class");
    }
}
class Child extends Parent
{
    Child()
    {
    	//super() is used to call parent class and it is used in constructor
        super();
        System.out.println("Child class");
    }
    void display()
	{
    	//super() cannot be used in methods
    	super();
		System.out.println("Created");
	}
    public static void main(String[] args)
    {
        new Child();
        System.out.println("Inside Main");
    }
}

//this()
class C {
    C()
    {
    	//this() is used to call current class constructor
        this(10);
        System.out.println("Current class is created");
    }
    void display()
    {
    	//this() cannot be used in method
    	this(10);
    	System.out.println();
    }
    C(int a)
    {
    	System.out.println("Constructor with one argument");
    }
    public static void main(String[] args)
    {
        new C();
        System.out.println("Inside Main");
    }
}
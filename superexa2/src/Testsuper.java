/*A Java Program to print fields/instance members of the parent class using super*/
class Fruit
{
	String color="Red";
}
class Mango extends Fruit
{
	String color="Yellow";
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
class Testsuper 
{
	public static void main(String[] args) 
	{
		Mango m=new Mango();
		m.printcolor();
	}
}

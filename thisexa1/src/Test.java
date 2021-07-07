/*A Java program to print fields/instance members using this*/
class Student
{
	int rollno;
	String name;
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	void display()
	{
		System.out.println(rollno+" "+name+"");
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		Student s=new Student(1,"Jasmin");
		Student s1=new Student(2,"Mithun");
		Student s2=new Student(3,"Santhosh");
		s.display();
		s1.display();
		s2.display();
	}

}

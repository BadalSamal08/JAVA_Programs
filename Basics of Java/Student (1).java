class Student
{
	int roll;
	String name;
	Student(int rl,String nm)
	{
		roll=rl;
		name=nm;
	}
	void display()
	{
		System.out.println(roll+" "+name);
	}
}
class Engineeringstudent extends Student
{
	int mark;
	Engineeringstudent(int r1,String nm,int mrk)
	{
		super(r1,nm);
		mark=mrk;
	}
	void display()
	{
		System.out.println("Engineering Student");
		System.out.println();
		System.out.println(roll+" "+name+" "+mark);
		System.out.println();
	}
}
class Medicalstudent extends Student
{
	int mark;
	Medicalstudent(int r1,String nm,int mrk)
	{
		super(r1,nm);
		mark=mrk;
	}
	void display()
	{
		System.out.println("Medical Student");
		System.out.println();
		System.out.println(roll+" "+name+" "+mark);
	}
}
class Studentdetails
{
	public static void main(String Args[])
	{
		Student s1;
		s1=new Engineeringstudent(4,"Dharmaraj",91);
		s1.display();
		s1=new Medicalstudent(3,"Isha",96);
		s1.display();
	}
}

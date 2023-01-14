import java.util.*;
class Person
{
	String name;
	int age;
	Person(String nm,int ag)
	{
		name=nm;
		age=ag;
	}
}
class Emp extends Person
{
	int Eno;
	Emp(String nm,int ag,int eno)
	{
		super(nm,ag);
		Eno=eno;
	}
}
class FulltimeEmp extends Emp
{
	double monthly_salary;
	FulltimeEmp(String nm,int ag,int eno,double mon_sal)
	{
		super(nm,ag,eno);
		monthly_salary=mon_sal;
	}
	public String toString()
	{
		System.out.println(name+" "+age+" "+Eno+" "+monthly_salary);
		return "x";
	}
}
class ParttimeEmp extends Emp{
	double hourly_salaray;
	ParttimeEmp(String nm,int ag,int eno,double hr_sal)
	{
		super(nm,ag,eno);
		hourly_salaray=hr_sal;
	}
	public String toString()
	{
		System.out.println(name+" "+age+" "+Eno+" "+hourly_salaray);
		return "x";
	}
}
class Employee
{
	public static void main(String Args[])
	{
		FulltimeEmp p1= new FulltimeEmp("Ram",25,101,40000);
		p1.toString();
		ParttimeEmp p2=new ParttimeEmp("Shyam",28,90,60000);
		p2.toString();
	}
}


public class Student {
	String name;
	int age;
	Student(String name,int age)
	{
		this.name= name;
		this.age=age;
		
	}
	@Override
	public
	String toString()
	
	{
		return name +"@"+ age;

		
	}
	public boolean equals(Object O)
	{
	try
		{
		String name1= this.name;
		int age1= this.age;
		Student s=(Student )O;
		String name2=s.name;
		int age2=s.age;
		if(name1.equals(name2)&& age1==age2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	catch(ClassCastException e)
	{
		return false;
	}
	catch(NullPointerException e)
	{
		return false;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("pankaj",30);
		Student s2 = new Student("pankaj",30);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);

	}

}

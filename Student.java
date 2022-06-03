/*==================================
Foundations of Computer Science
Student: Kai Koo
id: a1739831
Semester: 1
Year: 2022
Practical Exam Number: 5
===================================*/
public class Student 
{
    private String name = "";
    private int age = 0;
    private int period = 0;

    //default constructor
    public Student()
    {
        this.name = "unknown"; //will set name datamember to unknown
        this.age = 0;
        this.period = 0;
    }

    //parameterised constructor to set name, age, and period.
    public Student(String tmpName, int tmpAge, int tmpPeriod)
    {
        this.name = tmpName;
        this.age = tmpAge;
        this.period = tmpPeriod;
    }

    //implementing accessors for Student attributes
    public String getName()
    {
      return this.name;
    }

    public int getAge()
    {
      return this.age;
    }

    public int getPeriod()
    {
      return this.period;
    }

	//implementing mutators for Student attributes
	  public void setName(String tmpName) 
    {
		  this.name = tmpName;
	  }

	  public void setAge(int tmpAge) 
    {
		  this.age = tmpAge;
	  }

	  public void setPeriod(int tmpPeriod) 
    {
		  this.period = tmpPeriod;
	  }

    //implementing a printStudent method which will print name, age and also 
    public void printStudent()
    {
      System.out.println("Printing student record");
      System.out.println("Name:   " + name);
      System.out.println("Age:    " + age);
      System.out.println("Period: " + period);
    }
}

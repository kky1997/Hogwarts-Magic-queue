/*==================================
Foundations of Computer Science
Student: Kai Koo
id: a1739831
Semester: 1
Year: 2022
Practical Exam Number: 5
===================================*/
public class Node 
{
    private Node next = null;
    private Student info = null;

    //default constructor
    public Node()
    {
        this.next = null;
        this.info = null;
    }
    //parameterised constructor to set Student object to info
    public Node(Student tmpStudent)
    {
        this.next = null;
        this.info = tmpStudent;
    }

    //Defining accessors for data members
	public Node getNext() 
    {
		return this.next;
	}

	public Student getInfo() 
    {
		return this.info;
	}

	//Defining mutators for data members
	public void setInfo(Student info) 
    {
		this.info = info;
	}

	public void setNext(Node next) 
    {
		this.next = next;
	}
}

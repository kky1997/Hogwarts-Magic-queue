/*==================================
Foundations of Computer Science
Student: Kai Koo
id: a1739831
Semester: 1
Year: 2022
Practical Exam Number: 5
===================================*/
public class Queue 
{
    //prviate data members (back and front pointers for the queue)
    private Node back = null;
    private Node front = null;

    //default constructor for queue
    public Queue()
    {
        this.front = null;
        this.back = null;

    }

    public void enqueue(Student tmpStudent) 
    {
        //create a new node to pass the Student object through (using node class' parameterised constructor)
        
        Node tmpNode = new Node(tmpStudent);
        
        //check if queue is empty. If it is then new node is both front and back of queue
        
        if (this.back == null) 
        {
            this.front = this.back = tmpNode;
            return;    
        }
        this.back.setNext(tmpNode); //otherwise we set the current back to point to the new Node

        this.back = tmpNode; //set back pointer to point to new node
    }
    
    public Student dequeue() 
    {
        // If queue is empty, we retrun null.
        if(front==null)
        {
            return null;
        }
        //save the front student info to a tmp Student object
        Student tmpFront = front.getInfo();
        front = front.getNext(); //assign front to the next Node in line (disconnecting the current front from the queue)
        return tmpFront; //return the tmp Node (holding the previous front node's Student object)
        
    }

    public String peek() //method to return students name at front of the queue
    {
        if(front==null) //if front is null then queue is empty, return nothing
        {
            return "";
        }

        else //otherwise we return the front node, get info of the node, get name from the student object
        {
            return front.getInfo().getName();
        }
    }

    public void displayQueue() 
    {
        if(front == null) //check if queue is empty, if it is then print the message for the user
        {
            System.out.println("There are no students waiting for a scholarship");
        }
        else
        {
            //tmpNode will start at the front (acting like a pointer) 
            Node tmpNode = this.front;
            //counter for number of students in the queue
            int i = 1; 
            
            //traversing queue using while loop (so long as pointer is not pointing to null)
            while (tmpNode != null) 
            {
            
                Student current = tmpNode.getInfo(); //get the Student object from that Node and assign it to current
                
                //print that student's information, using accessors and also prviate helper function (periodPrefix) to print in correct format
                System.out.println("#" + i + " " + current.getName() + ", " + current.getAge() + " years old, " + current.getPeriod() + periodPrefix(current.getPeriod()) + " year in Hogwarts;");
                
                //moving pointer to next student by updating the tmpNode
                tmpNode = tmpNode.getNext();
                //incrementing counter for each student in  queue
                i++; 
            }
        }
    }

    //private helper function to assign the correct prefix to the period
    private String periodPrefix(int period) //pass in an int (like student period)
    {
        //check to see what period they are and return the correct prefix
        if (period == 1) 
	{ 
            return "st";
        } 
	else if (period == 2) 
	{
            return "nd";
        } 
	else if (period == 3) 
	{
            return "rd";
        } 
	else 
	{
            return "th";
        }
    }

}

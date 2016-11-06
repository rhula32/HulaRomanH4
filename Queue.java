/**
 * Queue class this is used to create a Queue object & perform operations on it
 * This class contains the following:
 * 1. Creates a Queue object using the constructor
 * 2. Getters & Setters for Queue operations
 * 3. The operative methods enqueue, dequeue, peek, & print
 */ 
public class Queue 
{
  Node first;
  Node last;

  /**
   * Constructor that sets the first & last nodes of the queue equal to null
   */ 
  Queue() 
  { 
    this.first = null;
    this.last = null;
  }
  
  /**
   * Method that returns the value of the first element of the queue
   * @return this.first    
   */
  public Node getFirst() 
  {
    return this.first;
  }
  
  /**
   * Method that returns the value of the last element of the queue
   * @return this.last
   */ 
  public Node getLast() 
  {
    return this.last;
  }
  
  /**
   * Method that sets the new value of the first element of the queue
   * @param newFirst    A Node object that represents the new value for the first element of the queue
   */ 
  public void setfirst(Node newFirst) 
  {
    if (this.first == this.last)
    {
      this.last = newFirst;
      this.first = newFirst;
    }
  }
  
  /**
   * Method that sets the new value of the last element of the queue
   * @ param newLast    A Node object that represents the new value for the last element of the queue
   */ 
  public void setLast(Node newLast) 
  {
    if (this.first == this.last)
      this.first = newLast;
    this.last = newLast;
  }
  
  /**
   * Method that adds an element to the beginning of the queue (FIFO)
   * @param newString    A String object that is added to the end of the queue
   */ 
  public void enqueue(String newString) 
  {
    Node newNode = new Node(newString);
    
    if (this.isEmpty()) 
    {
      this.first = newNode;
      this.last = newNode;
    }
    else 
    {
      last.setNext(newNode);
      this.last = newNode;
    }
  }
  
  /**
   * Method that removes the element at the end of the queue (FIFO)
   * For example: The first element added to the queue is the first removed!
   */ 
  public Node dequeue() 
  {
    Node current = this.first;
    
    if (this.first == this.last) 
    {
      this.first = null;
      this.last = null;
    }
    else
    {
      this.first = first.getNext();
      current.setNext(null);
    }
    return(current);
  }
  
  /**
   * Method that returns an element from the end of the queue
   * @return current
   */ 
  public Node peek() 
  {
    Node current = new Node(this.first.getString());
    return(current);
  }
  
  /**
   * Method that returns the boolean value of this.first after it is set to "null"
   * @return this.first 
   */ 
  public boolean isEmpty() 
  {
    return this.first == null;
  }
  
  /**
   * Method that prints the elements of the queue in FIFO order
   */ 
  public void print() 
  {
    if (this == null) 
    {
      System.out.println("The Queue is Empty!");
    } 
    else
    {
      Node current = this.first;
      while(current != null) 
      {
        current.print();
        current = current.getNext();
      }
      System.out.println("");
    }
  }
}
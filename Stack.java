/**
 * Stack class this is used to create a Stack object & perform operations on it
 * This class contains the following:
 * 1. Creates a Stack object using the constructor
 * 2. Getters & Setters for Stack operations
 * 3. The operative methods push, pop, peek, & print
 */ 
public class Stack 
{
  Node first;

  Stack() 
  { 
    this.first = null;
  }
  
  /**
   * Method that returns the first element of the stack
   * @return this.first
   */
  public Node getFirst() 
  {
    return this.first;
  }

  /**
   * Method that sets the value of the first element stack to the new element entered
   * @param newFirst    The new value of the first element of the stack
   */ 
  public void setFirst(Node newFirst) 
  {
    this.first = newFirst;
  }

  /**
   * Method that adds a new string element to the top of the stack (LIFO)
   */ 
  public void push(String newString) 
  {
    Node newNode = new Node(newString);
 
    if (this.isEmpty()) 
    {
      this.first = newNode;
    }
    else 
    {
      newNode.setNext(first);
      first = newNode;
    }
  }
  
  /**
   * Method that removes the string element from the top of the stack (LIFO)
   */ 
  public Node pop() 
  {
    Node current = this.first;
    this.first = first.getNext();
    current.setNext(null);
    return(current);
  }
  
  /**
   * Method that returns the value of the top element of the stack
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
   * Method that prints the elements of the stack in LIFO order
   */ 
  public void print() 
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
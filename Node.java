 /**
  * Node class that is used to perform node operations
  * This class contains the following:
  * 1. Creates a node, while assigning an element & it's preceding & succeeding references to the node
  * 2. Getters & Setters for node operations
  */
public class Node
{
  String string;
  Node next;
  Node prev;
  
  /**
   * Constructor that stores the element & references to the successor & predecessor in the node
   * @param str    A string variable that is assigned to the element of the node
   * @param n    A Node object that is assigned to the succeeding reference of the node
   * @param p    A Node object that is assigned to the preceding reference of the node
   */ 
  Node(String str, Node n, Node p)
  {
    string = str;
    next = n;
    prev = p;
  }
    
  /**
   * Constructor that assigns values of the element, preceding, & succeeding references of the node
   * Sets the element equal to "str", and sets both references to "null"
   * @param str    A string variable that is assigned to the element of the node
   */
  Node(String str)
  {
    this(str, null, null);
  }
  
  /**
   * Method that returns the value of the string element of the node
   * @return this.string    
   */ 
  public String getString()
  {
    return this.string;
  }
  
  /**
   * Method that returns the value of the succeeding reference of the node
   * @return this.next
   */ 
  public Node getNext()
  {
    return this.next;
  }
  
  /**
   * Method that returns the value of the preceding reference of the node
   * @return this.prev
   */ 
  public Node getPrev()
  {
    return this.prev;
  }
  
  /**
   * Method that sets the value of this.string equal to the parameter "newString"
   * @param newString    A new variable that will be used to refer to the element of the node
   */ 
  public void setString(String newString)
  {
    this.string = newString;
  }
  
  /**
   * Method that sets the value of this.next equal to the parameter "newNext"
   * @param newNext    A new variable that will be used to refer to the succeeding reference of the node
   */ 
  public void setNext(Node newNext)
  {
    this.next = newNext;
  }
  
  /**
   * Method that sets the value of this.prev equal to the parameter "newPrev"
   * @param newPrev    A new variable that will be used to refer to the preceding reference of the node
   */ 
  public void setPrev(Node newPrev)
  {
    this.prev = newPrev;
  }
  
  /**
   * Method that prints the contents of the Node "string"
   */ 
  public void print() 
  {
    System.out.print(string + " " );
  }
}
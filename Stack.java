public class Stack 
{
  Node first;

  Stack() 
  { 
    this.first = null;
  }
  
  public Node getFirst() 
  {
    return this.first;
  }

  public void setFirst(Node newFirst) 
  {
    this.first = newFirst;
  }

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
  
  public boolean isEmpty() 
  {
    return this.first == null;
  }
  
  public Node pop() 
  {
    Node current = this.first;
    this.first = first.getNext();
    current.setNext(null);
    // node return the dequeued
    return(current);
  }
  
  public void deleteList() 
  {
    this.first = null;
  }
  
  public void println() 
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
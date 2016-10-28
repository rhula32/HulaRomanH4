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
    
    // if list is empty, 
    //add data to new head node
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
    // tests if the list is empty
    return this.first == null;
  }
  
  public Node pop() 
  {
    // temporary node (to return)
    Node temporary = this.first;
    this.first = first.getNext();
    // isolate tmp node before returning
    // we wouldn't have to do this if
    // we were returning an int instead of
    // a Node
    temporary.setNext(null);
    // node return the dequeued
    return(temporary);
  }
  
  public void deleteList() 
  {
    this.first = null;
  }
  
  public void println() 
  {
    // local Node variable to keep track of where we are
    // start at the head of the list
    Node current = this.first;
    // loop through until we get to end of list
    while(current != null) 
    {
      current.print(); // print current node
      // move current to the next node
      current = current.getNext();
    }
    System.out.println("");
  }  
}
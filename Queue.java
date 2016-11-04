public class Queue 
{
  Node first;
  Node last;

  Queue() 
  { 
    this.first = null;
    this.last = null;
  }
  public Node getFirst() 
  {
    return this.first;
  }
  
  public Node getLast() 
  {
    return this.last;
  }
  
  public void setfirst(Node newFirst) 
  {
    if (this.first == this.last)
      this.last = newFirst;
    this.first = newFirst;
  }
  
  public void setLast(Node newLast) 
  {
    if (this.first == this.last)
      this.first = newLast;
    this.last = newLast;
  }
  
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
  
  public Node peek() 
  {
    Node temporary = new Node(this.first.getString());
    return(temporary);
  }
  
  public boolean isEmpty() 
  {
    return this.first == null;
  }
  
  public void deleteQueue() 
  {
    this.first = null;
    this.last = null;
  }
  
  public void println() 
  {
    if (this == null) 
    {
      System.out.println("null");
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
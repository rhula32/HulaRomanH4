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
    
    // if list is empty, 
    //add data to new node at both head & tail
    if (this.isEmpty()) 
    {
      this.first = newNode;
      this.last = newNode;
    }
    else 
    // add to tail
    {
      // make former tail's next the new node
      // to put new node on end
      last.setNext(newNode);
      // move tail to last item in queue
      this.last = newNode;
    }
  }
  
  public Node dequeue() 
  {
    // temporary node (to return)
    Node temporary = this.first;
    
    // check if there is more than one
    // item in queue
    if (this.first == this.last) 
    {
      this.first = null;
      this.last = null;
    }
    else
    {
      this.first = first.getNext();
      // isolate tmp node before returning
      // we wouldn't have to do this if
      // we were returning an int instead of
      // a Node
      temporary.setNext(null);
    }
    // node return the dequeued
    return(temporary);
  }
  
  // returns deep copy of node from 
  // front node of queue
  public Node peek() 
  {
    Node temporary = new Node(this.first.getString());
    return(temporary);
  }
  
  public boolean isEmpty() 
  {
    // tests if the list is empty
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
}
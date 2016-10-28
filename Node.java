public class Node 
{
  private String string;
  private Node next;

  Node(String s) 
  { 
    this.string = s; 
    this.next = null;
  }
    
  public String getString()
  {
    return this.string;
  }
  
  public Node getNext() 
  {
    return this.next;
  }
  
  public void setString(String newString) 
  {
    this.string = newString;
  }
  
  public void setNext(Node newNext) 
  {
    this.next = newNext;
  }
  
  public void print() 
  {
    System.out.print(string + " " );
  }
}
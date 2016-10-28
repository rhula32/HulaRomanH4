public class Testing 
{
  public static void main (String [] args) 
  {
    Queue myQueue = new Queue();
    Stack myStack = new Stack();
    
    System.out.println("Pushing these elements into the stack: ");
    myStack.push("Magic");
    myStack.push("Michael");
    myStack.push("Larry");
    myStack.push("Russell");
    myStack.push("Abdul-Jabbar");
    myStack.println();
    System.out.println();
    
    System.out.println("Enqueuing these elements into the queue: ");
    myQueue.enqueue("Riley");
    myQueue.enqueue("Jackson");
    myQueue.enqueue("Auerbach");
    myQueue.enqueue("Kundla");
    myQueue.enqueue("Popovich");
    myQueue.println();
    System.out.println();
  }
}
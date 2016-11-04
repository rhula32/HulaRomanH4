public class Testing 
{
  public static void main (String [] args) 
  {
    Queue myQueue = new Queue();
    Stack myStack = new Stack();
    
    System.out.println("THIS IS A DEMONSTRATION OF THE STACK CLASS: ");
    myStack.push("Magic");
    myStack.println();
    myStack.push("Michael");
    myStack.println();
    myStack.push("Larry");
    myStack.println();
    myStack.push("Duncan");
    myStack.println();   
    myStack.push("Abdul-Jabbar");
    myStack.println();
    myStack.pop();
    myStack.println();
    myStack.pop();
    myStack.println();
    myStack.pop();
    myStack.println();
    myStack.pop();
    myStack.println();
    myStack.pop();
    myStack.println();
    myStack.push("West");
    myStack.println();
    myStack.push("Robertson");
    myStack.println();
    myStack.push("Baylor");
    myStack.println();
    myStack.push("Russell");
    myStack.println();
    myStack.push("Chamberlain");
    myStack.println();
    
    System.out.println();
    
    System.out.println("THIS IS A DEMONSTRATION OF THE QUEUE CLASS: ");
    myQueue.enqueue("Riley");
    myQueue.println();
    myQueue.enqueue("Jackson");
    myQueue.println();
    myQueue.enqueue("Auerbach");
    myQueue.println();
    myQueue.enqueue("Kundla");
    myQueue.println();
    myQueue.enqueue("Popovich");
    myQueue.println();
    myQueue.dequeue();
    myQueue.println();
    myQueue.dequeue();
    myQueue.println();
    myQueue.dequeue();
    myQueue.println();
    myQueue.dequeue();
    myQueue.println();
    myQueue.dequeue();
    myQueue.println();
    myQueue.enqueue("Wooden");
    myQueue.println();
    myQueue.enqueue("Rupp");
    myQueue.println();
    myQueue.enqueue("Knight");
    myQueue.println();
    myQueue.enqueue("Smith");
    myQueue.println();
    myQueue.enqueue("Coach K");
    myQueue.println();
  }
}
public class Testing 
{
  public static void main (String [] args) 
  {
    Queue myQueue = new Queue();
    Stack myStack = new Stack();
    
    //Push strings into a stack to create a stack & print
    System.out.println("Demonstrating the stack operations: ");
    myStack.push("Magic");
    myStack.println();
    myStack.push("Scott");
    myStack.println();
    myStack.push("Worthy");
    myStack.println();
    myStack.push("Rambis");
    myStack.println();
    myStack.push("Abdul-Jabbar");
    myStack.println();
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
    System.out.println();
    
    //Enqueue strings into a queue to create a queue & print
    System.out.println("Demonstrating the queue operations: ");
    myQueue.enqueue("Johnson");
    myQueue.println();
    myQueue.enqueue("Ainge");
    myQueue.println();
    myQueue.enqueue("Bird");
    myQueue.println();
    myQueue.enqueue("McHale");
    myQueue.println();
    myQueue.enqueue("Parish");
    myQueue.println();
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
    System.out.println();
    
    //Move strings from a stack to a queue & print in the same order
    System.out.println("Moving the contents of the stack to a queue: ");
    Queue newQueue = new Queue();
    newQueue = stackToQueue(myStack);
    newQueue.println();
    
    //Move strings from a queue to a stack & print in the same order
    System.out.println("moving the contents of the queue to a stack: ");
    Stack newStack = new Stack();
    newStack = queueToStack(myQueue);
    newStack.println();
  }
  
  public static Queue stackToQueue(Stack stack)
  {
    Queue queue = new Queue();
    while(!stack.isEmpty());
    {
      queue.enqueue(stack.pop().getString());
    }
    return(queue);
  }
  
  public static Stack queueToStack(Queue queue)
  {
    Stack stack = new Stack();
    while(!queue.isEmpty());
    {
      stack.push(queue.dequeue().getString());
    }
    return(stack);
  }
  
  public static void stackToStack()
  {
  }
}
  

  
/**
 * Testing class is used to demonstrate & test the stack & queue operations
 * This class contains the following:
 * 1. A method that transfers elements from a stack to a queue
 * 2. A method that transfers elements from a queue to a stack
 * 3. A method that transfers elements from a stack to another stack
 * 4. A main method that tests & prints theses methods
 */ 
public class Testing 
{
  public static void main (String [] args) 
  {
    //Create the first stack object
    Stack lakersCenters = new Stack();
    lakersCenters.push("Mikan");
    lakersCenters.push("Lovelette");
    lakersCenters.push("Chamberlain");
    lakersCenters.push("Abdul-Jabbar");
    lakersCenters.push("O'Neal");
    System.out.println("Popping & Printing the elements of the first stack object: ");
    lakersCenters.pop().print();
    lakersCenters.pop().print();
    lakersCenters.pop().print();
    lakersCenters.pop().print();
    lakersCenters.pop().print();
    System.out.println("Re-pushing the elements back into the stack for further use: ");
    lakersCenters.push("Mikan");
    lakersCenters.push("Lovelette");
    lakersCenters.push("Chamberlain");
    lakersCenters.push("Abdul-Jabbar");
    lakersCenters.push("O'Neal");
    System.out.println();
    
    //Create a queue object
    Queue lakersForwards = new Queue();
    lakersForwards.enqueue("Pollard");
    lakersForwards.enqueue("Mikkelsen");
    lakersForwards.enqueue("Baylor");
    lakersForwards.enqueue("Worthy");
    lakersForwards.enqueue("Gasol");
    System.out.println("Dequeueing & Printing the elements of the queue: ");
    lakersForwards.dequeue().print();
    lakersForwards.dequeue().print();
    lakersForwards.dequeue().print();
    lakersForwards.dequeue().print();
    lakersForwards.dequeue().print();
    System.out.println("Re-enqueuing the elements back into the stack for further use: ");
    lakersForwards.enqueue("Gasol");
    lakersForwards.enqueue("Worthy");
    lakersForwards.enqueue("Baylor");
    lakersForwards.enqueue("Mikkelsen");
    lakersForwards.enqueue("Pollard");
    System.out.println();
    
    //Create the second stack object
    Stack lakersGuards = new Stack();
    lakersGuards.push("Martin");
    lakersGuards.push("West");
    lakersGuards.push("Goodrich");
    lakersGuards.push("Magic");
    lakersGuards.push("Bryant");
    System.out.println("Popping & Printing the elements of the second stack object: ");
    lakersGuards.pop().print();
    lakersGuards.pop().print();
    lakersGuards.pop().print();
    lakersGuards.pop().print();
    lakersGuards.pop().print();
    System.out.println("Re-pushing the elements back into the stack for further use: ");
    lakersGuards.push("Bryant");
    lakersGuards.push("Magic");
    lakersGuards.push("Goodrich");
    lakersGuards.push("West");
    lakersGuards.push("Martin");
    System.out.println();
    
    //Move strings from stack lakersCenters to queue lakersBestCenters & print; Should print in identical order!
    Queue lakersBestCenters = new Queue();
    lakersBestCenters = stackToQueue(lakersCenters);
    System.out.println("Dequeuing & Printing the queue elements that were moved from the stack 'lakersCenters': ");
    lakersBestCenters.dequeue().print();
    lakersBestCenters.dequeue().print();
    lakersBestCenters.dequeue().print();
    lakersBestCenters.dequeue().print();
    lakersBestCenters.dequeue().print();
    System.out.println();
    
    //Move strings from queue lakersForwards to stack lakersBestForwards & print; Should print in identical order!
    Stack lakersBestForwards = new Stack();
    lakersBestForwards = queueToStack(lakersForwards);
    System.out.println("Popping & Printing the stack elements that were moved from the queue 'lakersForwards': ");
    lakersBestForwards.pop().print();
    lakersBestForwards.pop().print();
    lakersBestForwards.pop().print();
    lakersBestForwards.pop().print();
    lakersBestForwards.pop().print();
    System.out.println();
    
    //Move strings from myStack to newStack2 & print; Should print in identical order!
    Stack lakersBestGuards = new Stack();
    lakersBestGuards = stackToStack(lakersGuards);
    System.out.println("Popping & Printing the stack elements that were moved from the stack 'lakersCenters': ");
    lakersBestGuards.pop().print();
    lakersBestGuards.pop().print();
    lakersBestGuards.pop().print();
    lakersBestGuards.pop().print();
    lakersBestGuards.pop().print();
    System.out.println();
  }
  
  /**
   * A method that transfers elements from a stack to a queue
   * @param stackToQueue    A stack object whose elements will be transfered into a queue object
   * @return queueFromStack    A queue object whose elements were obtained from a stack object
   */ 
  public static Queue stackToQueue(Stack stackToQueue)
  {
    Queue queueFromStack = new Queue();
    while(!stackToQueue.isEmpty())
    {
      queueFromStack.enqueue(stackToQueue.pop().getString());
    }
    return(queueFromStack);
  }
  
  /**
   * A method that transfers elements from a queue to a stack
   * @param queueToStack    A queue object whose elements will be transfered into a stack object
   * @return stackFromQueue    A stack object whose elements were obtained from a queue object
   */ 
  public static Stack queueToStack(Queue queueToStack)
  {
    Stack stackFromQueue = new Stack();
    while(!queueToStack.isEmpty())
    {
      stackFromQueue.push(queueToStack.dequeue().getString());
    }
    return(stackFromQueue);
  }
  
  /**
   * A method that transfers elements from a stack to another stack
   * @param startStack    A stack object whose elements will be transfered into a new stack object
   * @return endStack    A stack object whose elements were obtained from a stack object
   */ 
  public static Stack stackToStack(Stack oldStack)
  {
    Stack newStack = new Stack();
    while(!oldStack.isEmpty())
    {
      newStack.push(oldStack.pop().getString());
    }
    return(newStack);
  }
}

  
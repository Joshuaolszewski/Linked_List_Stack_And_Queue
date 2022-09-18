
//Joshua Olszewski 
//Linked List, Queue, Stack
public class Main
{
    /* utilizes linkNode, queue, singlelinkedlist,stack, usd to demonstrate the methods of the classes and reflect singllinkedlists
     
    Precondition: 
    Postcondition: 
                   
    return: void
    
    */
    public static void main(String[] args)
    {
        
        LinkNode obj1 = new LinkNode(new USD(1,23,"USD"));
        LinkNode obj2 = new LinkNode(new USD(5,15,"USD"));
        LinkNode obj3 = new LinkNode(new USD(29,98,"USD"));
        LinkNode obj4 = new LinkNode(new USD(18,71,"USD"));
        LinkNode obj5 = new LinkNode(new USD(10,64,"USD"));
        LinkNode obj6 = new LinkNode(new USD(22,33,"USD"));
        LinkNode obj7 = new LinkNode(new USD(15,22,"USD"));
        
        System.out.println("SINGLE LINKED LIST");
        
        SingleLinkedList list = new SingleLinkedList(); 
        System.out.println("Append");
        list.ListAppend(obj1);
        System.out.println(list.Print());
        list.ListAppend(obj2);
        System.out.println(list.Print());
        list.ListAppend(obj3);
        list.ListAppend(obj4);
        list.ListAppend(obj5);
        list.ListAppend(obj6);
        list.ListAppend(obj7);
        
        System.out.println(list.Print());
        System.out.println("List length: " + list.GetLength());
        System.out.println("");
        
        System.out.println("ListRemoveAfter obj4");
        list.ListRemoveAfter(obj4); 
        
        System.out.println(list.Print());
        System.out.println("List length: " + list.GetLength());
        System.out.println("Is 15.22 in the list?: " + list.ListSearch(new USD(15,22,"USD")));
        System.out.println("Is 10.64 in the list?: " + list.ListSearch(new USD(10,64,"USD")));
        System.out.println("List empty?: " + list.IsEmpty());
        System.out.println("");
        
        System.out.println("ListRemoveAfter obj6");
        list.ListRemoveAfter(obj6); 
        
        System.out.println(list.Print());
        System.out.println("List length: " + list.GetLength());
        System.out.println("Is 15.22 in the list?: " + list.ListSearch(new USD(15,22,"USD")));
        System.out.println("Is 10.64 in the list?: " + list.ListSearch(new USD(10,64,"USD")));
        System.out.println("List empty?: " + list.IsEmpty());
        System.out.println("");
        
        System.out.println("ListPrepend obj5");
        list.ListPrepend(obj5);
        
        System.out.println(list.Print());
        System.out.println("List length: " + list.GetLength());
        System.out.println("Is 15.22 in the list?: " + list.ListSearch(new USD(15,22,"USD")));
        System.out.println("Is 10.64 in the list?: " + list.ListSearch(new USD(10,64,"USD")));
        System.out.println("List empty?: " + list.IsEmpty());
        System.out.println("");
        
        System.out.println("ListInsertAfter obj4, obj7");
        list.ListInsertAfter(obj4, obj7);
        
        System.out.println(list.Print());
        System.out.println("List length: " + list.GetLength());
        System.out.println("Is 15.22 in the list?: " + list.ListSearch(new USD(15,22,"USD")));
        System.out.println("Is 10.64 in the list?: " + list.ListSearch(new USD(10,64,"USD")));
        System.out.println("List empty?: " + list.IsEmpty());
        System.out.println("");
        
        System.out.println("Destroying List");
        list.EmptyList();
        System.out.println("");
        
        System.out.println(list.Print());
        System.out.println("List length: " + list.GetLength());
        System.out.println("Is 15.22 in the list?: " + list.ListSearch(new USD(15,22,"USD")));
        System.out.println("Is 10.64 in the list?: " + list.ListSearch(new USD(10,64,"USD")));
        System.out.println("List empty?: " + list.IsEmpty());
        System.out.println("");
        
        
        System.out.println("STACK ABS last in first out");
        
        Stack stack = new Stack();
        System.out.println("pushing");
        stack.Push(obj1);
        System.out.println(stack.Print());
        stack.Push(obj7);
        System.out.println(stack.Print());
        stack.Push(obj3);
        System.out.println(stack.Print());
        stack.Push(obj5);
        System.out.println(stack.Print());
        stack.Push(obj4);
        System.out.println(stack.Print());
        stack.Push(obj6);
        System.out.println(stack.Print());
        stack.Push(obj2);
        
        System.out.println(stack.Print());
        System.out.println("Peek: " + stack.Peek() + " " + stack.Peek().getInfo());
        stack.Pop();
        System.out.println("");
        
        System.out.println("pop");
        System.out.println(stack.Print());
        System.out.println("Peek: " + stack.Peek() + " " + stack.Peek().getInfo());
        
        System.out.println("");
        System.out.println("Destroy"); 
        stack.EmptyStack();
        System.out.println("Size: " + stack.GetLength());
        
        System.out.println("");
        System.out.println("QUEUE ABS  first in first out");
        
        Queue queue = new Queue();
        System.out.println("Enqueue");
        queue.Enqueue(obj3);
        System.out.println(queue.Print());
        queue.Enqueue(obj4);
        System.out.println(queue.Print());
        queue.Enqueue(obj5);
        System.out.println(queue.Print());
        queue.Enqueue(obj1);
        System.out.println(queue.Print());
        queue.Enqueue(obj7);
        System.out.println(queue.Print());
        queue.Enqueue(obj2);
        System.out.println(queue.Print());
        queue.Enqueue(obj6);
        System.out.println(queue.Print());
        
        System.out.println(queue.Print());
        System.out.println("Peek: " + queue.Peek() + " " + queue.Peek().getInfo());
        queue.Dequeue();
        System.out.println("");
        
        System.out.println("Dequeue");
        System.out.println(queue.Print());
        System.out.println("Peek: " + queue.Peek() + " " + queue.Peek().getInfo());
        
        System.out.println("");
        System.out.println("Destroy"); 
        queue.EmptyQueue();
        System.out.println("Size: " + queue.GetLength());
    }
}
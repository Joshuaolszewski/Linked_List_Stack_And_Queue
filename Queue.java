
//Joshua Olszewski 
//Linked List, Queue, Stack
public class Queue extends SingleLinkedList
{
    //inherited constructor 
    public Queue()
    {
        super();
    }
    //utilizes inherited listappend method to reflect first in first out 
    public void Enqueue(LinkNode node) 
    {
        ListAppend(node);
    }
    /* removes head of list utilizing inherited method. 
     
    Precondition: list 
    Postcondition: updates pointer to new head of list  
                   
    return: USD
    PseudoCode: Dequeue 
                {
                    headdata = list->head.getdata
                    ListRemoveAfter(null)
                    return headata
                }
    */
    public USD Dequeue() 
    {
        USD headData = getHead().getData();
        ListRemoveAfter(null);
        return headData;
    }
    /* returns data at the head of list 
     
    Precondition: list 
    Postcondition: none  
                   
    return: USD
    PseudoCode: Peek
                {
                    headData = list->head.getData();
                    return headData;
                }
    */
    public USD Peek()
    {
        USD headData = getHead().getData();
        return headData;
    }
    //utilizes singlelinked list method emptylist. 
    public void EmptyQueue()
    {
        EmptyList(); 
    }
    
}
    
    
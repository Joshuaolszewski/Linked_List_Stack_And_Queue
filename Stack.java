
//Joshua Olszewski 
//Linked List, Queue, Stack
public class Stack extends SingleLinkedList
{
    //super constructor 
    public Stack()
    {
        super();
    }
    //utilizes singlelinkedlist method listPrepend to reflect last in first out 
    public void Push(LinkNode node) 
    {
        ListPrepend(node);
    }
    /* removes head of list utilizing singlelinkedlistmethod
     
    Precondition: list 
    Postcondition: updates pointer to new head of list  
                   
    return: USD
    PseudoCode: pop 
                {
                    headdata = list->head.getdata
                    ListRemoveAfter(null)
                    return headata
                }
    */
    public USD Pop() 
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
    public void EmptyStack()
    {
        EmptyList(); 
    }
    
}
    
    
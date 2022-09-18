
//Joshua Olszewski 
//Linked List, Queue, Stack
public class SingleLinkedList
{
    private int count; 
    private LinkNode head; 
    private LinkNode tail; 
    
    public SingleLinkedList(int count, LinkNode head, LinkNode tail)
    {
        this.count = count;
        this.head = head;
        this.tail = tail; 
    }
    
    public SingleLinkedList()
    {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }
    
    public int getCount()
    {
        return this.count;
    }
    
    public LinkNode getHead()
    {
        return this.head;
    }
    
    public LinkNode getTail()
    {
        return this.tail;
    }
    
    public void setCount(int count)
    {
        this.count = count;
    }
    
    public void setHead(LinkNode head)
    {
        this.head = head; 
    }
    
    public void setTail(LinkNode tail)
    {
        this.tail = tail; 
    }
    /* adds node to end of list
     
    Precondition: use on a existing list 
    Postcondition: updates pointers of head and tail if appending to empty list.
                   updates tail and last node pointer if appending to non empty list
    return: void
    PseudoCode: ListAppend(list, newNode) 
                {
                    if (list⇢head == null) 
                    { // List empty
                            list⇢head = newNode
                            list⇢tail = newNode
                    }
                    else
                    {
                        list⇢tail⇢next = newNode
                        list⇢tail = newNode
                    }
                }
    */
    public void ListAppend(LinkNode newNode) 
    {
        if(getHead() == null) 
        { 
            setHead(newNode);
            setTail(newNode);
        }
        else
        {
            getTail().setPointer(newNode);
            setTail(newNode);
        }    
    }
    /* adds node to beginning of list
     
    Precondition: existing list
    Postcondition: updates pointers of head and tail if appending to empty list.
                   updates head and pointer for new node if appending to non empty list
    return: void
    PseudoCode: ListPrepend(list, newNode) 
                {
                    if (list⇢head == null) 
                    { // list empty
                        list⇢head = newNode
                        list⇢tail = newNode
                    }
                    else 
                    {
                        newNode⇢next = list⇢head
                        list⇢head = newNode
                    }
                }
    */
    public void ListPrepend(LinkNode newNode) 
    {
        if(getHead() == null) 
        { 
            setHead(newNode);
            setTail(newNode);
        }
        else
        {
            newNode.setPointer(getHead());
            setHead(newNode);
        }    
    }
    /* adds node after declared node 
     
    Precondition: existing list and declare a specific node and new node
    Postcondition: updates pointers of head and tail if appending to empty list.
                   updates pointer for tail and previous node to new node for inserting after tail
                   updates new node pointer and previous node pointer for inserting in middle.
    return: void
    PseudoCode: ListInsertAfter(list, curNode, newNode) 
                {
                    if (list⇢head == null) 
                    { // List empty
                        list⇢head = newNode
                        list⇢tail = newNode
                    }
                    else if (curNode == list⇢tail)
                    { // Insert after tail
                        list⇢tail⇢next = newNode
                        list⇢tail = newNode
                    }
                    else 
                    {
                        newNode⇢next = curNode⇢next
                        curNode⇢next = newNode
                    }
                }
    */
    public void ListInsertAfter(LinkNode curNode, LinkNode newNode) 
    {
        if(getHead() == null) 
        {
            setHead(newNode);
            setTail(newNode); 
        }
        else if(curNode == getTail())
        {
            getTail().setPointer(newNode);
            setTail(newNode);
        }
        else
        {
            newNode.setPointer(curNode.getPointer()); 
            curNode.setPointer(newNode); 
        }
    }
    /* deletes node after declared node 
     
    Precondition: existing list and declare a specific node 
    Postcondition: deletes head node if only head node exists  
                   updates pointer for curNode to skip the next node and point to new node 
                   
    return: void
    PseudoCode: ListRemoveAfter(list, curNode) 
                {
                    // Special case, remove head
                    if (curNode is null && list⇢head is not null)
                    {
                        sucNode = list⇢head⇢next
                        list⇢head = sucNode

                        if (sucNode is null) 
                        { // Removed last item
                            list⇢tail = null
                        }
                    }
                    else if (curNode⇢next is not null)
                    {
                        sucNode = curNode⇢next⇢next
                        curNode⇢next = sucNode

                        if (sucNode is null) 
                        { // Removed tail
                            list⇢tail = curNode
                        }
                    }
                }
    */
    public void ListRemoveAfter(LinkNode curNode) 
    {
        if(curNode == null && getHead() != null) 
        {
            LinkNode sucNode = getHead().getPointer(); 
            setHead(sucNode);
            if (sucNode == null) 
            { 
                setTail(null);
            }
        }
        else if(curNode.getPointer() != null)
        {
            LinkNode sucNode = curNode.getPointer().getPointer(); 
            curNode.getPointer().setPointer(null); 
            curNode.setPointer(sucNode);
            if(sucNode == null) 
            { 
                setTail(curNode);
            }
        }
    }
    /* Searches for specific data in Node 
     
    Precondition: existing list and declare type of data to search for 
    Postcondition: none
                   
    return: USD
    PseudoCode: ListSearch(list, key) 
                {
                    curNode = list⇢head
                    while (curNode is not null)
                    {
                        if (curNode⇢data == key) 
                        {
                            return curNode
                        }
                        curNode = curNode⇢next
                    }
                    return null
                }
    */
    public USD ListSearch(USD key) 
    {
        LinkNode curNode = getHead();
        while(curNode != null) 
        {
            if(curNode.getData().isEqual(key)) 
            {
                return curNode.getData();
            }
            curNode = curNode.getPointer();
        }
        return null;
    }
    /* returns int length of linked list
     
    Precondition: list 
    Postcondition: none
                   
    return: Int
    PseudoCode: GetLength(list) 
                {
                    curNode = list⇢head
                    count = 0
                    while (curNode is not null)
                    {
                        count++
                        curNode = curNode->next
                    }
                    return count
                }
    */
    public int GetLength() 
    {
        LinkNode curNode = getHead(); 
        int count = 0; 
        while(curNode != null) 
        { 
            count++;       
            curNode = curNode.getPointer();
        }
        return count; 
    }
    /* returns boolean if list is empty
     
    Precondition: list 
    Postcondition: none
                   
    return: Boolean
    PseudoCode: IsEmpty(list) 
                {
                    if(list->head = null)
                    {
                        return true
                    }
                    else
                    {
                        return false
                    }
    */
    public boolean IsEmpty()
    {
        if(getHead() == null)
        {
            return true;        
        }
        else
        {
            return false; 
        }
    }
    /* destroys list and updates all pointers to be null
     
    Precondition: list 
    Postcondition: updates all nodes to have null pointers 
                   
    return: void
    PseudoCode: EmptyList() 
                {
                    curNode = list->head
                    while(curNode != null)
                    {
                        pastNode = curNode
                        curNode = curNode->next
                        pastNode->next = null
                    }
                    head->next = null
                    tail->next = null 
                }
    */
    public void EmptyList()
    {   
        LinkNode curNode = getHead();
        while(curNode != null) 
        {     
            LinkNode pastNode = curNode; 
            curNode = curNode.getPointer();
            pastNode.setPointer(null);          
        }
        setHead(null);
        setTail(null);
    }
    /* returns string of all nodes data
     
    Precondition: list 
    Postcondition: none
                   
    return: String
    PseudoCode: Print() 
                {
                    curNode = list->head
                    string = ""
                    while( curNode != null)
                    {
                        string += curNode->data->getstring
                        curNode = curNode->next
                    }
                    return string 
                }
    */
    public String Print() 
    {
        LinkNode curNode = getHead(); 
        String toString = "";
        while(curNode != null) 
        { 
            toString += curNode.getData().getInfo()+"\n";     
            curNode = curNode.getPointer();
        } 
        return toString; 
    }
}

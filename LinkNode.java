
//Joshua Olszewski 
//Linked List, Queue, Stack
public class LinkNode
{
    private USD data; 
    private LinkNode pointer; 
    
    public LinkNode(USD data, LinkNode pointer)
    {
        this.data = data;
        this.pointer = pointer; 
    }
    
    public LinkNode(USD data)
    {
        this.data = data;
        this.pointer = null; 
    }
    
    public USD getData()
    {
        return this.data; 
    }
    
    public LinkNode getPointer()
    {
        return this.pointer; 
    }
    
    public void setData(USD data)
    {
        this.data = data;
    }
    
    public void setPointer(LinkNode pointer)
    {
        this.pointer = pointer; 
    }
}

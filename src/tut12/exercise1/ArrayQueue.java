
package tut12.exercise1;
public class ArrayQueue
{
    private GVertex[] items;
    private static final int maxSize=10000;
    private int front;
    private int rear;

    public ArrayQueue()
    {
        items=new GVertex[maxSize];
        front=0;
        rear=0;
    }

    public boolean isEmpty()
    {
        return rear == front;
    }

    public boolean isFull()
    {
        return (rear+1)%maxSize == front;
    }
    

    public void enqueue(GVertex newItem)
    {
        if (!isFull())
        {
            items[rear]=newItem;
            rear=(rear+1) % maxSize;
        }
    }

    public GVertex dequeue()
    {
        if (!isEmpty())
        {
            int pos=front;
            front=(front+1) % maxSize;
            return items[pos];
        }
        else
            return null;
    }
    
    public GVertex peek()
    {
        if (!isEmpty())
            return items[front];
        else
            return null;
    }
}
public class L_34_StackIntro1 
{
    protected int[] data;       //if we want to inherit these variables in inherited class 
    protected int tos;

    public L_34_StackIntro1()         //constructor used for initialising the values
    {
        data = new int[5];      //default size , if user didnt enter the value of the stack
        tos = -1;
    }

    public L_34_StackIntro1(int cap)      //If user enters the size of the stack
    {
        data = new int[cap];
        tos = -1;
    }

    public void push(int item) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Stack is full");
        }
        tos++;
        data[tos] = item;
    }

    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is empty");
        }
        int temp = data[tos];           //storing the top most value
        data[tos]= 0;                   //replacing the top most value by 0 , there is no need to write this as it will get overwritten
        tos--;                          //deceasing the value of tos
        return temp;                    
    }

    public int peek() throws Exception
    {
        int temp = data[tos];
        return temp;
    }

    public int size()
    {
        return tos+1;                   //As size will be tos + 1
    }

    public boolean isEmpty()
    {
        return size() == 0;             //If size = 0 then return true
    }

    public boolean isFull()
    {
        return size() == data.length;
    }

    public void display()
    {
        for(int i = tos ; i>=0 ; i--)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

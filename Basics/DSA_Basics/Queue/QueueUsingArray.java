package DSA_Basics.Queue;

public class QueueUsingArray {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public QueueUsingArray(){
        this(DEFAULT_SIZE);
    }

    public QueueUsingArray(int size) {
        this.data = new int[size];
    }

    public boolean insert(int value){
        if(isFull()){
            System.out.println("Queue is Full!!");
            return false;
        }
        data[end++] = value;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            throw new Exception("Queue is Empty");
        }
        int removedItem = data[0];
        for(int i = 0 ; i < end -1; i++){
            data[i] = data[i+1];
        }
        end--;
        return removedItem;
    }

    public int front() throws Exception{
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display(){
        for(int i = 0 ; i < end; i++){
            System.out.print(data[i] + " <-");
        }
        System.out.println("End");
    }

    public boolean isFull(){
        return end == data.length ;
    }
    public boolean isEmpty(){
        return end == 0;
    }
}
public class CircularArrayQueue implements Queue {

    private String[] Queue;
    private int head;
    private int tail;
    private int size;
    private int MaxSize;

    public CircularArrayQueue(){
        this.Queue = new String[5];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
        this.MaxSize = 5;
    }


    public CircularArrayQueue(int capacity) {
        this.Queue = new String[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
        this.MaxSize = capacity;
    }

    @Override
    public int size(){
        return this.size;
    }

    @Override
    public boolean isEmpty(){
        if(this.size == 0)
            return true;
        return false;
    }

    @Override
    public boolean isFull(){
        if(this.size == this.MaxSize)
            return true;
        return false;
    }

    @Override
    public boolean enqueue(String obj) {
        if(this.MaxSize == this.size)
            return false;
        if(this.tail == this.MaxSize){
            this.tail = 0;
            this.Queue[this.tail] = obj;
            size+=1;
            this.tail+=1;
            return true;
        }
        this.Queue[this.tail] = obj;
        this.tail+=1;
        size+=1;
        return true;
    }

    @Override
    public String dequeue(){
        if(this.size == 0)
            return null;
        if(this.head == MaxSize){
            this.head = 0;
            this.size-=1;
            return this.Queue[this.MaxSize - 1];
        }
        this.size-=1;
        this.head +=1;
        return this.Queue[this.head-1];
    }

    @Override
    public void printAllElements(){

        for(int i = this.head; i < this.tail; i++){
            System.out.printf("%s\n", this.Queue[i]);
        }
    }

}

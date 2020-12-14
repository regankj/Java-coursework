public class Buffer {
    public static final int BUFFER_SIZE = 10;

    private int data[];
    private int head;
    private int count;

    public Buffer(){
        data = new int[BUFFER_SIZE];
        head = 0;
        count = 0;
    }

    public synchronized boolean isEmpty()
    {
        return (count == 0);
    }

    public synchronized boolean isFull()
    {
        return (count == BUFFER_SIZE);
    }

    public synchronized int get(){
        if (isEmpty()) {
            throw new RuntimeException("Buffer Underflow!");
        }
        else {
            int res = data[head];
            head = (head + 1) % BUFFER_SIZE;
            count--;
            return res;
        }
    }

    public synchronized void put(int value){
        if (isFull()){
            throw new RuntimeException("Buffer overflow!");
        }
        else {
            int tail = (head + count) % BUFFER_SIZE;
            data[tail] = value;
            count++;
        }
    }
}

class MyCircularQueue {
    int[] queue;
    int size,rear,front;
    public MyCircularQueue(int k) {
        this.queue=new int[k];
        this.size=k;
        this.front=0;
        this.rear=-1;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        rear=(rear+1)%size;
        queue[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
            return false;
        if(front == rear){
            rear=-1;
            front=0;
        }
        else{
            front=(front+1)%size;
        }
        return true;
        
    }
    
    public int Front() {
        return isEmpty() ? -1 : queue[front];
        // if(isEmpty())
        //     return -1;
        // return queue[front];
        
    }
    
    public int Rear() {
        return isEmpty() ? -1 : queue[rear];
        
    }
    
    public boolean isEmpty() {
        return rear==-1;
    }
    
    public boolean isFull() {
        return !isEmpty() && (rear+1)%size == front;
        // if(isEmpty())
        //     return false;
        // if((rear+1)%size==front)
        //     return true;
        // else
        //     return false;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
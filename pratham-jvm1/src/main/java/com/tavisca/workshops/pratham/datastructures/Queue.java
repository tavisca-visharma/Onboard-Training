package com.tavisca.workshops.pratham.datastructures;

public class Queue<T> {
    static final public int defaultCapacity = 8;
    private int capacity;
    private Object[] queue;
    private int front = -1;
    private int rear = -1;

//    private List<int> queue;

    Queue(){
        this.capacity = 8;              //Default Capacity
        this.queue = new Object[this.capacity];
//        queue = new ArrayList<Integer>();
    }

    Queue(int capacity){
        this.capacity = capacity;              //Supplied Capacity
        this.queue = new Object[this.capacity];
//        queue = new ArrayList<Integer>();
    }

    public int capacity(){
        return this.capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void add(T x)  {
//        queue.add(x);
        if(!isQueueOverFlowed()){
            addItemToQueue(x);
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }




    public T remove()  {
//        int valueAtFront = queue.get(0);
//        queue.remove(0);

        T valueAtFront = null;
        if(!isQueueUnderFlowed()){
            valueAtFront = removeItemFromQueue();
        }else {
//            throw new Exception("UnderFlow");
        }
        return valueAtFront;
    }


    private boolean isQueueOverFlowed() {
        return ((rear+1)%this.capacity == front);
    }

    private void addItemToQueue(T item) {
        if(front == rear && front == -1) {
            front++;
        }
        rear = (rear+1)% this.capacity;
        queue[rear] = item;

    }

    private boolean isQueueUnderFlowed() {
        return (front == rear && rear == -1);
    }

    private T removeItemFromQueue() {
        T valueToBeRemoved = (T) queue[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        front = (front+1) % this.capacity;
        return  valueToBeRemoved;
    }
    public  void display() {
        System.out.print("[");
        for (int i = front; i < queue.length; i++) {
//            i = i%this.capacity;
            System.out.print(queue[i]);
            if (i != rear) {
                System.out.print(",");
            }
        }
        if (rear < front) {
            for (int i = 0; i <= rear; i++) {
                //            i = i%this.capacity;
                System.out.print(queue[i]);
                //            if(i!=rear){
                System.out.print(",");
                //            }
            }
        }
        System.out.println("]");
    }

}

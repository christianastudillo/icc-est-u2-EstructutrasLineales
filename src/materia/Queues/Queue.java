package materia.Queues;

import java.util.NoSuchElementException;

import materia.models.Node;

public class Queue {
    
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            rear.setNext(newNode);
            rear = newNode;
        }
    }
    public Node dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        Node node = front;
        front =front.getNext();
        if(front == null){
            rear = null;
        }
        return node;
    }
    public Node peek(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        return front;

    }
    public int size() {
        int size = 0;
        Node current = front;
        while(current!=null){
            size++;
            current = current.getNext();
        }
        return size;
    }
    public void printQueue() {
        Node current = front;
        while(current!=null){
            System.out.print(current.getValue());
            current = current.getNext();
        }
    }
    public boolean isEmpty() {
        return front == null;
    }
}

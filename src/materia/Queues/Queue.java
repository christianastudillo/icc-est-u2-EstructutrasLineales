package materia.Queues;

import java.util.NoSuchElementException;

import materia.models.Node;

public class Queue {
    
    private Node front;
    private Node rear;

    //creamos una cola con nodos vacios 
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
    //metodo para desencolar nodos 
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
    //devuelve
    public Node peek(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        return front;

    }
    //1 en la clase queue obtener el tamano de la cola
    public int size() {
        int size = 0;
        Node current = front;
        while(current!=null){
            size++;
            current = current.getNext();
        }
        return size;
    }
    //2 en la clase queue crear y usar un metodo para imprimir la cola 
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

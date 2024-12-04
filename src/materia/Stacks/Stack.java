package materia.Stacks;

import java.util.EmptyStackException;

import materia.models.Node;

public class Stack {
    
    private Node top;//nodo en la cima de nustra pila

    //creamos la pila con la cima nulla o vacia 
    public Stack(){
        this.top = null;
    }
    public void push (int value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }


    public void printStack(){
        Node current = top;
        while(current!=null){
            System.out.print(current.getValue());
            current = current.getNext();
        }
    }

    public int getSize(){
        int size = 0;
        Node current = top;
        while(current!=null){
            size++;
            current = current.getNext();
        }
        return size;
    }
}

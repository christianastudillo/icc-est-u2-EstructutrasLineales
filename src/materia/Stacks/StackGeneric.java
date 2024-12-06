package materia.Stacks;

import materia.models.NodeGeneric;
import java.util.EmptyStackException; 

public class StackGeneric<T> {
    private NodeGeneric<T> top;
    private int size;

    public StackGeneric () {
        this.top = null;
        this.size = 0;
    }

    // Método para agregar um elemento à pilha
    public void push(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    // Método para retirar um elemento da pilha
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }

    public void printStack() {
        NodeGeneric<T> current = top;
        System.out.println("Contenido de la pila:");
        while (current != null) {
            System.out.println("-> " + current.getValue()); 
            current = current.getNext(); 
        }
        System.out.println("null"); 
    }
    
    public NodeGeneric<T> popNode() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        NodeGeneric<T> currentTop = top; 
        top = top.getNext();            
        size--;                          
        return currentTop;              
    }
    


}

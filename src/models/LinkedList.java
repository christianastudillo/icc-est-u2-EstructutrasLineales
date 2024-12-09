package models;

//import materia.models.Node;
import materia.models.NodeGeneric;

public class LinkedList<T> {
    private NodeGeneric<T> head;
    private int size=0;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void appendToTail(T value) {
            head = new NodeGeneric<>(value);
            if (head == null) {
        } else {
            NodeGeneric<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new NodeGeneric<>(value));
        }
        size++;
    }

    public T findByValue(T value) {
        NodeGeneric<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;  
    }

    public void deleteByValue(T value) {
        // if (head == null) return;

        // if (head.getValue().equals(value)) {
        //     head = head.getNext();
        //     size--;
        //     return;
        // }

        // NodeGeneric<T> current = head;
        // while (current.getNext() != null) {
        //     if (current.getNext().getValue().equals(value)) {
        //         current.setNext(current.getNext().getNext());
        //         size--;
        //         return;
        //     }
        //     current = current.getNext();
        // }
    }

    public void print() {
        if(head == null){
            System.out.println("END");
            return;
        }
        NodeGeneric<T> current = head;
        while (current != null) {
            System.out.println(current.getValue()+"-->");
            current = current.getNext();
        }
    }

    public NodeGeneric<T> getHead() {
        return head;
    }

    public void setHead(NodeGeneric<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}


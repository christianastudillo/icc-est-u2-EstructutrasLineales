package materia.models;

public class NodeGeneric<T> { // Corrigido: Adicionado <T> na definição da classe
    private T value;
    private NodeGeneric<T> next;

    public NodeGeneric(T value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "NodeGeneric [value=" + value + "]";
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeGeneric<T> getNext() {
        return next;
    }

    public void setNext(NodeGeneric<T> next) {
        this.next = next;
    }
}

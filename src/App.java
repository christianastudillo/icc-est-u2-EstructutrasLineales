import controller.MenuController;
import materia.Queues.Queue;
import materia.Queues.QueueGeneric;
import materia.Stacks.Stack;
import materia.Stacks.StackGeneric;
import models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //runStack();  
        //runStackGeneric(); 
        //runQueue(); 
        //runQueueGeneric(); 
        runContactManager();       
    }
    public static void runStack() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        System.out.print("Contenido de la pila: ");
        stack.printStack();  
        
        System.out.println("Cima --> " + stack.peek());
        System.out.println("Retirar --> " + stack.pop());
        System.out.println("Cima --> " + stack.peek());
        System.out.println("Retirar --> " + stack.pop());
        System.out.println("Cima --> " + stack.peek());
    }
    public static void runStackGeneric() {
        StackGeneric<Pantalla> router = new StackGeneric<>();
    
        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "Users Page", "/home/menu/users"));
    
        System.out.println("Estoy en "+ router.peek().getRuta());
        System.out.println("Regreso a " + ((router.popNode().getNext().getValue())).getRuta());
        System.out.println("Estoy en "+ router.peek().getRuta());

        router.push(new Pantalla(1, "Settings Page", "/home/menu/settings"));

        System.out.println("Pantallas = "+ router.getSize());
        System.out.println("Estoy en "+ router.peek().getRuta());
        router.printStack();        
    }
    public static void runQueue(){
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());
    }
    public static void runQueueGeneric() {
        QueueGeneric<Integer> queue = new QueueGeneric<>();
    
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
    
        System.out.println(queue.peek()); 
        System.out.println(queue.dequeue()); 
        System.out.println(queue.size());
    }
    
    
    private static void runContactManager() {   
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }

}

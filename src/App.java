import materia.Stacks.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        runStack();
                 

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
   



  

}

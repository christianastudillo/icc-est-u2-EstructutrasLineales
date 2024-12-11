package Ejercicio_02_sorting;
import materia.Stacks.StackGeneric;
public class StackSorter {
    public static void ordenar(StackGeneric<Integer> stack) {
        StackGeneric<Integer> stackAux = new StackGeneric<>();
        
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!stackAux.isEmpty() && stackAux.peek() > temp) {
                stack.push(stackAux.pop());
            }
            stackAux.push(temp);
        }
        
        while (!stackAux.isEmpty()) {
            stack.push(stackAux.pop());
        }
    }
}
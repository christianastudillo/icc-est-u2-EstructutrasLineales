package Ejercicio_01_sign;

import materia.Stacks.StackGeneric;

public class SingValidator {
    public static boolean esValido(String s) {
        StackGeneric<Character> stack = new StackGeneric<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }   
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
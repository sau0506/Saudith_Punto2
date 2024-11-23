import java. util.Scanner;
import java. util.Stack;

public class metodos {
    Scanner sc= new Scanner(System.in);

    public Stack<Character> AlmacenarCadena(String cadena){
        Stack<Character> Pila = new Stack<>();
        for (char c : cadena.toCharArray()) {
            Pila.push(c);
        }
        return Pila;
  }
    public Stack<Character> InvertirCadena( Stack<Character> Pila){
        Stack<Character> pilaI = new Stack<>();
        while (!Pila.isEmpty()) {
            pilaI.push(Pila.pop());
        }
        return pilaI;
}
}
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m= new metodos();
        Stack<Character> pila = new Stack<>();
        Stack<Character> pilaInvertida = new Stack<>(); 
        String cadenaInvertida = "";
         System.out.println("Ingrese una cadena de texto:");
        String cadena = sc.nextLine();
        System.out.println("Cadena original: " + cadena);

        pila = m.AlmacenarCadena(cadena);
        pilaInvertida = m.InvertirCadena(pila);
       
    

        System.out.println("Cadena invertida: " + pilaInvertida);
    }

   

   
}




package cowsay;

import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Cowsay {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la frase:");
        String x = sc.nextLine(); 
        
        String linea = "-".repeat(x.length() + 2);
        String lineaSuperior = "_".repeat(x.length() + 2);
        
        // Mostrar ASCII
        System.out.println(" " + lineaSuperior);
        System.out.println("< " + x + " >");
        System.out.println(" " + linea);
        System.out.println("        \\   ^__^");
        System.out.println("         \\  (oo)\\_______");
        System.out.println("            (__)\\       )\\/\\");
        System.out.println("                ||----w |");
        System.out.println("                ||     ||");
    }
}

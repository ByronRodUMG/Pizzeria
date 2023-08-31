import Class.Parent.Pizza;
import Class.Child.PizzaItaliana;
import Class.Parent.Topping;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cantidadToppings = 0;
        String[] toppings;
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;

        System.out.println("### Bienvenido a la pizzería! ###");
        do {
            try {
                System.out.println("Cuántos toppings desea agregar a su pizza?");
                System.out.println("Se acepta un máximo de dos:");
                cantidadToppings = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine(); // Limpia el buffer del scanner
            }
        } while (!valido || cantidadToppings > 2);

        toppings = new String[cantidadToppings];
        scanner.nextLine(); // Limpia el buffer del scanner

        for (int i = 0; i < cantidadToppings; i++) {
            System.out.print("Ingrese el topping " + (i + 1) + ": ");
            toppings[i] = scanner.nextLine();
        }

        List<String> ingredientesPizzaItaliana = List.of("queso", "tomate", "pepperoni");
        PizzaItaliana pizzaItaliana = new PizzaItaliana("Pizza Italiana", 89.99,
                ingredientesPizzaItaliana, "tomate", 15);

        System.out.println(pizzaItaliana);  // Imprimir usando el método toString
        pizzaItaliana.mostrarDetalles();
        pizzaItaliana.preparar();

        if (toppings.length >= 1) {
            Topping primerTopping = new Topping(toppings[0]);
            primerTopping.agregar(pizzaItaliana);

            if (toppings.length == 2) {
                Topping segundoTopping = new Topping(toppings[1]);
                segundoTopping.agregar(pizzaItaliana);
            }

            System.out.println("\nDespués de agregar los toppings seleccionados:");
            pizzaItaliana.mostrarDetalles(); // Mostrar ingredientes después de agregar los toppings
        }
    }
}
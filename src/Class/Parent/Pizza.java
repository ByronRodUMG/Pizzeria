package Class.Parent;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    // Variables
    private String nombre;
    private double precio;
    private List<String> ingredientes;

    // Constructor
    public Pizza (String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = new ArrayList<>(ingredientes); // Se crea una copia de la lista de ingredientes para
                                                           // evitar que se modifique la lista original
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public List<String> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    // Método para simular la preparación de la pizza
    public void preparar() {
        System.out.println("La pizza " + nombre + " está lista para ser servida.");
    }

    // Método para imprimir los detalles de la pizza
    public void mostrarDetalles() {
        System.out.println("Pizza: " + nombre + "\nPrecio: $" + precio);
        System.out.println("Ingredientes:");
        for (String ingrediente : ingredientes) {
            System.out.println("-> " + ingrediente);
        }
    }

    // Método toString para representar la pizza como una cadena
    @Override
    public String toString() {
        return "Nombre de la pizza: " + nombre + ", Precio: Q" + precio;
    }
}

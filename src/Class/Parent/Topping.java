package Class.Parent;

public class Topping {
    // Variables
    private String nombre;

    // Constructor
    public Topping(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar el topping a una pizza
    public void agregar(Pizza pizza) {
        pizza.getIngredientes().add(nombre);
    }
}

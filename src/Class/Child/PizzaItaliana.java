package Class.Child;

import Class.Parent.Pizza;

import java.util.List;

public class PizzaItaliana extends Pizza {
    // Variables
    private String salsa;
    private int tiempoHorno;

    // Constructor
    public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa, int tiempoHorno) {
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.tiempoHorno = tiempoHorno;
    }

    // Getters y Setters
    public String getSalsa() {
        return salsa;
    }
    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
    public int getTiempoHorno() {
        return tiempoHorno;
    }
    public void setTiempoHorno(int tiempoHorno) {
        this.tiempoHorno = tiempoHorno;
    }

    // Método para sobreescribir la preparación de la pizza italiana
    @Override
    public void preparar() {
        System.out.println("Añadiendo la salsa " + salsa + " a la pizza italiana.");
        System.out.println("Colocando la pizza en el horno durante " + tiempoHorno + " minutos.");
        super.preparar();
    }

    // Método para sobreescribir el método toString incluyendo la salsa y el tiempo en el horno
    @Override
    public String toString() {
        return super.toString() + ", Salsa: " + salsa + ", Tiempo en el horno: " + tiempoHorno + " minutos";
    }
}

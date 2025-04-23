package model;

public class Pizza {
    private final String nombre;
    private final String tamano;
    private final double precio;

    public Pizza(String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public double getPrecio() {
        return precio;
    }
}

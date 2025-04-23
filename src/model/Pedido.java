package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<Pizza> pizzas;

    public Pedido() {
        this.pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }
}

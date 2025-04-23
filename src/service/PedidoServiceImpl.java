package service;

import model.Pizza;
import model.Pedido;

public class PedidoServiceImpl implements PedidoService {

    @Override
    public void imprimirDetalle(Pedido pedido) {
        System.out.println("----- Detalle del Pedido -----");
        for (Pizza pizza : pedido.getPizzas()) {
            System.out.println(pizza.getNombre() + " (" + pizza.getTamano() + ") - " + pizza.getPrecio() + "€");
        }
        System.out.println("Total: " + calcularTotal(pedido) + "€");
    }

    @Override
    public double calcularTotal(Pedido pedido) {
        double total = 0;
        for (Pizza pizza : pedido.getPizzas()) {
            total += pizza.getPrecio();
        }
        return total;
    }
}

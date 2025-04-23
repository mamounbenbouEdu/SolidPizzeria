import model.Pizza;
import model.Pedido;
import service.PedidoService;
import service.PedidoServiceImpl;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Margarita", "Mediana", 7.50);
        Pizza pizza2 = new Pizza("Cuatro Quesos", "Grande", 9.80);
        Pizza pizza3 = new Pizza("Barbacoa", "Pequeña", 6.20);

        Pedido pedido = new Pedido();
        pedido.agregarPizza(pizza1);
        pedido.agregarPizza(pizza2);
        pedido.agregarPizza(pizza3);

        PedidoService servicio = new PedidoServiceImpl();
        servicio.imprimirDetalle(pedido);
    }
}

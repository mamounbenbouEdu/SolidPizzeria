package service;

import model.Pedido;

public interface PedidoService {
    void imprimirDetalle(Pedido pedido);
    double calcularTotal(Pedido pedido);
}

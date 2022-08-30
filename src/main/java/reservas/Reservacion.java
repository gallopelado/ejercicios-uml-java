package reservas;

import java.util.List;

public class Reservacion {

    private Agencia agencia;
    private Cliente cliente;
    private Double precio_total;
    private List<ReservacionDetalle> lista_detalle_coches_reservados;

    public Reservacion(Agencia agencia, Cliente cliente, Double precio_total, List<ReservacionDetalle> lista_detalle_coches_reservados) {
        this.agencia = agencia;
        this.cliente = cliente;
        this.precio_total = precio_total;
        this.lista_detalle_coches_reservados = lista_detalle_coches_reservados;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(Double precio_total) {
        this.precio_total = precio_total;
    }

    public List<ReservacionDetalle> getLista_detalle_coches_reservados() {
        return lista_detalle_coches_reservados;
    }

    public void setLista_detalle_coches_reservados(List<ReservacionDetalle> lista_detalle_coches_reservados) {
        this.lista_detalle_coches_reservados = lista_detalle_coches_reservados;
    }

    @Override
    public String toString() {
        return "Reservacion{" +
                "agencia=" + agencia +
                ", cliente=" + cliente +
                ", precio_total=" + precio_total +
                ", lista_detalle_coches_reservados=" + lista_detalle_coches_reservados +
                '}';
    }
}

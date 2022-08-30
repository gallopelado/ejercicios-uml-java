package reservas;

public class Garage {
    private String codigo;
    private Integer cantidad_max_coches;

    public Garage() {
    }

    public Garage(String codigo, Integer cantidad_max_coches) {
        this.codigo = codigo;
        this.cantidad_max_coches = cantidad_max_coches;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getCantidad_max_coches() {
        return cantidad_max_coches;
    }

    public void setCantidad_max_coches(Integer cantidad_max_coches) {
        this.cantidad_max_coches = cantidad_max_coches;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "codigo='" + codigo + '\'' +
                ", cantidad_max_coches=" + cantidad_max_coches +
                '}';
    }
}

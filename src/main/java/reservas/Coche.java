package reservas;

public class Coche {
    private Double precio;
    private Boolean coche_disponible;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getCoche_disponible() {
        return coche_disponible;
    }

    public void setCoche_disponible(Boolean coche_disponible) {
        this.coche_disponible = coche_disponible;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Coche(Double precio, Boolean coche_disponible, String matricula, String marca, String modelo, String color) {
        this.precio = precio;
        this.coche_disponible = coche_disponible;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Coche() {
    }

    @Override
    public String toString() {
        return "Coche{" +
                "precio=" + precio +
                ", coche_disponible=" + coche_disponible +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

package reservas;

import java.time.LocalDate;

public class ReservacionDetalle {
    private LocalDate fecha_inicio;
    private LocalDate fecha_final;
    private Integer gasolina;
    private Coche coche;

    public ReservacionDetalle(LocalDate fecha_inicio, LocalDate fecha_final, Integer gasolina, Coche coche) {
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.gasolina = gasolina;
        this.coche = coche;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(LocalDate fecha_final) {
        this.fecha_final = fecha_final;
    }

    public Integer getGasolina() {
        return gasolina;
    }

    public void setGasolina(Integer gasolina) {
        this.gasolina = gasolina;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "ReservacionDetalle{" +
                "fecha_inicio=" + fecha_inicio +
                ", fecha_final=" + fecha_final +
                ", gasolina=" + gasolina +
                ", coche=" + coche +
                '}';
    }
}

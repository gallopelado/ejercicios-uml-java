package reservas;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear el cliente o obtener
        // String codigo, String nombre, String dni, String direccion, String telefono, Cliente avalador
        Cliente cliente_avalador = new Cliente("001", "Juan Jose", "4868348", "La calle", "9992", null);
        Cliente cliente = new Cliente("002", "Celina", "426218", "Jose Perez", "11111", cliente_avalador);

        // Crear el coche o obtener
        // Currency precio, Boolean coche_disponible, String matricula, String marca, String modelo, String color
        Coche toyota_au = new Coche(1000.0, true, "AES116", "TOYOTA", "AURIS", "negro");
        Coche toyota_ru = new Coche(6000.0, true, "POI116", "TOYOTA", "RUSH", "rojo");

        // Crear el reservacion detalle o obtener
        // LocalDate fecha_inicio, LocalDate fecha_final, Integer gasolina, Coche coche
        var fecha_inicio = LocalDate.parse("2022-08-30");
        var fecha_final = LocalDate.parse("2022-09-01");
        var rd1 = new ReservacionDetalle(fecha_inicio, fecha_final, 25, toyota_au);
        var rd2 = new ReservacionDetalle(fecha_inicio, fecha_final, 50, toyota_ru);

        // Crear la agencia
        // String nombre, String direccion
        var agencia_asuncion = new Agencia("ASUNCION", "Fulgencio R. Moreno");

        // Crear la reservacion o cabecera
        // Cliente cliente, Double precio_total, List<ReservacionDetalle> lista_detalle_coches_reservados
        var reservacion1 = new Reservacion(agencia_asuncion, cliente, toyota_au.getPrecio()+toyota_ru.getPrecio(), List.of(rd1, rd2));
        System.out.println(reservacion1.toString());
    }
}

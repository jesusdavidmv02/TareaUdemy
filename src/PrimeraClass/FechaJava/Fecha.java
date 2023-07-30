/*Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
convertirla a una fecha del tipo java.util.Datey calcular la edad de la persona de acuerdo a la fecha actual.
Intentar usar solo lo visto hasta el momento,no el api de java 8 que lo veremos mas adelante, también se pueden
apoyar de google que hay varios ejemplos.
Preguntas de esta tarea
Cuál es el código de tu solución, publicala acá mismo*/


package ClaseBasicas.FechaJava;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Fecha {

    public static void main(String[] args) {
        // 01/01/2000
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse("20/01/2000", fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}

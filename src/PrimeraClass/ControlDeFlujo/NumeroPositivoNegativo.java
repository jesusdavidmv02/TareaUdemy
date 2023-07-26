/*Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos,
pero sin usar el símbolo de multiplicación (*).Puede utilizar una sentencia for para realizar la multiplicación y
tener en cuenta los unarios, donde menos por menos es positivo.
Preguntas de esta tarea
Publica acá tu código fuente con la clase Main completa.*/

package ControlDeFlujo;
import java.util.Scanner;

public class NumeroPositivoNegativo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero a: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el numero numero2: ");
        int numero2 = scanner.nextInt();

        int resultado = 0;

        boolean numeroPositivo1 = numero2 > -1;
        boolean numeroPositivo2 = numero1 > -1;

        int absoluto1 = numeroPositivo1 ? numero1: -numero1;

        for(int i = 0; i < absoluto1; i++){
            resultado = resultado + numero2;
        }

        if((!numeroPositivo1 && !numeroPositivo2) || !numeroPositivo1){
            resultado = -resultado;
        }

        System.out.println("el resultado es " + resultado);

    }
}

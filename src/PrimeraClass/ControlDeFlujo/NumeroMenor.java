/*Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el
numero de veces (ingresado) para pedir el numero entero, entonces se requiere:
Calcular el menor número e imprimir el valor.
Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir
" el numero menor es igual o mayor que 10!".
Preguntas de esta tarea
Pega acá tu código de la clase main, no sin antes de haberlo ejecutado en tu IDE.*/


package PrimeraClass.ControlDeFlujo;

import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero [] =  new int[10];

        for (int i = 0; i < numero.length ; i++) {
            System.out.println("digite numero");
            numero[i] = sc.nextInt();
        }
        int aux  = Integer.MAX_VALUE;;
        for (int i = 0; i < numero.length ; i++) {
            aux = (numero[i] < aux) ? numero[i] : aux;
        }
        System.out.println(" El numero menor es : " + aux);
    }
}

package PrimeraClass.CondicionalesClass;
/*
Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual
en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión,
pero tambien puede ser del tipo int.

-Si la capacidad actual es 70 litros: imprimir Estanque lleno
-Si está entre 60 y menor a 70: imprimir Estanque casi lleno
-Si está entre 40 y menor a 60: imprimir Estanque  3/4
-Si está entre 35 y menor a 40: imprimir Medio Estanque
-Si está entre 20 y menor a 35: imprimir Suficiente
-Si está entre 1 y menor a 20: imprimir Insuficiente
-Preguntas de esta tarea
-Cuál es le código de la tarea, publica la clase main
*/

import java.util.Scanner;

public class SistemaTanqueGasolina {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double medidaMaxima = 70;
        System.out.println( "el taque tiene una capacida de 70 litrios ");

        System.out.println("digite la medida actual de el taque");
        double medidaActual = sc.nextDouble();

        if (medidaActual == medidaMaxima) {
            System.out.println("El  Taque esta lleno ");
        } else if (medidaActual > 60 && medidaActual < 70 ) {
            System.out.println( "el taque esta casi lleno ");
        } else if (medidaActual > 40 && medidaActual < 60 ) {
            System.out.println( " El tanque  3/4 ");
        } else if (medidaActual > 35 && medidaActual < 40 ) {
            System.out.println("el taque esta en medio lleno");
        } else if (medidaActual > 20 && medidaActual < 35) {
            System.out.printf("El taque esta suficiente ");
        } else if (medidaActual > 1 && medidaActual < 20) {
            System.out.printf("el taque esta insuficiente");
        }else {
            System.out.println("el numero digitado sobrepasa el limite del taque " + medidaActual);
        }
    }
}

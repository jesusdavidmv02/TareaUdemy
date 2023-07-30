/*Pedir el radio de un círculo y calcular su área. utilizar la formula:
area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
Recomiendo primero implementar la tarea en el IDE para probarla y revisarla bien,
luego publica tu código de la clase main por esta vía.
Preguntas de esta tarea
Cuál es el código de tu clase main con la solución de la tarea*/


package ClaseBasicas.MathClass;

import java.util.Scanner;

public class RadioCirculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radio ;

        System.out.println("digite el Radio ");
        radio = sc.nextDouble();

        double resultado  = (Math.PI * Math.pow(radio,2));

        System.out.println("Area de un Circulo es :  " + resultado );


    }
}

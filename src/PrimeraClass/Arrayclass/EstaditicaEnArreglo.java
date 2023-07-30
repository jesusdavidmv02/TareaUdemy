/**
 * Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los
 * números positivos, el promedio de los negativos y contar el número de ceros.
 * Preguntas de esta tarea
 * Cuál es tu código fuente de la tarea
 */

package ClaseBasicas.Arrayclass;

import java.util.Scanner;

public class EstaditicaEnArreglo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] array = new int [7];

        for (int i = 0; i < array.length; i++) {
            System.out.println("digite el Numero ");
            array[i] = sc.nextInt();
        }

        int NumPositivos = 0;
        int NumerosNegativos = 0;
        int c = 0 , cpositivo = 0 , cNegativo = 0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] > 0){
                NumPositivos += array[i];
                cpositivo++;
            } else if (array[i]==0) {
                c++;
            } else{
                NumerosNegativos += array[i];
                cNegativo++;
            }
        }

        System.out.println("suma de los Numero Positivo :  " + (NumPositivos/cpositivo)) ;
        System.out.println("suma de los Numero Negativos :  " + (NumerosNegativos/cNegativo)) ;
        System.out.println("conteo de 0 :  " + c) ;

    }
}

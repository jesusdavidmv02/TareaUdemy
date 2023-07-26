/*
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
ademas mostrar el promedio total.
Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos
(contadores, sumas).
Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
Preguntas de esta tarea
Cuál es el código de la clase main de la tarea
*/

package ControlDeFlujo;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        double notas [] = new double[20];
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int x = 0;
        int notaIsUno = 0;
        double promedoMayor = 0, promedioInferior = 0;
        boolean teminoCiclo = false;
        double sumaTotal = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.println("Digite  las notas");
            notas[i] = sc.nextDouble();

            if (notas[i]>=1 && notas[i]<=7){
                sumaTotal += notas[i];

                if(notas[i] == 1){
                    notaIsUno++;
                }

                if (notas[i]>=5){
                    promedoMayor += notas[i];
                    c++;
                }
                else{
                    promedioInferior += notas[i];
                    x++;
                }
            }
            else{
                System.out.println("numero no correspondiente");
                teminoCiclo = true;
                break;
            }

            if (notas[i]==0) {
                System.out.println("Error nota mal digitada o dijito un 0");
                teminoCiclo = true;
                break;
            }
        }
        if (!teminoCiclo){
            System.out.println("#################################");
            System.out.println("promedio mayores a 5 : " +  (promedoMayor/c));
            System.out.println("promedio  inferiores  a 4: " +  (promedioInferior/x));
            System.out.println("notas igual a 1: " +  ( notaIsUno));
            System.out.println("promedio mayores a 5 : " +  (sumaTotal/notas.length));
        }
    }
}

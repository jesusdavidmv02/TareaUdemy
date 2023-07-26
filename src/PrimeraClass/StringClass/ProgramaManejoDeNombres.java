/*
La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o
amigos como argumentos de línea de comandos.Se pide por cada nombre de la persona una nueva
variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le
concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe
quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
N.es_A.ia_E.pe
Preguntas de esta tarea
Publique acá su código fuente de la tarea, solo la clase main, recuerde probarlo antes en su IDE.*/

package PrimeraClass.StringClass;
import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static  void main(String[] args) {

        String nombre [] = new String[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nombre.length ; i++) {
            System.out.println("dijite el " + i +" nombre : " );
            nombre[i] = sc.nextLine();
        }

        String newName = "";

        for (int i = 0; i < nombre.length; i++) {
            if (i == (nombre.length-1)){
                newName +=  nombre[i].toUpperCase().charAt(1)  + "." + (nombre[i].substring(nombre[i].length()-2));
            } else {
                newName += nombre[i].toUpperCase().charAt(1)  + "." + (nombre[i].substring(nombre[i].length()-2)+"_");
            }
        }
        System.out.println("el Resusltado es : ");
        System.out.println(newName);

    }
}

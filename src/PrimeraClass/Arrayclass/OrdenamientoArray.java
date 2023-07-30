/**Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. Luego debemos mostrarlos en
 * el siguiente orden: el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
 Preguntas de esta tarea
 Cual es tu código fuente, envíalo acá*/
package ClaseBasicas.Arrayclass;

import java.util.Scanner;

public class OrdenamientoArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("digite los elementos ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("posición => " + i  +" valor =>" + array[i]);
        }
        System.out.println("###################################################");
        for (int i=0;i<=4;i++){
            System.out.println ("posición => " + i  +" valor =>" +array[i]);
            System.out.println("posición => " + i  +" valor =>"+array[9-i]);
        }
    }
}

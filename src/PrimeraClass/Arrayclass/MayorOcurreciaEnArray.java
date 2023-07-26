package PrimeraClass.Arrayclass;
import java.util.Scanner;

public class MayorOcurreciaEnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] array = new int [10];

        for (int i = 0; i < array.length; i++) {
            System.out.println( "digite los numeros ");
            array[i] = sc.nextInt();
        }

        int[] CantidadValores = new int[10];

        for (int i = 0; i < array.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    cantidad++;
                }
            }
            CantidadValores[i] = cantidad;
        }
        int indice = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (max < CantidadValores[i]) {
                max = CantidadValores[i];
                indice = i;
            }
        }
        System.out.println("La mayor ocurrencia es: " + max);
        System.out.println("El elemento que mas se repite es: " + array[indice]);
        System.out.println("el elemento " + array[indice] + " esta repetido " + max + " veces!");
    }
}

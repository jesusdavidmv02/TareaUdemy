package ClaseBasicas.MatrizClass;

import java.util.Scanner;

public class LaXenMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("De que tamaño quiere el arreglo?.");
        int cantidad = sc.nextInt();

        int[][]arreglo = new int[cantidad][cantidad];

        for ( int i=0; i < arreglo.length ;i++){
            for (int j=0;  j<arreglo.length;j++){
                int x = i + 1;
                if((i==j)  ||  (j == (cantidad - x))){
                    arreglo[i][j] = 1;
                    System.out.print(arreglo[i][j] + " ");
                }
                else{
                    arreglo[i][j] = 9;
                    System.out.print(arreglo[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}

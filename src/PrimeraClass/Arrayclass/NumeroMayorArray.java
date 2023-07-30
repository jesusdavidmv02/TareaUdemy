package ClaseBasicas.Arrayclass;
import java.util.Scanner;
public class NumeroMayorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dijite el tamaño de array");
        int x = sc.nextInt();
        int [] array = new int [x];
        for (int i = 0; i < array.length; i++) {
            System.out.println("digite numeros");
            array[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max =  (max >= array[i] )? max : array[i];
        }
        System.out.println("el max mas grande es : " + max);
    }
}

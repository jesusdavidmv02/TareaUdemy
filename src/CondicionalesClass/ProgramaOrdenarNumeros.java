package CondicionalesClass;
import java.util.Scanner;

public class ProgramaOrdenarNumeros {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("digite el primer  numero ");
        int num1 = sc.nextInt();

        System.out.println("digite el segundo numero ");
        int num2 = sc.nextInt();
        
        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;
        
        System.out.println("resultado = " + resultado);

    }
}

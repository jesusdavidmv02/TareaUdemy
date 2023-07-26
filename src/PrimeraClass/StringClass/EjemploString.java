package PrimeraClass.StringClass;

public class EjemploString {

    public static void main(String[] args) {

        String curso ="porgramación en java";
        String curso2 = new String("porgramación en java");
        
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);
        
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);

        String curso3 = "Programación en java"; 
        esIgual = curso == curso3;
        System.out.println("curso3 = " + curso3);
    }
}

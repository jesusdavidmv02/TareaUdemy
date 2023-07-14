package StringClass;

public class InmutabilidaString {

    public static void main(String[] args) {

        String  name = "jesus david mendoza vergara";
        String  materia = "Calculo - Vectorial - 02 " ;

        String resultado = name.concat(materia);
        System.out.println("-resultado = " + resultado);
        System.out.println("-materia = " + materia);
        System.out.println("-name = " + name);
        System.out.println(name == resultado);

        String resultadolambda = name.transform( c ->{
           return  c + " con " +  materia;
        });

        System.out.println("-resultadolambda = " + resultadolambda);


    }
}

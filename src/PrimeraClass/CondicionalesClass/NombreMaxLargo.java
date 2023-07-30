package ClaseBasicas.CondicionalesClass;

import javax.swing.*;

public class NombreMaxLargo {

    public static void main(String[] args) {

        String nombre1 , nombre2, nombre3 ;

        nombre1 = JOptionPane.showInputDialog(null,"Digite su nombre y apellido");
        nombre2 = JOptionPane.showInputDialog(null,"Digite su nombre y apellido");
        nombre3 = JOptionPane.showInputDialog(null,"Digite su nombre y apellido");


        String max =  nombre1.length() < nombre2.length()   ? nombre1 : nombre2;
        max = nombre3.length() < max.length() ?  max : nombre3  ;

        JOptionPane.showMessageDialog(null,"El nombre mas largo es el de : " + max);

    }
}

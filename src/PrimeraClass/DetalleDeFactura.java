/*
La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura,
se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
Por ejemplo, el resultado podría ser algo así:
La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882

        IMPORTANTE: Como nota aparte todas las tareas publicadas en el curso son opcionales,
        no afecta en nada en el avance del curso ni en el temario, tampoco afecta en la entrega
        final del diploma o reconocimiento por haber finalizado el curso, son 100% opcionales y
        todas traen incluidas el código de solución.
        Así es como funciona el sistema de tareas de udemy, las tareas no quedan marcadas con
        checked (como realizadas), esta funcionalidad no tiene nada que ver con nuestro curso
        ni el instructor, así es como funciona la plataforma de Udemy.
*/


import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        String factura ;
        String detalle ;
        double precioProducto ;
        double precioProducto_02 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el nombre de la factura ");
        factura = sc.nextLine();

        System.out.println("Digite el Detalle de la factura ");
        detalle = sc.nextLine();

        System.out.println("Digite el precio 1 de producto ");
        precioProducto = sc.nextDouble();

        System.out.println("Digite el precio 2 de producto ");
        precioProducto_02 = sc.nextDouble();

        double total = precioProducto_02 + precioProducto;

        System.out.println("########### " + factura + "############\n" +
                " "+detalle + "\n " + " \n precio de el producto 1 : _____  " + precioProducto
                + " \n precio de el producto 2 :____ " + precioProducto_02
                + " \n subtotal __________ " + total
                + " \n el iva %19 ___________" + (total * 0.19)
                + " \n total _______ " + ((total * 0.19) + total)
        );



    }
}
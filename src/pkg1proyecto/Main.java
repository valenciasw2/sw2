/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1proyecto;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     * EJEMPLO
     */
    public static void main(String[] args) {

        System.out.println("ingrese lo que desea realizar:"
                + "para pagos- 1"
                + "para libros- 2"
                + "para membresia- 3");
        Scanner leer = new Scanner(System.in);
        ejecutarOpcion(leer.nextInt());
    }

    public static void ejecutarOpcion(int opcionSeleccionada) {
        pago pag = new pago();
        switch (opcionSeleccionada) {

            case 1: {

                pag.generar_orden_compra();
                pag.orden_de_entrega_libros();
                break;

            }
            case 2: {

                pag.orden_de_entrega_libros();

                break;

            }
            case 3: {

                pag.activacion();

                break;

            }
            case 4: {

                pag.video_compra();
                break;
            }
            case 5: {
                pag.actualizar();
                break;
            }

        }
    }
}

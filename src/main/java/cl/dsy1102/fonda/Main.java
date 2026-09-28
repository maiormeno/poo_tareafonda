package cl.dsy1102.fonda;

import java.util.List;

/**
 * Punto de entrada de la Tarea Fiestas Patrias - Fonda San Belarmino.
 *
 * Revisa el enunciado en README.md. Debes crear, en este mismo paquete,
 * las clases del diagrama: Bebida, BebidaAlcoholica, BebidaSinAlcohol,
 * la interfaz ConsumoResponsable y la clase GestorFonda.
 */
public class Main {

    public static void main(String[] args) {

        // TODO 1: instanciar las cuatro bebidas con los datos del enunciado.

        Bebida chicha = new BebidaAlcoholica("Chicha", 1000, 40, 1, 12,false, false);

        Bebida chichaSinAlcohol = new BebidaSinAlcohol("Chicha", 1000, 60, 95);
        Bebida moteConHuesillo = new BebidaSinAlcohol("Mote con Huesillo", 400, 50, 70);

        // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.

        System.out.println("Tiene venta restringida?:" + ((ConsumoResponsable) chicha).tieneVentaRestringida());
        ((ConsumoResponsable)chicha).restringirVenta();
        System.out.println("Tiene venta restringida?:" + ((ConsumoResponsable) chicha).tieneVentaRestringida());

        // TODO 3: registrarlas todas en el gestor.

        GestorFonda administrador = new GestorFonda(); //Asi entiendo la informacion del gestor

        administrador.registrar(chicha);
        administrador.registrar(chichaSinAlcohol);
        administrador.registrar(moteConHuesillo);


        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.

        administrador.vender("Chicha", 1);



        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.

        List<Bebida> resultado = administrador.buscarPorNombre("Chicha");


        for(Bebida bebida: resultado) {
            System.out.println(bebida.obtenerDetalle());
        }


        System.out.println("Proyecto listo. Comienza por la clase Bebida.");
    }
}

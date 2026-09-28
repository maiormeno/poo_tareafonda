package cl.dsy1102.fonda;

import java.util.*;

public class GestorFonda {
    private List<Bebida>bebidas;

    //Constructor
    public GestorFonda() {
        this.bebidas = new ArrayList<Bebida>();

    }
//G y S
    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    //Metodo
    public void registrar(Bebida bebestible) {
        this.bebidas.add(bebestible);
    }

    public List<Bebida> buscarPorNombre(String nombre) {

        List<Bebida> busqueda = new ArrayList<Bebida>();

        for(Bebida x : this.bebidas) {

            if (x.getNombre().equals(nombre)) {
                busqueda.add(x);
            }
            /*if(x.getNombre() == nombre) {
                return
            } else {

            }*/
        }
        return busqueda;
    }

    public void vender(String nombre, int unidades) {

        for(Bebida x : this.bebidas) {

            if (x.getNombre().equals(nombre)) {

                if(x instanceof BebidaAlcoholica && x.getStock() > unidades && unidades <= 3) {

                    if(((BebidaAlcoholica) x).tieneVentaRestringida()) {
                        System.out.println("No se puede vender.");
                    } else {
                        //unidades tiene limite
                        double precioBebidaAlcoholica = x.calcularPrecio() * unidades;
                        System.out.println("Venta aprobada, precio final: " + precioBebidaAlcoholica);
                    }
                } else{
                    if(x.getStock() > unidades) {
                        double precioBebidaSinAlcohol = x.calcularPrecio() * unidades;
                        System.out.println("Precio final bebida sin alcohol: " + precioBebidaSinAlcohol);
                    } else {
                        System.out.println("No se puede vender.");
                    }

                }

            }
        }
    }
}

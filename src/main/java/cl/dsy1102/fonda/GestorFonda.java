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
}

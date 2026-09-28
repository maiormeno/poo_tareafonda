package cl.dsy1102.fonda;

import java.util.*;

public class BebidaSinAlcohol extends Bebida{
    //ATRIBUTOS
    private int azucarPorLitro;

    //CONSTRUCTORES
    public BebidaSinAlcohol(String nombre, int volumenML, int stock, int azucarPorLitro) {
        super(nombre, volumenML, stock);
        //Utilizo super porque es la clase hija (subclase)
        this.azucarPorLitro = azucarPorLitro;
    }

    //METODOS

    //GETTER Y SETTERS
    public int getAzucarPorLitro() {
        return azucarPorLitro;
    }

    public void setAzucarPorLitro(int azucarPorLitro) {
        this.azucarPorLitro = azucarPorLitro;
    }

    //METODOS DE COMPORTAMIENTO
    @Override
    public double calcularPrecio() {

        if(azucarPorLitro <= 80) {
            return 2000;
        } else {
            return 2000 * 1.10;
        }
    }

    @Override
    public String obtenerDetalle() {
        return "lol";
    }
}


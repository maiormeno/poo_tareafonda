package cl.dsy1102.fonda;

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
        return 0;
    }

    @Override
    public String obtenerDetalle() {
        return "";
    }
}


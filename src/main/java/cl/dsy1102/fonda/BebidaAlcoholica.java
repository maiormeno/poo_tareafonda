package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable{
    //ATRIBUTOS
    public int LIMITE_UNIDADES_POR_CLIENTE;
    private double gradosAlcohol;
    private boolean certificada;
    private boolean ventaRestringida;

    //CONSTRUCTORES
    public BebidaAlcoholica(String nombre, int volumenML, int stock, int LIMITE_UNIDADES_POR_CLIENTE,
                            double gradosAlcohol, boolean certificada, boolean ventaRestringida) {
        //Se utiliza super para traer los constructores de la superclase a la subclase
        super(nombre, volumenML, stock);

        this.LIMITE_UNIDADES_POR_CLIENTE = LIMITE_UNIDADES_POR_CLIENTE;
        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = false;

    }

    //METODOS

    //GETTER Y SETTERS

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public boolean isCertificada() {
        return certificada;
    }

    public void setCertificada(boolean certificada) {
        this.certificada = certificada;
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

    public boolean tieneVentaRestringida() {
        return false;
    }

    public void restringirVenta() {
        this.ventaRestringida = true;
    }

    public boolean superaLimite(int unidades) {
        return false;
    }
}

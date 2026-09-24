package cl.dsy1102.fonda;

public abstract class Bebida {
    //ATRIBUTOS
    //Uso protected porque es la clase padre (superclase)
    protected String nombre;
    protected int volumenML;
    protected int stock;

    //CONSTRUCTOR
    public Bebida(String nombre, int volumenML, int stock) {
        this.nombre = nombre;
        this.volumenML = volumenML;
        this.stock = stock;
    }
    //METODOS
    //GETTER Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVolumenML() {
        return volumenML;
    }

    public void setVolumenML(int volumenML) {
        this.volumenML = volumenML;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //METODOS DE COMPORTAMIENTO
    public abstract double calcularPrecio();

    public abstract String obtenerDetalle();

    @Override
    public String toString() {
        return super.toString();
    }
}

